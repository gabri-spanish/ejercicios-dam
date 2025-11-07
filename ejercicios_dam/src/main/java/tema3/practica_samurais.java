package tema3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class practica_samurais {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        boolean seguir=true;
        int contador = 1;
        int fuerza = 30;
        int total = 0;
        int actual = 1;

        String team = "";
        int equipo1[] = new int [7];
        int equipo2[] = new int [7];

        rehacer:
        do {

            System.out.println("Introduce la fuerza de los samurais del equipo " + contador);
            team = teclado.next();
            String equipo [] = team.split(" ");

            int vector[] = new int [equipo.length];
            for (int i=0; i<vector.length; i++) {
                vector[i] = Integer.parseInt(equipo[i]);
                total += vector[i];
            }

            if (vector.length != 7) {

            System.out.println("TIENEN QUE SER 7 SAMURAIS");
            continue rehacer;

            } else {
                if (total != fuerza) {
                    System.out.println("Es mayor o menor a 30, debe ser igual a 30, hazlo de vuelta");
                    continue rehacer;
                }
                else {
                    if (actual == 1) {
                        equipo1 = vector.clone();
                        actual++;
                    } else {
                        equipo2 = vector.clone();
                        break;
                    }
                }
            }

            contador++;

            if (contador==3) {

                seguir=false;

            }
        } while (seguir);

        System.out.println(equipo1);
        System.out.println(equipo2);
    }
}