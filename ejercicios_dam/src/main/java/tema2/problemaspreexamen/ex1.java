package tema2.problemaspreexamen;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 0;

        int mayores = 0;
        int menores = 0;
        int iguales = 0;


        System.out.println("Introduce una cantidad de números");
        int N = teclado.nextInt();

        for (int i=1; i<=N; i++) {

            System.out.println("Introduce el número " + i);
            num = teclado.nextInt();

            if (num > 0 ) {
                mayores = mayores+1;
            } else if (num < 0 ) {
                menores = menores+1;
            } else {
                iguales = iguales+1;
            }

        }

            System.out.println("Numeros mayores a 0: " + mayores);
            System.out.println("Numeros menores a 0: " + menores);
            System.out.println("Numeros iguales a 0: " + iguales);

    }
}
