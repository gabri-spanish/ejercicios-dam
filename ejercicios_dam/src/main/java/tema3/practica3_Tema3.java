package tema3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class practica3_Tema3 {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        Scanner teclado = new Scanner(System.in);
        int reintegro_tuyo[] = new int[1];

        System.out.println("Introduce tu combinación");
        String numero_tuyo = teclado.next();
        boolean comprobar = numero_tuyo.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1}");

        if (comprobar) {

            String vector[] = numero_tuyo.split("[-/]");
            int vector_num[] = new int [vector.length];
            System.out.println(Arrays.toString(vector));

            for (int i=0; i< vector.length; i++) {
                vector_num[i] = Integer.parseInt(vector[i]);
            }

            System.out.println(Arrays.toString(vector));
        }

    }
}
