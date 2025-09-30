package org.example;

import java.util.Scanner;

public class ratónjuguetón {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        System.out.println("***BIENVENIDO AL RATÓN MATÓN***");

        System.out.println("Introduce tu altura: ");
        int numero = teclado.nextInt();

        if (numero == 0) {

            System.out.println("El número es cero");

        } else if (numero < 0) {

            System.out.println(numero + " es negativo");

        } else {

            System.out.println(numero + " es positivo");

        }

    }


    }
}