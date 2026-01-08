package tema4;

public class recursividad {

    static int limite = 10;
    public static void main (String[] args) {

        imprimir(1);
        System.out.println(suma(10));
        System.gc(); //Limpia lo que pueda antes de medir

        long inicioEjecucion = System.nanoTime();
        long memoriaAntes = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

// PROGRAMA A REALIZAR

        long finEjecucion = System.nanoTime();
        long memoriaDespues = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        System.out.println("Tiempo: " + (finEjecucion - inicioEjecucion) + " ns");
        System.out.println("Memoria consumida: " + (memoriaDespues - memoriaAntes) + " bytes");

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
