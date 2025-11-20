package tema3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BateriaEjerciciosMatrices1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int matriz[][] = new int [3] [3];
        System.out.println("Introduce tu matriz");

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = teclado.nextInt();
                }
            }


            for (int fila[] : matriz) {

                System.out.println(Arrays.toString(fila));

            }

            System.out.println("Introduce el número a buscar");
            int num = teclado.nextInt();

            parar:
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] == num) {
                        System.out.println("El número " + num + " de la matriz, se encuentra en la posición (" + i + "," + j + ")");
                        break parar;
                    }   else {
                        System.out.println("El número no se encuentra en el bucle");
                        break parar;
                    }
                }
            }
    }
}

class BateriaEjerciciosMatrices2 {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        int matriz[][] = new int [aleatorio.nextInt(5)+1] [aleatorio.nextInt(5)+1];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(25)+10;
            }
        }

        for (int fila[] : matriz) {
            for (int num : fila) {
                System.out.print(num + " ");
            }

            System.out.println();
        }


    }
}
