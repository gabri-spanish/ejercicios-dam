package tema4;

public class main {
    public static void main(String[] args) {

        int num = 10;
        int numero = funcion2(num);
        System.out.println(numero);

        procedimiento();
        System.out.println("He vuelto del procedimiento");

    }

    public static int funcion() {

        int num = 3;
        return num;

    }

    public static int funcion2(int numero) {

        numero = numero + 20;
        return numero * 10;

    }

    public static void procedimiento() {
        System.out.println("Hola soy un procedimiento y hago mis cosas no devolviendo nada");
    }

}
