package org.example;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        boolean control = true;

        Scanner teclado = new Scanner(System.in);

        int horas = 0;
        int tarifa = 0;
        do {

            try {
                System.out.println("Introduzca las horas: ");
                horas = teclado.nextInt();

                System.out.println("Introduce la tarifa por hora: ");
                tarifa = teclado.nextInt();

                control = false;

            } catch (Exception e) {

                System.out.println("Solo se pueden introducir números, hazlo otra vez");

            }
            teclado.nextLine();
        } while (control == true);

        double total = horas * tarifa;
        System.out.println("Tu salario es " + total + "€");

    }
}
