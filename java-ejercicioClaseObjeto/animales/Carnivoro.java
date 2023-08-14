public class Carnivoro extends Animal{
    private String comeMetodo;

    public Carnivoro (String nombre, int edad, String comeMetodo){
        super(nombre, edad);
        this.comeMetodo=comeMetodo;    
    }

    public String getcomeMetodo(){
        return comeMetodo;
    }

    public void comer() {
        System.out.println(getNombre() + " esta comiendo" + comeMetodo + ".");
    }
}
