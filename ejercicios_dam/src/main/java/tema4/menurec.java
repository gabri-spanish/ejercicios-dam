package tema4;

import java.util.Scanner;

public class menurec {

    static Scanner teclado = new Scanner(System.in);

    public static void main (String[] args) {

        imprimirMenu();

        System.out.println("Teclea tu opción:");
        char opcion = teclado.next().charAt(0);

        if (validarOpcion(opcion)) {
            System.out.println("Válida");
        } else {
            System.out.println("No es válida");
        }


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

    public static boolean validarOpcion(char opcion) {

        switch (opcion) {
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            default:
                return false;
        }

    }




}
