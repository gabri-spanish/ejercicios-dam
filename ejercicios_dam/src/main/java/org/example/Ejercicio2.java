package org.example;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        boolean control = true;

        int JORNADA = 40;
        float PLUS_EXTRA = (float) 1.5;

        Scanner teclado = new Scanner(System.in);
        int horas = 0;
        int tarifa = 0;

        do {
        try {
            System.out.println("Introduzca las horas: ");
            horas = teclado.nextInt();

            System.out.println("Introduce la tarifa por hora: ");
            tarifa = teclado.nextInt();

            if (horas > JORNADA) {
                float extra = (float) (horas - JORNADA);
                float tarifa_extra = (float) (tarifa * PLUS_EXTRA);
                float salario_extra = (float) (extra * tarifa_extra);

                System.out.println("Salario (con extra). " + (salario_extra + JORNADA * tarifa) + "€");
            } else {
                float salario = (float) horas * tarifa;

                System.out.println("Tu salario es " + salario + "€");
            }
            control = false;
        }

        catch (Exception e) {

            System.out.println("Solo pueden introducirse números");

        }

        teclado.nextLine();
        }while ( control == true);

    }

}