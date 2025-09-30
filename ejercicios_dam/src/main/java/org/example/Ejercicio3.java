package org.example;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Introduzca un número: ");
            int numero = teclado.nextInt();

            if (numero == 0) {

                System.out.println("El número es cero");

            } else if (numero < 0) {

                System.out.println(numero + " es negativo");

            } else {

                System.out.println(numero + " es positivo");

            }

        }

        catch (Exception e) {

            System.out.println("Solo se permite introducir números");

        }

    }
}
