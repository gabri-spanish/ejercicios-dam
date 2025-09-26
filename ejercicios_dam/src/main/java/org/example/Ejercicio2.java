package org.example;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        int JORNADA = 40;
        double PLUS_EXTRA = 1.5;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca las horas: ");
        int horas = teclado.nextInt();

        System.out.println("Introduce la tarifa por hora: ");
        int tarifa = teclado.nextInt();

        if (horas > JORNADA ) {
            double extra = horas - JORNADA;
            double tarifa_extra = tarifa * PLUS_EXTRA;
            double salario_extra = extra * tarifa_extra;

            System.out.println("Salario (con extra). " + (salario_extra + JORNADA * tarifa) + "€");
        }

        else {
            double salario = horas * tarifa;

            System.out.println("Tu salario es " + salario + "€");
        }
    }
}