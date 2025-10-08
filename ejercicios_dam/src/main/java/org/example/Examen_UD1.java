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

    System.out.println("Introduce el número de cardenales");
    int cardenales = teclado.nextInt();

    if (cardenales < 2 || cardenales > 200) {

        System.out.println("ERROR. No pueden haber menos de 2 ni más de 200 cardenales");
        System.exit(0);

    }

    System.out.println("Introduce el número de votos");
    int votos = teclado.nextInt();

    if (cardenales < votos) {

        System.out.println("ERROR. No pueden haber más votos ("+ votos + ") que cardenales ("+ cardenales + ")");
        System.exit(0);

    }

        if (votos <= 0) {

            System.out.println("ERROR. No pueden haber 0 votos, ¡HAY QUE VOTAR AL PAPA!");
            System.exit(0);

        }

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