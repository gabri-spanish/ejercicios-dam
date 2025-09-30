package org.example;
import java.util.Scanner;

public class trycatch {
public static void main(String[] args){

    try {

        int resultado = 8 / 0;
        System.out.println(resultado);
    }

    catch (Exception e) {

        System.out.println("No se puede dividir entre cero.");

    }


    }
}
