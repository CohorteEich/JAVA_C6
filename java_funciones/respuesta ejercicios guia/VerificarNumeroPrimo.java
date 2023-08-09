import java.util.Scanner;

public class VerificarNumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();
        
        boolean esPrimo = verificarPrimo(num);
        if (esPrimo) {
            System.out.println(num + " es un número primo.");
        } else {
            System.out.println(num + " no es un número primo.");
        }
        
        scanner.close();
    }

    public static boolean verificarPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}