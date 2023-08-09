import java.util.ArrayList;
import java.util.List;

public class DatosDinamicos {

    public static void main(String[] args) {

        // List<String> animales = new ArrayList<>();

        // animales.add("León");
        // animales.add("Tigre");
        // animales.add("Gato");
        // animales.add("Perro");

        // System.out.println("Primer array: " + animales);

        // animales.add("Elefante");
        
        // System.out.println("Segundo array: " + animales);

        // animales.remove(0);

        // System.out.println( "Tercer array: " + animales) ;

        List<String> leguajesDeProgramacion = new ArrayList<>();
        List<String> tipoDeZapatos = new ArrayList<>();
        

        leguajesDeProgramacion.add("JavaScript");
        leguajesDeProgramacion.add("Java");
        leguajesDeProgramacion.add("C++");
        leguajesDeProgramacion.add("Python");

        // System.out.println(leguajesDeProgramacion);

        for (int i = 0; i < leguajesDeProgramacion.size(); i++){
            System.out.println(" Leguaje de programación: " + leguajesDeProgramacion.get(i) );
        }

    }

}
