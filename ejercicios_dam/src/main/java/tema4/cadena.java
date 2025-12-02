package tema4;

import java.util.Scanner;

public class cadena {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena...");
        String cadena = teclado.next();

        String mayus = mayusculas(cadena);

        System.out.println(mayus);

        String partido = mayus(cadena);

        System.out.print(partido);

    }

    public static String mayusculas(String cadena) {

        cadena = cadena.toUpperCase();
        return cadena;

    }

    public static String mayus (String cadena) {


        return cadena;
    }


}

