package tema3;

import java.util.Arrays;
import java.util.Collections;

public class Eliminar_objetos_array {
    public static void main(String[] args) {

        Integer vector[] = {1,2,3,3,4,4,5};
        Integer aux[] = new Integer[vector.length];
        Integer limpio[] = aux.clone();

        for (int i = 0; i< vector.length;i++) {
            if (vector[i] == aux[i]) {
                aux[i] = ;
            }
            System.out.println(vector[i]);
        }
    }
}
