package tema2;

import java.util.Scanner;

public class practica2_calculadora_tema2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double op1 = 0;
        double op2 = 0;
        boolean seguir = true;

        System.out.println("*** Bienvenido a la calculadora ***");
        System.out.println(" > Introduce el primer operando");
        if (teclado.hasNextDouble()) {
            op1 = teclado.nextInt();
        } else {
            System.out.println("Operando no numérico");
            return;
        }

        System.out.println("----------------------------------");
        System.out.println("   [+] Sumar");
        System.out.println("   [-] Resta");
        System.out.println("   [x] Multiplicar");
        System.out.println("   [/] Dividir");
        System.out.println("   [R] Raiz cuadrada");
        System.out.println("----------------------------------");
        System.out.println("Selecciona una operación para realizarla");
        teclado.nextLine();
        String operao = teclado.nextLine();

        if (operao.toLowerCase().equals("r")) {

            System.out.println("Raiz cuadrada");

        } else {

            System.out.println("Introduce operando 2");
            if (teclado.hasNextDouble()) {
                op2 = teclado.nextInt();
            } else {
                System.out.println("Operando no numérico");
                return;
            }

        }

        switch (operao.toLowerCase()) {

            case "+":

                double totalsum = op1 + op2;
                System.out.println("La suma de " + op1 + " y " + op2 + " es igual a " + totalsum);

                break;

            case "-":
                System.out.println("Introduce operando 2");
                if (teclado.hasNextDouble()) {
                    op2 = teclado.nextInt();
                } else {
                    System.out.println("Operando no numérico");
                    break;
                }
                double totalres = op1 - op2;
                System.out.println("La resta de " + op1 + " y " + op2 + " es igual a " + totalres);

                break;

            case "x":
                double totalmul = op1 * op2;
                System.out.println("La multiplicación de " + op1 + " y " + op2 + " es igual a " + totalmul);

                break;

            case "/":

                if (op2 != 0) {
                    double totaldiv = op1 / op2;
                    System.out.println("La división de " + op1 + " y " + op2 + " es igual a " + totaldiv);
                } else {

                    System.out.println("No se puede dividir entre 0");
                    break;

                }

                break;

            case "r":
                double raizCuadrada = Math.sqrt(op1);
                System.out.println("La raiz cuadrada de " + op1 + " es " + raizCuadrada);

                break;


            default:
                System.out.println("Operación no permitida");
                break;

        }
    }
}
