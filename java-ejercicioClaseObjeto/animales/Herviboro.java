public class Herviboro extends Animal{
    private String comeMetodo;

    public Herviboro (String nombre, int edad, String comeMetodo){
        super(nombre, edad);
        this.comeMetodo = comeMetodo;    
    }

    public String getcomeMetodoo(){
        return comeMetodo;
    }

    public void comer() {
        System.out.println(getNombre() + " esta comiendo" + comeMetodo + ".");
    }
}
