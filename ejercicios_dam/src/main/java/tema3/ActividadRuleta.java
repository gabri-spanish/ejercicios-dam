package tema3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ActividadRuleta {
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);
        final String COLORES[] = {"rojo","negro"};
        Random aleatorio = new Random();

        Integer numeros [] = new Integer[37];


        for (int i = 0; i<numeros.length; i++) {

            numeros[i] = i;

        }

        final String PAR_IMPAR[] = {"par","impar"};

        System.out.println("Introduce un número entre el 0 y el 36");
        int numero_apostar = teclado.nextInt();

        if (!Arrays.asList(numeros).contains(numero_apostar)) {
            System.out.println("ERROR: El número no es válido");
            return;
        }

        String color_apuesta = "";
        String parimpar_apuesta  = "";
        if (numero_apostar != 0) {

            System.out.println("Introduce el color de tu apuesta (rojo o negro)");
            color_apuesta = teclado.next().toLowerCase();

            if (!Arrays.asList(COLORES).contains(color_apuesta)) {
                System.out.println("ERROR: El color no es válido (ROJO o NEGRO)");
                return;
            }

            System.out.println("Introduce tu apuesta (par o impar)");
            parimpar_apuesta = teclado.next().toLowerCase();

            if (!Arrays.asList(PAR_IMPAR).contains(parimpar_apuesta)) {
                System.out.println("ERROR: Apuesta no válida (PAR o IMPAR)");
                return;
            }

        }

        String color_sorteo = COLORES[aleatorio.nextInt(2)];
        int numero_sorteo = numeros[aleatorio.nextInt(37)];
        String parimpar_sorteo = numero_sorteo % 2 == 0 ? "par" : "impar";

        System.out.println("Ha salido " + color_sorteo + " " + parimpar_sorteo + " " + numero_sorteo);

        if (numero_sorteo == numero_apostar && color_sorteo.equals(color_apuesta) && parimpar_sorteo.equals(parimpar_apuesta)) {
            System.out.println("Has ganado!");
        } else if (numero_sorteo == numero_apostar) {
            System.out.println("Has acertado el número: " + numero_apostar);
        } else if (color_sorteo.equals(color_apuesta)) {
            System.out.println("Has acertado el color: " + color_apuesta);
        } else if (parimpar_sorteo.equals(parimpar_apuesta)) {
            System.out.println("Has acertado si es par o impar: " + parimpar_apuesta);
        } else {
            System.out.println("Has perdido");
        }

    }
}
