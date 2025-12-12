package tema4;

import java.util.Scanner;

/**
 *
 * @author Gabriel Tortosa
 * @version 1.0 (12/12/2025)
 *
 */
public class LoteriaDeLaPeñaAtleticaDOC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int limiteBoletos = 10000;
        int limiteNumeros = 99999;

        // Los boletos que quieren los fans del Atleti
        System.out.println("Introduce cuántos boletos quieren los hinchas");
        int boletos = teclado.nextInt();

        // Se limpia el búfer
        teclado.nextLine();

        bucle:
        // Comprobamos que el número de boletos elegidos no sea mayor al límite acordado
        if (boletos <= limiteBoletos) {

            // Empezamos con un for
            for (int i = 0; i < boletos; i++) {
                // Escribimos cuántos números tiene el décimo
                System.out.println("Introduce cuántos números hay en el décimo");
                int cantidad = teclado.nextInt();

                // Si se piden más de 99.999 décimos, el bucle se cierra
                if (cantidad > limiteNumeros) {
                    System.out.println("NO CABEN TANTOS NÚMEROS EN UN DÉCIMO");
                    break bucle;
                } else {
                    // Se utiliza la cantidad de números como un vector
                    int[] decimo = new int[cantidad];

                    // Limpiamos el búfer
                    teclado.nextLine();

                    // Introducimos los números del décimo
                    System.out.println("Por último, introduce los números del décimo");

                    for (int j = 1; j < cantidad; j++) {
                        decimo[j] = teclado.nextInt();
                    }

                    // Se muestran cuántos de los números son pares
                    int resultado = contarPar(decimo);

                    System.out.println(resultado);
                }
            }

        } else {
            System.out.println("MÁXIMO SE PERMITEN 10.000 BOLETOS");

        }

    }

    /**
     *
     * @param numeros es un vector tipo int, donde se guardan los números introducidos
     * @return return devuelve el contador, el cuál se trata de cuántos números son pares
     *
     */
    public static int contarPar(int[] numeros) {
        // Verificamos cuáles de los números introducidos son pares
        int contador = 0;
        for (int numero : numeros) {
            if (ParImpar(numero)) {
                contador++;
            }
        }
        return contador;
    }

    /**
     *
     * @param numero es un vector tipo int, donde se guardan los números introducidos
     * @return este return devuelve el resto de una división entre dos, si es 0 es par, si no, es impar
     *
     */

    public static boolean ParImpar(int numero) {
        // Verificamos que el resto de una división entre 2 sea par
        return numero % 2 == 0;
    }
}
