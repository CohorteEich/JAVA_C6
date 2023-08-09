import java.util.Scanner;

public class MayorDeDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        
        double mayor = obtenerMayor(num1, num2);
        System.out.println("El número mayor es: " + mayor);
        
        scanner.close();
    }

    public static double obtenerMayor(double num1, double num2) {
        return Math.max(num1, num2);
    }
}