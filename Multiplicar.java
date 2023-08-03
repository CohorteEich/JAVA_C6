import java.util.Scanner;

public class Multiplicar {
    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un número: ");
        num = consola.nextInt();

        if(num <= 0){
            System.out.println("EL número es 0 o negativo");
            return;
        } else {
            for ( int i = 1; i <= 10; i++){
            System.out.println(num + "x" + i + "=" + (num*i));
        }
        }       

    }
}
