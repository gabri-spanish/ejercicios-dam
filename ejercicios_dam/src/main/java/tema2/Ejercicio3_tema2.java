package tema2;
import java.util.Scanner;

public class Ejercicio3_tema2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número");
        int numero = teclado.nextInt();
        System.out.println("Cuántas cifras quieres eliminar?");
        int cifra = teclado.nextInt();

        String numero_string = Integer.toString(numero);
        int tama = numero_string.length();
        int nuevo_tama = tama - cifra;

        String resultado = numero_string.substring(0,nuevo_tama);
        System.out.println("El resultado es " + resultado);


    }
}
