package tema3;

import java.util.Arrays;
import java.util.Random;

public class modo3_dupli {
    public static void main(String[] args) {

        Random aleatorio = new Random();
        int vector[] = new int[10];

        for (int i=0; i<vector.length; i++) {
            vector[i] = aleatorio.nextInt(10)+1;
        }

        System.out.println(Arrays.toString(vector));

        boolean comprobar = true;

        while (comprobar) {

        comprobar = false;
        Arrays.sort(vector);
        System.out.println(Arrays.toString(vector));

            for (int i = 0; i< vector.length; i++){
                if (i!= vector.length-1 && vector[i] == vector[i+1]) {
                    vector[i] = aleatorio.nextInt(10)+1;
                    System.out.println("Duplicados: " + vector[i]);
                    System.out.println(Arrays.toString(vector));
                    vector[i] = aleatorio.nextInt(10)+1;
                    comprobar = true;
                }
            }
        }

    }
}
