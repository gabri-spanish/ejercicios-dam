package org.example;
import java.util.Scanner;

public class Examen_UD1 {
    static class renta{

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double importe = 0;
        try {
            System.out.println("Introduce el importe del resultado de tu declaración");
            importe = teclado.nextInt();
        } catch (Exception e) {

            System.out.println("El formato introducido no es el correcto");

        }

        if (importe < 0) {

            System.out.println("Resultado de la declaración: A DEVOLVER");

        }

        else {

            System.out.println("Resultado de la declaración: A PAGAR");

        }

        }
    }
}

class papa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    int cardenales = 0;
    int votos = 0;

         System.out.println("Introduce el número de cardenales");
         cardenales = teclado.nextInt();

    System.out.println("Introduce el número de votos");
    votos = teclado.nextInt();

    int fumata = (cardenales % votos);

    if (fumata == 0 ) {

        System.out.println("Fumata blanca");
        System.out.println("HABEMUS PAPAM");

    }

    else {

        System.out.println("Fumata negra");

    }

    }
}