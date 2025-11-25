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

        String matriz[][] = new String [alto][ancho];

        System.out.println("Introduce (línea a línea) los colores de tu imagen para cada píxel:");
        externo:
        for (int i=0;i<matriz.length;i++) {
            String letra = teclado.next();
            String letrasplit[] = letra.split("");
          if (letra.matches("[A-Oa-o]+") && letrasplit.length == ancho) {
              for (int j = 0; j < matriz[i].length; j++) {
                  matriz[i][j] = letrasplit[j];
              }
          } else {
              System.out.println("Valor inválido");
              i--;
          }
        }

        teclado.nextLine();

        for (String[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }

        int conta = 0;

        for (int i=0; i< matriz.length;i++) {

        }

    }
}
