package tema3;

import java.util.Arrays;
import java.util.Scanner;

public class Practica3_ZXSpectrum {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        System.out.println("****** VALIDADOR DE COMPATIBILIDAD ZX SPECTRUM ******");
        System.out.println("Introduce la resolución de tu pantalla (ancho x alto)...");
        System.out.println("Ancho:");
        int ancho = teclado.nextInt();
        System.out.println("Alto:");
        int alto = teclado.nextInt();

        if (ancho % 8 != 0 || ancho >= 48 || alto % 8 != 0 || ancho>=48) {
            System.out.println("RESOLUCIÓN INCORRECTA");
            return;
        }

        final int bloque = ancho/2;

        teclado.nextLine();

        String matriz[][] = new String [ancho][alto];

        System.out.println("Introduce (línea a línea) los colores de tu imagen para cada píxel:");
        externo:
        for (int i=0;i<ancho;i++) {
          if (matriz[i][0].length() > alto) {
              break externo;
          }
            System.out.println();
        }

        teclado.nextLine();

        for (String[] fila : matriz) {
            for (String valor : fila) {
                System.out.println(valor + " ");
            }
        }

    }
}
