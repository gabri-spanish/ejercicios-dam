package tema4;

import java.util.Scanner;

public class Modo3 {

    static java.util.Scanner teclado;

        public static void main(String[] args) {
            teclado = new Scanner(System.in);
            while (casoDePrueba()) {

            }
        }

        public static boolean casoDePrueba() {
            teclado = new Scanner(System.in);
            if (teclado.hasNext()) {
                return false;
            } else {
                int toros = teclado.nextInt();
                int velocidad_corredor = 0;
                for (int i = 0; i < toros; i++) {
                    int velocidad_toro = teclado.nextInt();
                    if (velocidad_toro > velocidad_corredor) {
                        velocidad_corredor = velocidad_toro;
                    }
                }
                System.out.println(velocidad_corredor);
                teclado.nextLine();
                return true;
            }
        }

}
