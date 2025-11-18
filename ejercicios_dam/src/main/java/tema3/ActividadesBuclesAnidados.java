package tema3;

import java.util.Scanner;

public class ActividadesBuclesAnidados {
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la altura del triángulo");
        int altura = teclado.nextInt();

        for (int i=1; i<=altura;i++) {

            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }


    }
}

class ActividadesBuclesAnidados3 {
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);

        int resultado=0;

        System.out.println("Introduce el número máximo");
        int max = teclado.nextInt();
        externo:
        for (int i=1; i<=9; i++) {

            System.out.println("Tabla del " + i);
            interno:
            for (int j=1;j<=10;j++) {
                resultado=i*j;
                System.out.println(i + "x" + j + "=" + resultado);

                if (resultado > max) {
                    break externo;
                }
            }
        }
    }
}

class ActividadesBuclesAnidados4 {
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);

        int resultado=0;

        System.out.println("Introduce el número máximo");
        int m = teclado.nextInt();
        externo:
        for (int i=2; i<=m; i++) {

            interno:
            for (int j=2;j<i;j++) {
                if (i % j == 0) {
                    continue externo;
                }
            }

            System.out.print(i + " ");
        }
    }
}
