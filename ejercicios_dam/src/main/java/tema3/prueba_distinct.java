package tema3;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Arrays;

public class prueba_distinct {
    public static void main(String[] args) {

        int numeros[] = {1,2,2,3,4,5,6,6,7};

        int numeros_limpio[] = Arrays.stream(numeros).distinct().toArray();

        System.out.println(Arrays.toString(numeros_limpio));
    }
}
