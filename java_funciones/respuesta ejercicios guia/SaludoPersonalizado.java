import java.util.Scanner;

public class SaludoPersonalizado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        String saludo = generarSaludoPersonalizado(nombre);
        System.out.println(saludo);
        
        scanner.close();
    }

    public static String generarSaludoPersonalizado(String nombre) {
        return "¡Hola, " + nombre + "! ¡Bienvenida!";
    }
}