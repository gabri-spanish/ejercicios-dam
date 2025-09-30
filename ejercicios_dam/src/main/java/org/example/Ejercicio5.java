package org.example;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        boolean control = true;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el dividendo: ");
        int dividendo = teclado.nextInt();


        try {
                System.out.println("Introduzca el divisor: ");
                int divisor = teclado.nextInt();
                double total = dividendo / divisor;
                System.out.println("El resultado de la división es " + total);

        }

        catch (Exception e) {

                System.out.println("No se puede dividir entre cero.");

        }


    }

}