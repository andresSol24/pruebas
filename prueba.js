// Generate random numbers with user names and IDs
function generateRandomNumbers(users) {
    const randomNumbers = [];
    
    for (const user of users) {
        const randomNumber = Math.floor(Math.random() * 100) + 1;
        const userWithNumber = {
            name: user.name,
            id: user.id,
            number: randomNumber
        };
        randomNumbers.push(userWithNumber);
    }
    
    return randomNumbers;
}

// Example usage
const users = [
    { name: "John", id: 1 },
    { name: "Jane", id: 2 },
    { name: "Mike", id: 3 }
];

const randomNumbers = generateRandomNumbers(users);
console.log(randomNumbers);