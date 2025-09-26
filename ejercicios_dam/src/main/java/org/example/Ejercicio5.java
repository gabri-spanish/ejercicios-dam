package org.example;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el dividendo: ");
        int dividendo = teclado.nextInt();

        System.out.println("Introduzca el divisor: ");
        int divisor = teclado.nextInt();

        if ( divisor == 0 ){

            System.out.println("ERROR: no se puede dividir entre 0");

        }

        else {

            double total = dividendo / divisor;
            System.out.println("El resultado de la división es " + total);


        }


    }
}
