package tema3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BateriaEjerciciosMatrices1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int matriz[][] = new int [3] [3];
        System.out.println("Introduce tu matriz");

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = teclado.nextInt();
                }
            }


            for (int fila[] : matriz) {

                System.out.println(Arrays.toString(fila));

            }

            System.out.println("Introduce el número a buscar");
            int num = teclado.nextInt();

            parar:
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] == num) {
                        System.out.println("El número " + num + " de la matriz, se encuentra en la posición (" + i + "," + j + ")");
                        break parar;
                    }   else {
                        System.out.println("El número no se encuentra en el bucle");
                        break parar;
                    }
                }
            }
    }
}

class BateriaEjerciciosMatrices2 {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        int matriz[][] = new int [aleatorio.nextInt(5)+1] [aleatorio.nextInt(5)+1];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(25)+10;
            }
        }

        for (int fila[] : matriz) {
            for (int num : fila) {
                System.out.print(num + " ");
            }

            System.out.println();
        }
        int suma=0;
        for (int i=0;i< matriz.length;i++) {
            suma = 0;
            for (int j=0;j<matriz[i].length;j++) {
                suma += matriz[i][j];
            }

            System.out.println("Fila " + (i+1) + " : " + suma);

        }

        for (int i=0;i< matriz[0].length;i++) {
            suma = 0;
            for (int j=0;j<matriz.length;j++) {

                suma += matriz[j][i];

            }

            System.out.println("Columna " + (i+1) + " : " + suma);

        }
        suma = 0;
        int fila = aleatorio.nextInt(matriz.length-1);
        for (int i = 0; i<matriz[0].length; i++) {
            suma += matriz[fila][i];
        }

        System.out.println("1 fila: " + suma);



    }
}

class BateriaEjerciciosMatrices3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuántos estudiantes tienes?");
        int estudiantes = teclado.nextInt();

        System.out.println("Cuántas asignaturas tienen?");
        int asignaturas = teclado.nextInt();

        teclado.nextLine();

        String notas[][] = new String[estudiantes+1][asignaturas+1];

        notas[0][0] = "Estudiantes";

        for (int i = 1; i < notas.length; i++) {
            System.out.println("Introduce el nombre del alumno" + i + ":");
            notas[i][0] = teclado.nextLine();
        }

        for (String fila[] : notas) {
            for (String valor : fila) {
                System.out.print(valor + " ");
            }

            System.out.println();

        }

        for (int j = 1; j < notas[0].length; j++) {
            System.out.println("Introduce la asignatura" + j + ":");
            notas[0][j] = teclado.nextLine();
        }

        for (int i = 1; i<notas.length; i++) {
            for (int j=1; j<notas[i].length;j++) {
                System.out.println("Introduce la nota de " + notas[i][0] + " para la asignatura " + notas[0][j]);
                notas[i][j] = teclado.next();
            }
        }

        for (String fila[] : notas) {
            for (String valor : fila) {
                System.out.print(valor + " ");
            }

            System.out.println();

        }

        int total_notas = 0;
        for (int i=0;i<notas[0].length;i++) {
            for (int j=0;j<notas.length;j++) {
                total_notas+=Integer.parseInt(notas[j][i]);

            }

            System.out.println("La nota media en la asignatura de " + notas[0][i] + " es " + (double) (total_notas/estudiantes));

        }

    }
}