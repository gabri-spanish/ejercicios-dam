package tema4.bateria;

import java.util.Scanner;

public class cubo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número...");
        int numero = teclado.nextInt();
        int resultado = cubo(numero);
        System.out.println(resultado);

        for (int i=0; i<args.length;i++) {
            System.out.println(args[i]);
        }
    }

    public static int cubo(int numero) {

        return numero*numero*numero;

    }


}
