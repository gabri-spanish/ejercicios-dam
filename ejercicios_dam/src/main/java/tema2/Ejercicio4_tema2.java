package tema2;
import java.util.Scanner;

public class Ejercicio4_tema2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena...");
        String cadena = teclado.nextLine();

        System.out.println("Introduce una subcadena...");
        String subcadena = teclado.nextLine();

        int cadena_tama = cadena.length();
        int subca_tama = subcadena.length();

        String cadena_sin = cadena.replace(subcadena,"");
        int conteo = cadena_sin.length();
        int resta = cadena_tama - conteo;
        int total = resta / subca_tama;

        System.out.println(subcadena + " aparece " + total + " veces");


    }
}