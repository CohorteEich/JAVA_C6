public class Animales {
    public static void main(String[] args) {
     
        Carnivoro leon = new Carnivoro("leoncito",5," carne");
        leon.come();
        leon.duerme();
        leon.comer();
        System.out.println("el carnivoro come" + leon.getcomeMetodo());

        Herviboro oso = new Herviboro("susi",3," frutas");
        oso.come();
        oso.duerme();
        oso.comer();
        System.out.println(" El animal Come " + oso.getcomeMetodoo());


    }
}
