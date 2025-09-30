package org.example;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Introduce el valor de la base:");
            int b = teclado.nextInt();

            while (b < 0) {

                System.out.println("Introduce el valor de la base tiene que ser positivo");
                b = teclado.nextInt();

            }

            System.out.println("Introduce el valor de la altura");
            int h = teclado.nextInt();

            while (h < 0) {

                System.out.println("Introduce el valor de la altura tiene que ser positivo");
                h = teclado.nextInt();

            }


            float area = (float) (b * h) / 2;
            System.out.println("El área del triángulo es " + area);

        } catch (Exception e) {
            System.out.println("Solo se pueden introducir números");
        }

    }
}
