package org.example;
import java.util.Scanner;

public class Examen_UD1 {
    public class Renta {}
    public class Papa{}
    Scanner teclado = new Scanner(System.in);

    public void main(Renta args) {

        int importe = 0;
        try {
            System.out.println("Introduce el importe del resultado de tu declaración");
            importe = teclado.nextInt();
        } catch (Exception e) {

            System.out.println("El formato introducido no es el correcto");

        }

        if (0 > importe) {

            System.out.println("Resultado de la declaración: A DEVOLVER");

        }

        else {

            System.out.println("Resultado de la declaración: A DEVOLVER");

        }

    }
}
