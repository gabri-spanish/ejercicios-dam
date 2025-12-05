package tema4;

import java.util.Scanner;

public class Modo2 {

        static Scanner teclado;

    public static void main(String[] args) {

    teclado = new java.util.Scanner(System.in);
    while (casoDePrueba()) {

    }

    }

    public static boolean casoDePrueba() {

        int x = teclado.nextInt();
        int y = teclado.nextInt();
        teclado.nextLine();
        if (x < 0 || y < 0) {
            return false;
        } else {
            System.out.println((x+y)*2);
            return true;
        }

    }

}


