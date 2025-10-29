package tema2.problemaspreexamen;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int resultado = 1;

        System.out.println("Introduce un número de base...");
        int base = teclado.nextInt();

        System.out.println("Introduce un número de exponente...");
        int exp = teclado.nextInt();

        if (exp == 0) {

            System.out.println("El resultado con exponente 0 es siempre 1");

        }

        else {

            for (int i = 0; i < exp; i++) {

                resultado *= base;

            }
            System.out.println(resultado);
        }

    }


}
