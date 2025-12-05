package tema4;

import java.util.Arrays;
import java.util.Scanner;

public class Modo1 {

    static java.util.Scanner teclado;

    public static void main(String[] args) {


        teclado= new Scanner(System.in);

        System.out.println("Introduce el número de personas que viene a saludarte");
        int numCasos = teclado.nextInt();

        teclado.nextLine();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();

    }

    public static void casoDePrueba() {

        String[] nombre = teclado.nextLine().split(" ");
        System.out.println("Hola, " + Arrays.toString(nombre) + ".");

    }


}
