public class Mestatico {
    
    public static int sumar (int a , int b){
        return a + b;
    }

    public static void main(String[] args) {
        int resultado = sumar(6,6);
        System.out.println("La suma de ambos numeros es " + resultado);
    }
}

/* 
Métodos estáticos (static methods):
Estos métodos pertenecen a la clase en lugar de una instancia específica de la clase.
Se pueden invocar utilizando el nombre de la clase directamente, sin necesidad de crear un objeto.
Son útiles cuando la funcionalidad que proporcionan no necesita acceder a variables de instancia.
Se definen usando la palabra clave static. */
