package tema4;

public class Ejercicio2 {

    static int limite = 1000000;
    public static void main (String[] args) {

        imprimir(1);

    }

    public static void imprimir(int inicio) {

        if (inicio<=limite) {

            System.out.println(inicio);
            imprimir(inicio+1);

        }

    }



}
