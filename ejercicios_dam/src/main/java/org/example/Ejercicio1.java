package org.example;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca las horas: ");
        int horas = teclado.nextInt();

        System.out.println("Introduce la tarifa por hora: ");
        int tarifa = teclado.nextInt();

        int total = horas * tarifa;
        System.out.println("Tu salario es " + total +"€");

    }
}
