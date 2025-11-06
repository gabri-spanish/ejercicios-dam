package tema3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class bateria_t3 {
    public static void main (String[] args) {

        Random aleatorio = new Random();
        int resultado = 0;
        int vector [] = new int [8];

        for (int i=0; i<vector.length; i++) {

            vector[i] = aleatorio.nextInt(500-0+1);
            resultado += vector[i] + vector[i];

        }

        System.out.println(Arrays.toString(vector));
        System.out.println("El resultado es: " + resultado);


    }
}

class act2 {
    public static void main (String[] args) {

        int vector [] = {1,4,6,3,9};
        int aux = 0;

        for (int i=0; i<vector.length/2;i++) {
            aux = vector[i];
            vector[i] = vector[vector.length-1-i];
            vector[vector.length-1-i] = aux;
        }

        System.out.println(Arrays.toString(vector));

    }
}


class act3 {
    public static void main (String[] args) {

        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        int vector [] = new int [25];
        int contador = 0;

        for (int i=0; i<vector.length;i++) {
            vector[i] = aleatorio.nextInt(100-0+1);
        }

        System.out.println(Arrays.toString(vector));

        System.out.println("Introduce el número que quieres buscar en el array [0-100]");
        int arr = teclado.nextInt();

        if (arr < 0 && arr > 100) {

            System.out.println("Número no permitido");
            return;

        }

        for (int i=0; i< vector.length; i++) {

            if (vector[i] == arr) {
                contador++;
            }

        }

        System.out.println("El número " + arr + " aparece " + contador + " veces.");


    }
}

class act4 {
    public static void main (String[] args) {


        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int vector[] = new int [5];
        int filtrado[] = new int [vector.length-1];
        int borrar = 0;

        System.out.println("Crea tu array");
        for (int i=0; i<filtrado.length;i++) {
            vector[i] = teclado.nextInt();
        }

        System.out.println(Arrays.toString(vector));

        System.out.println("Escribe qué posición borrar");
        borrar = teclado.nextInt();

        for (int i=0; i<filtrado.length;i++) {

            if (i==borrar) {
                filtrado[i] = vector[i+1];
            } else {
                filtrado[i] = vector[i];
            }

        }
        System.out.println(Arrays.toString(filtrado));

    }
}


class act5 {
    public static void main (String[] args) {
        int vector[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(vector));
        int aux = 0;

        aux = vector[vector.length-1];

        for (int i=vector.length-1; i>=1;i--) {
            if (i == vector.length-1) {
                aux = vector[i];
                vector[i] = vector[i - 1];
            } else {
                vector[i] = vector[i - 1];
            }
        }

        vector[0] = aux;

        System.out.println(Arrays.toString(vector));

    }
}


class act6 {
    public static void main (String[] args) {
        int vector[] = new int [5];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe tu vector");
        boolean siono = true;

        for (int i=0; i<vector.length;i++) {
            vector[i] = teclado.nextInt();
        }

        for (int i=0; i<vector.length/2;i++) {
            if (vector[i] != vector[vector.length-1-i]) {
                System.out.println("No es palíndromo");
                siono=false;
                break;
            }
        }

        if (siono) System.out.println("Es palíndromo");

        System.out.println(Arrays.toString(vector));

    }
}

class act9 {
    public static void main(String[] args) {

        String[] palabras = {"gambas", "fentanilo", "Pedri", "Osaka", "Batman"};
        String palabraMasLarga = "";

        for (String palabra : palabras) {
            if (palabra.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
            }
        }

        System.out.println("La palabra más larga es: " + palabraMasLarga);
    }
}


class act10 {
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);
        String palabra[] = {"mandarina","gambas","fentanilo","pan"};
        System.out.println("Busca la palabra");
        char letra = teclado.next().charAt(0);

        for (int i=0; i<palabra.length; i++) {

            if (letra == palabra[i].charAt(0)) {
                System.out.println(palabra[i]);
            }

        }


    }
}