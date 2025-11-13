package tema3;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Arrays;

public class modo2_duplicado {
    public static void main(String[] args) {

        int original[] = {1,2,3,3,4,4,5,6};
        int tam=0;
        int j=1;

        for (int i=0; i<original.length-1;i++) {

            if (original[i]==original[i+1]) {
                original[i] =-1000;
            } else {
                tam++;
            }

        }

        System.out.println(Arrays.toString(original));

        int limpio[] = new int [tam];

        for (int i=0; i<original.length;i++) {
            if (original[i] != -1000)
            limpio[j] = original[i];
            j++;
        }

        System.out.println(Arrays.toString(limpio));
    }
}
