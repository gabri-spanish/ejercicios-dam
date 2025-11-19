package tema3;

import java.util.Arrays;
import java.util.Random;

class EjemplosMatrices2 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int filas = aleatorio.nextInt(6)+2;
        int matriz[][] = new int[filas][filas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(50) + 1;
            }
        }

        for (int fila[] : matriz) {
            System.out.println(Arrays.toString(fila));
        }

        for (int i=0; i< matriz.length;i++) {
            for (int j=0;j<matriz[i].length; j++) {

                if (i==j) {
                    System.out.println(matriz[i][j] + " ");
                }

            }
        }
    }
}

class Inverso {
    public static void main(String[] args) {

        Random aleatorio = new Random();
        int filas = aleatorio.nextInt(6)+2;
        int matriz[][] = new int[filas][filas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(50) + 1;
            }
        }

        for (int fila[] : matriz) {
            System.out.println(Arrays.toString(fila));
        }

        for (int i=0; i< matriz.length;i++) {
                    System.out.println(matriz[i][matriz.length-1-i] + " ");

        }

    }
}

class Ejercicio2 {
    public static void main(String[] args) {
        int matriz1[][] = {{1,2,3,4},{5,4,6,7},{6,9,10,12}};
        int matriz2[][] = {{6,3,2,5},{10,1,9,12},{11,7,4,8}};
        int solucion[][] = new int [3][4];

        for (int i=0; i < matriz1.length;i++) {
            for (int j=0;j<matriz1[i].length; j++) {
                if (matriz1[i][j] > matriz2[i][j]) {
                    solucion[i][j] = matriz1[i][j];
                } else {
                    solucion[i][j] = matriz2[i][j];
                }
            }
        }

        for (int fila[] : solucion) {
            System.out.println(Arrays.toString(fila));
        }
    }
}
