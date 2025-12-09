package tema4;

import java.util.Scanner;

public class LoteriaDeLaPeñaAtletica {
    public static void main(String[] args) {

        int parte1 = introduceNumeros();
        System.out.println(parte1);
        int parte2 = numerosDecimo();
        System.out.println(parte2);

    }

    public static int introduceNumeros() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el número de décimos");
        int numdec = teclado.nextInt();

        return numdec;


    }

    public static int numerosDecimo () {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce cuántos números tendrá el décimo número " + );
        int numdeci = teclado.nextInt();

        return numdeci;


    }

}
