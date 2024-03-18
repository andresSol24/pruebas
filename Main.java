import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String usuarioCorrecto = "admin";
        String contrasenaCorrecta = "8979";

        String usuarioIngresado = JOptionPane.showInputDialog("Ingresa el nombre de usuario:");



        String contrasenaIngresada = JOptionPane.showInputDialog("Ingresa la contraseña:");

        if (usuarioIngresado.equals(usuarioCorrecto) && contrasenaIngresada.equals(contrasenaCorrecta)) {
            JOptionPane.showMessageDialog(null, "¡Bienvenido! Acceso concedido.");
        } else {
            JOptionPane.showMessageDialog(null, "Error: Usuario o contraseña incorrectos.");


        }
    }
}

