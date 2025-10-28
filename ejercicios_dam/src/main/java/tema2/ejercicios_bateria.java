package tema2;
import java.util.Scanner;

public class ejercicios_bateria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número");
        int n = teclado.nextInt();

        for (int i = n; i >= 1; i-- ) {
            System.out.println(i);
        }
    }
}

class ejercicio3 {
    public static void main(String[] args) {

        // 3

        for (int i = 1; i <= 50; i++) {

            if (i % 3 != 0) {
                continue;
            }
            System.out.println(i);

        }
    }
}

class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // 4

        System.out.println("Introduce una palabra");
        String pal = teclado.next();
        int letra = pal.length();
        for (int i=0;i<letra;i++) {

            System.out.println(pal.charAt(i));
        }

    }
}

class ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // 5

        System.out.println("Introduce un número");
        int nume = teclado.nextInt();
        for (int i=1;i<=10;i++) {
            int resultado = i * nume;
            System.out.println(nume + " x " + i + " = " + resultado);
        }

    }
}

class ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // 6

        System.out.println("Cuántos números quieres sumar?");
        int numeros = teclado.nextInt();

        for (int i=1; i<=numeros; i++) {

            System.out.println("Inserta nº" + i);
            int num = teclado.nextInt();

        }

    }
}

class ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // 7

        System.out.println("Introduce una palabra");
        String pal = teclado.next();
        int letra = pal.length();
        for (int i=letra-1;i>=0;i--) {

            System.out.println(pal.charAt(i));
        }

    }
}
