public class Minstancia {
    
    private int numero;

    public Minstancia(int num){
         this.numero = num;
    }

    public void imprimirNumero(){
        System.out.println("El numero es : " + numero);
    }


    public static void main(String[] args) {
        Minstancia ejemplo = new Minstancia(56);
        ejemplo.imprimirNumero();
    }
}


/* Métodos de instancia (instance methods):
Estos métodos pertenecen a una instancia particular de la clase y actúan sobre los datos de esa instancia.
Se llaman en el contexto de un objeto y pueden acceder a las variables de instancia.
Se definen sin la palabra clave static. */

