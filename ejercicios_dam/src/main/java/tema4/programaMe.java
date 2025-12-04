package tema4;

import java.util.Arrays;
import java.util.Scanner;

public class programaMe {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double dias[] = new double[6];
        recaudar();
        ventas(dias);

    }

    public static double[] recaudar() {

        Scanner teclado = new Scanner(System.in);
        double dias[] = new double[6];

        for (int i = 0; i < dias.length; i++) {
            System.out.print("Dia " + (i+1) + ": ");
            dias[i] = teclado.nextDouble();
        }
        return dias;

    }

    public static double[] ventas(double dias[]) {

        int contador = 0;
        for (int i = 0; i < dias.length; i++) {
            if (dias[i+1]-1 > dias[i]) {
                contador++;
            }
        }

        System.out.println(contador);

        return dias;

    }


}
