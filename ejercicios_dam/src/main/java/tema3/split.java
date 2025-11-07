package tema3;

import java.util.Arrays;
import java.util.Scanner;

public class split {
    public static void main(String[] args) {

        String cadena = "1,2,3,4,5,6";

        String profesores [] = cadena.split(",");

        System.out.println(Arrays.toString(profesores));

        int vector [] = new int [profesores.length];

        for (int i=0; i< profesores.length;i++) {

            vector[i] = Integer.parseInt(profesores[i]);

        }

        System.out.println(Arrays.toString(vector));

    }
}