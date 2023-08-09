public class Mconretorno {
    
    public static int obtenercuadrado(int num){
        return num * num ;
    }


    public static void main(String[] args) {
        int numero = 5;
        int resultado = obtenercuadrado(numero);
        System.out.println(" el cuadrado de "+ numero + " es : "+ resultado);
    }
}


/* Métodos con retorno (return methods):
Son métodos que devuelven un valor después de realizar una tarea.
Se definen con un tipo de dato de retorno que indica qué tipo de valor se devuelve.
Se usa la palabra clave return para devolver el valor deseado. */