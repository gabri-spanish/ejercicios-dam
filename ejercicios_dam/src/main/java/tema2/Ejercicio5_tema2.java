package tema2;
import java.util.Scanner;

public class Ejercicio5_tema2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contador = 1;

            System.out.println("Jugador 1: Introduce una oración...");
            String oracion = teclado.nextLine();

        do {
            System.out.println("Intento " + contador);
            System.out.println("Jugador 2: Introduce una palabra...");
            String palabra = teclado.nextLine();

            boolean prueba = oracion.contains(palabra);

            if ( prueba == false ) {

                System.out.println("Intento fallido");
                contador=contador+1;

            }

            if ( prueba == true ) {

                System.out.println("ENHORABUENA, HAS ACERTADO! La palabra " + palabra + " aparece en la oración");
                break;

            }

        } while (contador <= 10);

    }
}
