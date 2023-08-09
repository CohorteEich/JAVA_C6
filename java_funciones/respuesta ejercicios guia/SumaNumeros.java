import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero positivo: ");
        int n = scanner.nextInt();
        
        int suma = calcularSumaNumeros(n);
        System.out.println("La suma de los primeros " + n + " números es: " + suma);
        
        scanner.close();
    }

    public static int calcularSumaNumeros(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
}
