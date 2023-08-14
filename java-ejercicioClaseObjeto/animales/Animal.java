public class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void come() {
        System.out.println(nombre + " esta comiendo.");
    }

    public void duerme() {
        System.out.println(nombre + " esta durmiendo.");
    }
}