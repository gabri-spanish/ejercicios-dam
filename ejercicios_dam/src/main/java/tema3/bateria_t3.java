package tema3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class bateria_t3 {
    public static void main (String[] args) {

        Random aleatorio = new Random();
        int resultado = 0;
        int vector [] = new int [8];

        for (int i=0; i<vector.length; i++) {

            vector[i] = aleatorio.nextInt(500-0+1);
            resultado += vector[i] + vector[i];

        }

        System.out.println(Arrays.toString(vector));
        System.out.println("El resultado es: " + resultado);


    }
}

class act2 {
    public static void main (String[] args) {

        int vector [] = {1,4,6,3,9};
        int aux = 0;

        for (int i=0; i<vector.length/2;i++) {
            aux = vector[i];
            vector[i] = vector[vector.length-1-i];
            vector[vector.length-1-i] = aux;
        }

        System.out.println(Arrays.toString(vector));

    }
}


class act3 {
    public static void main (String[] args) {

        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        int vector [] = new int [25];
        int contador = 0;

        for (int i=0; i<vector.length;i++) {
            vector[i] = aleatorio.nextInt(100-0+1);
        }

        System.out.println(Arrays.toString(vector));

        System.out.println("Introduce el número que quieres buscar en el array [0-100]");
        int arr = teclado.nextInt();

        if (arr < 0 && arr > 100) {

            System.out.println("Número no permitido");
            return;

        }

        for (int i=0; i< vector.length; i++) {

            if (vector[i] == arr) {
                contador++;
            }

        }

        System.out.println("El número " + arr + " aparece " + contador + " veces.");


    }
}

class act4 {
    public static void main (String[] args) {


        Scanner teclado = new Scanner(System.in);
        int vector [] = new int [5];
        int aux = 0;

        System.out.println("Crea tu array");
        for (int i=0; i<vector.length;i++) {
            vector[i] = teclado.nextInt();
        }
        System.out.println("");

        System.out.println(Arrays.toString(vector));
        System.out.println("Escribe una posición que eliminar del array");
        int pos = teclado.nextInt();

        System.out.println(Arrays.toString(vector));

    }
}
