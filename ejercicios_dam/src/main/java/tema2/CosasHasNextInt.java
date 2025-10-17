package tema2;
import java.util.Scanner;

public class CosasHasNextInt {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        if (teclado.hasNextInt()) {
            int numero = teclado.nextInt();
            System.out.println(numero);
        } else {

            System.out.println("Formato incorrecto. No es un número");

        }

    }
}