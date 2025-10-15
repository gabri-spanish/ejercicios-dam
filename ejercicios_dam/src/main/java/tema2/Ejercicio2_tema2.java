package tema2;

import java.util.Scanner;

public class Ejercicio2_tema2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena");
        String cadena1 = teclado.nextLine();

        System.out.println("Introduce otra cadena");
        String cadena2 = teclado.nextLine();

        int comparacion = cadena1.compareTo(cadena2);

        if (comparacion < 0) {

            System.out.println(cadena2 + " es mayor que " + cadena1);

        }

        if (comparacion == 0 ) {

            System.out.println(cadena1 + " y " + cadena2 + " son iguales");

        }

        if (comparacion > 0 ) {

            System.out.println(cadena1 + " es mayor que " + cadena2);

        }


    }

}