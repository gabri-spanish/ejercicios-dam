package tema4;

public class Ejercicio3 {

    static int limite = 10;
    public static void main (String[] args) {

        imprimir(1);
        System.out.println(suma(10));

    }

    public static void imprimir(int inicio) {

        if (inicio<=limite) {

            imprimir(inicio+1);

        }

    }

    public static int suma(int num) {

        if (num==0) {

            return 0;

        } else {
            return num+suma(num-1);
        }

    }



}
