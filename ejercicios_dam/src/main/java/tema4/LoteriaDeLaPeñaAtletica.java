package tema4;

import java.util.Scanner;

public class LoteriaDeLaPeñaAtletica {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);


            System.out.println("Introduce cuántos boletos quieren los hinchas");
            int boletos = teclado.nextInt();

            for (int i = 0; i < boletos; i++) {
                int cantidad = teclado.nextInt();
                int[] decimo = new int[cantidad];

                for (int j = 0; j < cantidad; j++) {
                    decimo[j] = teclado.nextInt();
                }

                int resultado = contarPar(decimo);

                System.out.println(resultado);
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

