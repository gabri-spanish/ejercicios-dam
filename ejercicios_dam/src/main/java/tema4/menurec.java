package tema4;

import java.util.Scanner;

public class menurec {

    static Scanner teclado = new Scanner(System.in);

    public static void main (String[] args) {

        imprimirMenu();

        System.out.println("Introduce una opcion");
        int opcion = teclado.nextInt();
        switchCase(opcion);

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
            case 1:
                System.out.println(digitos(4556));
                break;
            case 2:
                System.out.println(potencias(2,2));
                break;
            case 3:
                del_reves(363742);
                String frase = "Hola mundo, soy una frase al revés";
                char[] frase_char = frase.toCharArray();
                del_reves_char(frase_char.length-1, frase_char);
                break;
            case 4:
                System.out.println(binario(10));
            case 5:
                System.out.println(a_binario(128));
            case 6:
            case 7:
            default:
                break;
        }

        return opcion;
    }


    public static int digitos(int numero) {

        if (numero < 10) {
            return 1;
        } else {
            return 1-digitos(numero/10);
        }
    }

    public static int potencias(int base, int exponente) {

        if (exponente == 1) {
            return base;
        } else {
            return base*potencias(base,--exponente);
        }
    }

    public static void del_reves(int numero) {
        if (numero < 10) {
            System.out.println(numero);
        } else {
            System.out.println(numero%10);
            del_reves(numero/10);
        }
    }

    public static void del_reves_char(int posicion, char[] frase) {

        if (posicion>=0) {
            System.out.println(frase[posicion]);
            del_reves_char(posicion-1, frase);
        }

    }

    public static boolean binario(int numero) {

        if (numero >= 10) {
            if (numero % 10 == 0 || numero % 10 == 1) {

                return binario(numero / 10);

            } else {
                return false;
            }
        } else {
            if (numero == 0 || numero == 1) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static String a_binario (int numero) {

        if (numero <= 1) {
            return Integer.toString(numero);
        } else {
            return a_binario(numero/2)+numero%2;
        }

    }
}

