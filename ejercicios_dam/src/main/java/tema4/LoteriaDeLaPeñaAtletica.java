package tema4;

import java.util.Scanner;

public class LoteriaDeLaPeñaAtletica {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            int limiteBoletos = 10000;
            int limiteNumeros = 99999;

            System.out.println("Introduce cuántos boletos quieren los hinchas");
                int boletos = teclado.nextInt();

                bucle:
                if (boletos <= limiteBoletos) {

                    for (int i = 0; i < boletos; i++) {
                        System.out.println("Introduce cuántos números hay en el décimo");
                        int cantidad = teclado.nextInt();

                        int[] decimo = new int[cantidad];

                        System.out.println("Por último, introduce los números del décimo");

                        for (int j = 0; j < cantidad; j++) {
                            decimo[j] = teclado.nextInt();
                        }

                        int resultado = contarPar(decimo);

                        System.out.println(resultado);
                    }

                } else {
                    System.out.println("MÁXIMO SE PERMITEN 10.000 BOLETOS");

                }

        }

        public static int contarPar(int[] numeros) {
            int contador = 0;
            for (int numero : numeros) {
                if (ParImpar(numero)) {
                    contador++;
                }
            }
            return contador;
        }

        public static boolean ParImpar(int numero) {
            return numero % 2 == 0;
        }
    }

