package tema2;

import java.util.Scanner;

public class Ejercicio1_tema2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una palabra o frase");
        String texto = teclado.nextLine();

        System.out.println("Texto original: " + texto);
        int texto_longitud = texto.length();
        System.out.println("Longitud del texto: " + texto_longitud + " caracteres");
        String texto_reemplazo = texto.replace(" ", "");
        System.out.println("Espacios eliminados: " + texto_reemplazo);
        int TamMi = texto.length() / 2;
        String MitadTexto = texto.substring(0, TamMi);
        String FinMit = texto.substring(TamMi, texto.length());
        System.out.println("La primera mitad es " + MitadTexto + " y la segunda mitad es " + FinMit);
        String Texto_mayus = texto.toUpperCase();
        System.out.println("El texto en mayúsculas es " + Texto_mayus);


    }
}
