package tema3;

import java.util.Arrays;
import java.util.Scanner;

public class vectores {
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] vector = {0,3,8,6,10};
        System.out.println(Arrays.toString(vector));
        System.out.println(vector.length);

        int vector2[] = new int[8];
        String vector2_st = Arrays.toString(vector2);
        System.out.println(vector2_st);

        vector = vector2;

        vector[2] = 0;

        System.out.println(vector2);

        for (int i = 0; vector.length>=i; i++); {
        System.out.println(Arrays.toString(vector));

            String vecstr = Arrays.toString(vector);

            System.out.println(vector[i]);

        }
    }
}