package tema4;

import java.util.Scanner;

public class menurec {

    static Scanner teclado = new Scanner(System.in);

    public static void main (String[] args) {

        imprimirMenu();

        System.out.println(digitos(4556));
        System.out.println(potencias(2, 6));


    }

    public static void imprimirMenu() {

        System.out.println("*** BATERÍA DE EJERCICIOS POR RECURSIVIDAD ***");
        System.out.println("Selecciona a continuación el modo que quieras ejecutar...");
        System.out.println("1 - Dígitos");
        System.out.println("2 - Potencias");
        System.out.println("3 - Del revés");
        System.out.println("4 - Binario");
        System.out.println("5 - A Binario");
        System.out.println("6 - Orden alfabético");
        System.out.println("7 - Mostrar suma");
        System.out.println("Otro - Volver al menú");

    }

    public static int switchCase(int opcion) {

        switch (opcion) {
            case '1':
                digitos(1);
            case '2':

            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            default:
                break;
        }

        return opcion;
    }


    public static int digitos(int numero) {

        if (numero < 10) {
            return 1;
        } else {
            return 1+digitos(numero/10);
        }
    }

    public static int potencias(int base, int exponente) {

        if (exponente == 1) {
            return base;
        } else {
            return base*potencias(base,--exponente);
        }
    }
}

