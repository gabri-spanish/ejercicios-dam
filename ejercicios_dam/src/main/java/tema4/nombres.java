package tema4;

import java.util.Scanner;

public class nombres {
    public static void main(String[] args) {

        print_nombre("Gabriel","Patri","Oguri");
    }

    public static void print_nombre(String...nombre) {

        for (String nom : nombre) {
            System.out.println(nom);
        }

    }


}
