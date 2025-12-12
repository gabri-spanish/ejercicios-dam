package tema4;

import java.util.Scanner;

public class LaLoteriaDeLaPenaAtletica {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            int limiteBoletos = 10000;
            int limiteNumeros = 99999;

                int boletos = teclado.nextInt();

                teclado.nextLine();

                bucle:
                if (boletos <= limiteBoletos) {

                    for (int i = 0; i < boletos; i++) {
                        int cantidad = teclado.nextInt();

                        if (cantidad > limiteNumeros) {
                            break bucle;
                        } else {
                            int[] decimo = new int[cantidad];

                            teclado.nextLine();


                            for (int j = 0; j < cantidad; j++) {
                                decimo[j] = teclado.nextInt();
                            }

                            int resultado = contarPar(decimo);

                            System.out.println(resultado);
                        }
                    }

                } else {

                    return;

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

