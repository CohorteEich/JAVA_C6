import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(30);
        numbers.add(80);

        // imprimir numeros
        System.out.println(numbers);

        // modificar un elemento
        numbers.set(0, 20);
        System.out.println(numbers);

        // eliminar un elemento
        numbers.remove(1);
        System.out.println(numbers);

        // obtener un elemento
        System.out.println(numbers.get(0));

        // obtener el tamaño
        System.out.println(numbers.size());

        numbers.add(10);
        numbers.add(30);
        numbers.add(80);

        // recorrer un arraylist
        System.out.println("Recorrer un arraylist");
        for (Integer number : numbers) {
            System.out.println(number);
        }

    }

}
