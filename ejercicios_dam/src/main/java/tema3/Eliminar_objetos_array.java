package tema3;

import java.util.Arrays;
import java.util.Collections;

public class Eliminar_objetos_array {
    public static void main(String[] args) {

        int vector[] = {1,2,3,3,4,4,5,6};
        int aux[] = new int [vector.length];
        int tam = 1;
        int j = 0;

        for (int i = 0; i<=vector.length-1;i++) {
            if (i==vector.length-1) {
                aux[i]=vector[i];

            } else if (vector[i] != vector[i+1]) {
                aux[i] = vector[i];
                tam++;
            }
        }
        System.out.println(Arrays.toString(aux));
        System.out.println(tam);

        int limpio[] = new int [tam];

        for (int i = 0; i<aux.length;i++) {
            if (aux[i]!=0) {
                limpio[j]=aux[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(limpio));
    }
}
