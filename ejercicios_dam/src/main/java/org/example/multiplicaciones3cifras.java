package org.example;
import java.util.Scanner;

public class multiplicaciones3cifras {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer número de 3 cifras: ");
        int numpri = teclado.nextInt();

        System.out.println("Introduce el segundo número de 3 cifras: ");
        int numsec = teclado.nextInt();

        int resultado = numpri*numsec;

        String numpri_string = Integer.toString(numpri);
        String numpri1 = numpri_string.substring(2);
        int numeropri1_int = Integer.parseInt(numpri1);
        System.out.println(numeropri1_int);

        String numpri_string2 = Integer.toString(numpri);
        String numpri2 = numpri_string.substring(1,2);
        int numeropri2_int = Integer.parseInt(numpri2);
        System.out.println(numeropri2_int);

        String numpri_string3 = Integer.toString(numpri);
        String numpri3 = numpri_string.substring(0,1);
        int numeropri3_int = Integer.parseInt(numpri3);
        System.out.println(numeropri3_int);

        String numsec_string = Integer.toString(numsec);
        String numsec1 = numsec_string.substring(2);
        int numsec1_int = Integer.parseInt(numsec1);
        System.out.println(numsec1_int);

        String numsec_string2 = Integer.toString(numsec);
        String numsec2 = numsec_string.substring(1,2);
        int numsec2_int = Integer.parseInt(numsec2);
        System.out.println(numsec2_int);

        String numsec_string3 = Integer.toString(numsec);
        String numsec3 = numsec_string.substring(0,1);
        int numsec3_int = Integer.parseInt(numsec3);
        System.out.println(numsec3_int);

        System.out.println("Proceso: ");
        System.out.println("      "+numpri);
        System.out.println(" x    "+numsec);
        System.out.println("----------");
        System.out.println("   "+numeropri3_int*numsec1_int+""+numeropri2_int*numsec1_int+""+numeropri1_int*numsec1_int);


    }
}
