public class Enfermedades{
{System.out.println("A");}

    public Enfermedades() {
        System.out.println("B");
    }

    public static class Gripe extends Enfermedades {
        static { System.out.println("C"); }
        { System.out.println("E"); }
        static { System.out.println("F"); }
    }

    public static class Fiebre extends Gripe {
        public static void main(String[] args) {
            System.out.println("G");
            new Fiebre();
            System.out.println("H");
        }
    }

    public static void main(String[] args) {
        new Fiebre();
    }
}