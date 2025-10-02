package org.example;
import java.util.Scanner;

public class ratónjuguetón {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("***BIENVENIDO AL RAT�N LAT�N***");

        System.out.println("Introduce tu altura: ");
        int altura = teclado.nextInt();

        if (altura <= 140) {

            if (altura < 0) {

                System.out.println("�ERROR DE ALTURA, BAJA Y SUBETE DE VUELTA!");
                System.exit(0);

            }

            int falta = 140 - altura;
            System.out.println("NO PUEDES MONTAR, TE FALTAN " + falta + "cm DE ALTURA");
            System.exit(0);

        }

        else if (altura >= 230 ) {

                System.out.println("�ERROR DE ALTURA, BAJA Y SUBETE DE VUELTA!");
            System.exit(0);

            }

        System.out.println("Introduce tu peso: ");
        int peso = teclado.nextInt();

        int minimo = (altura * 2) / 8;
        int maximo = 120;

        if ( peso > maximo ) {

            int sobre = peso - minimo;
            System.out.println("LO SIENTO, PESAS " + sobre + "KG por arriba del l�mite de la atracci�n");
            System.exit(0);

        }

        else {

            System.out.println("Pesas " + peso + "KG. Peso m�nimo calculado: " + minimo + "KG.");
            System.out.println("���PUEDES SUBIR, P�SALO BIEN!!!");

        }

    }
}