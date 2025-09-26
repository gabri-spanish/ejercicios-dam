package org.example;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el primer número: ");
        int num1 = teclado.nextInt();

        System.out.println("Introduzca el segundo número: ");
        int num2 = teclado.nextInt();

        System.out.println("Introduzca el tercer número: ");
        int num3 = teclado.nextInt();

        if (num1 > num2) {
            if (num3 > num1) {

                System.out.println(num3 + " es el número mayor y " + num2 + " es el número menor");
            }

            else {

                if (num2 > num3) {

                    System.out.println(num1 + " es el número mayor y " + num3 + " es el número menor");

                }

                else {

                    System.out.println(num1 + " es el número mayor y " + num2 + " es el número menor");

                }
            }

        }

        else {


            if (num3 > num2) {

                System.out.println(num3 + " es el número mayor y " + num1 + " es el menor");

            }

            else {

                if (num3 > num1) {

                    System.out.println(num2 + " es el mayor y " + num1 + " es el menor");

                }

                else {


                    System.out.println(num2 + " es el mayor y " + num3 + " es el menor");

                }


            }


        }



    }
}
