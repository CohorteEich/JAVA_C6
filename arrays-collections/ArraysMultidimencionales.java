public class ArraysMultidimencionales {
    
    public static void main(String[] args) {
        
        int[][] matriz = new int[2][2];

        matriz[0][0] = 4;
        matriz[0][1] = 4;
        matriz[1][0] = 7;
        matriz[1][1] = 6;

        int filas, columnas;

        for (filas = 0; filas < matriz.length; filas++){
            System.out.println(" ");
            //recorrer columnas para inyectar el valor de la posicion
            for (columnas = 0; columnas < matriz.length; columnas++) {
                System.out.println(matriz[filas][columnas] + " ");
            }
            System.out.print("");

        }

    }
}
