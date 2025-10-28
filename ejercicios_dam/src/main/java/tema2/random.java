package tema2;
import java.util.Random;
import java.util.Scanner;

public class random {

    public static void main(String[] args) {

        Random aleatorio = new Random();
        aleatorio.nextInt();

        int numero = aleatorio.nextInt(5) + 5;
        int numero2 = aleatorio.nextInt(9, 10);
        System.out.println(numero2);

        int numero3 = (int) (aleatorio.nextDouble()*100 + 1);
        System.out.println(numero3);

        double numero4 = Math.random()*10 + 1;
        System.out.println(numero4);
    }
}
