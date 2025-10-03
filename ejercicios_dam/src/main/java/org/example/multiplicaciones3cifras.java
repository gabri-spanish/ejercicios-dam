package org.example;
import java.util.Scanner;

public class multiplicaciones3cifras {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {

            System.out.println("Introduce el primer número de 3 cifras: ");
            int numpri = teclado.nextInt();

            String numpri_string = Integer.toString(numpri);

            while (numpri < 100 || numpri > 999) {

                System.out.println("Este número no es de 3 cifras");

                System.out.println("Introduce el primer número de 3 cifras: ");
                numpri = teclado.nextInt();
                numpri_string = Integer.toString(numpri);

            }


            System.out.println("Introduce el segundo número de 3 cifras: ");
            int numsec = teclado.nextInt();

            String numsec_string = Integer.toString(numsec);

            while (numsec < 100 || numsec > 999) {

                System.out.println("Este número no es de 3 cifras");

                System.out.println("Introduce el segundo número de 3 cifras: ");
                numsec = teclado.nextInt();
                numsec_string = Integer.toString(numsec);


            }


            int resultado = numpri * numsec;

            String numpri1 = numpri_string.substring(2);
            int numeropri1_int = Integer.parseInt(numpri1);
            // numeropri1_int

            String numpri_string2 = Integer.toString(numpri);
            String numpri2 = numpri_string.substring(1, 2);
            int numeropri2_int = Integer.parseInt(numpri2);
            // numeropri2_int

            String numpri_string3 = Integer.toString(numpri);
            String numpri3 = numpri_string.substring(0, 1);
            int numeropri3_int = Integer.parseInt(numpri3);
            // numeropri3_int

            String numsec1 = numsec_string.substring(2);
            int numsec1_int = Integer.parseInt(numsec1);
            // numsec1_int

            String numsec_string2 = Integer.toString(numsec);
            String numsec2 = numsec_string.substring(1, 2);
            int numsec2_int = Integer.parseInt(numsec2);
            // numsec2_int

            String numsec_string3 = Integer.toString(numsec);
            String numsec3 = numsec_string.substring(0, 1);
            int numsec3_int = Integer.parseInt(numsec3);
            // numsec3_int

            System.out.println("Proceso: ");
            System.out.println("      " + numpri);
            System.out.println(" x    " + numsec);
            System.out.println("----------");
            System.out.println("      " + numeropri3_int * numsec1_int + "" + numeropri2_int * numsec1_int + "" + numeropri1_int * numsec1_int);
            System.out.println("     " + numeropri3_int * numsec2_int + "" + numeropri2_int * numsec2_int + "" + numeropri1_int * numsec2_int + "X");
            System.out.println("    " + numeropri3_int * numsec3_int + "" + numeropri2_int * numsec3_int + "" + numeropri1_int * numsec3_int + "XX");
            System.out.println("----------");
            System.out.println("    " + resultado);

        } catch (Exception e) {

            System.out.println("Formato incorrecto, por favor, utiliza SOLO NÚMEROS");

            }

    }
}
