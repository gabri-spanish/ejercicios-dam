package tema2;
import java.util.Random;
import java.util.Scanner;

public class ejercicios_class_random {
    public static void main(String[] args) {
    }
}

class ej1 {
    public static void main(String[] args) {

        System.out.println("Ejercicio 1");
        Random aleatorio = new Random();
        aleatorio.nextInt();

        int numero1 = aleatorio.nextInt(6)+1;
        int numero2 = aleatorio.nextInt(6)+1;

        System.out.println("El resultado del primer dado: " + numero1);
        System.out.println("El resultado del segundo dado: " + numero2);

        int total = numero1 + numero2;
        System.out.println("Resultado de suma total: " + total);

    }
}

class ej2 {
    public static void main(String[] args) {

        System.out.println("Ejercicio 2");
        Random aleatorio = new Random();
        aleatorio.nextInt();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        String contraseña="";
        for (int i=0; i<12; i++) {
            contraseña += caracteres.charAt(aleatorio.nextInt(caracteres.length() - 1));
        }

        System.out.println(contraseña);
    }
}

class ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ejercicio 3");
        Random aleatorio = new Random();
        aleatorio.nextInt();
        System.out.println("Dame un rango mínimo...");
        int rangomin = teclado.nextInt();

        System.out.println("Dame un rango máximo...");
        int rangomax = teclado.nextInt();

        System.out.println("Cuántos números quieres?");
        int total = teclado.nextInt();

        for (int i=1; i<=total; i++) {
            int numero = aleatorio.nextInt(rangomax-rangomin+1) + rangomin;
            System.out.println(numero);
        }


    }
}


class ej4 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 4");
        Random aleatorio = new Random();
        aleatorio.nextInt();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        int longitud = aleatorio.nextInt(5)+8;
        String contraseña="";

        contraseña += "ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(aleatorio.nextInt(26));
        contraseña += "abcdefghijklmnopqrstuvwxyz".charAt(aleatorio.nextInt(26));
        contraseña += "0123456789".charAt(aleatorio.nextInt(10));
        for (int i=3; i<longitud; i++) {
            contraseña += caracteres.charAt(aleatorio.nextInt(caracteres.length() - 1));
        }
            System.out.println(contraseña);

    }
}