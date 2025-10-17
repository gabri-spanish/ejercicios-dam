package tema2;
import java.awt.im.InputMethodRequests;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad_excepciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean seguir = true;

        LocalDateTime hoy = LocalDateTime.now();

    int modo = 0;
    int año_int = 0;
    final int año_min = 1900;
    Integer año_h = Integer.parseInt(String.valueOf(hoy.getYear()));

        System.out.println("Introduce el modo de ejecución...");
        System.out.println("[1] - Introduce el año de nacimiento");
        System.out.println("[2] - Introduce tu edad");
        System.out.println("--------------------------------------");
        if (teclado.hasNextInt()) {
            modo = teclado.nextInt();
        } else {
            System.out.println("El formato es invalido");
            return;
        }

        if (seguir) {

            if (modo == 1) {

                System.out.println("Introduce tu año de nacimiento...");
                String año = teclado.next();

                try {
                    año_int = Integer.parseInt(año);
                } catch (NumberFormatException e) {
                    System.out.println("El formato no es numérico");
                    return;
                }

                if (año_int >= año_min && año_int <= año_h) {

                    if (año_int >= año_min && año_int <= 1927) {
                        System.out.println("Generación no bautizada.");
                    } else if (año_int >= 1928 && año_int <= 1944) {
                        System.out.println("Generación silent.");
                    } else if (año_int >= 1945 && año_int <= 1964) {
                        System.out.println("Baby Boomers.");
                    } else if (año_int >= 1965 && año_int <= 1981) {
                        System.out.println("Generación X.");
                    } else if (año_int >= 1982 && año_int <= 1994) {
                        System.out.println("Generación Y o Millennial.");
                    } else {
                        System.out.println("Generación Z.");
                    }

                } else {

                    System.out.println("Valor inválido");
                    seguir = false;

                }
            }
            if (modo == 2) {

                int edad = 0;
                System.out.println("Introduce tu edad...");
                if (teclado.hasNextInt()) {
                    edad = teclado.nextInt();
                } else {
                    System.out.println("La edad no está introducida en formato numérico");
                    return;
                }

                if (edad >= 0) {

                    int naci = hoy.getYear() - edad;
                    System.out.println("Tu año de nacimiento es " + naci);
                    if (naci >= año_min && naci <= 1927) {
                        System.out.println("Generación no bautizada.");
                    } else if (naci >= 1928 && naci <= 1944) {
                        System.out.println("Generación silent.");
                    } else if (naci >= 1945 && naci <= 1964) {
                        System.out.println("Baby Boomers.");
                    } else if (naci >= 1965 && naci <= 1981) {
                        System.out.println("Generación X.");
                    } else if (naci >= 1982 && naci <= 1994) {
                        System.out.println("Generación Y o Millennial.");
                    } else {
                        System.out.println("Generación Z.");
                    }


                } else {

                    System.out.println("Edad incorrecta");
                    seguir = false;

                }

            }

            else if (modo != 1 && modo != 2) {

                System.out.println("Modo incorrecto");

            }

        }
    }
}