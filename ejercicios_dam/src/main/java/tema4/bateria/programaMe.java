package tema4.bateria;

import java.util.Arrays;
import java.util.Scanner;

public class programaMe {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double dias[] = new double[6];
        double  reca[] = recaudar();
        System.out.println(Arrays.toString(reca));

        System.out.println(diamax(reca));
        double media = media(reca);
        System.out.println(media);

        double domingo = domingo(reca);

        System.out.println(domingo);

        if (domingo > media) {
            System.out.println("SÍ");
        } else {
            System.out.println("NO");
        }

    }

    public static double[] recaudar() {

        Scanner teclado = new Scanner(System.in);
        double reca[] = new double[6];

        for (int i = 0; i < reca.length; i++) {
            System.out.print("Dia " + (i+1) + "de la semana: ");
            reca[i] = teclado.nextDouble();
        }
        return reca;

    }

    public static String diamax(double reca[]) {

        double maximo = reca[0];
        int dia = 0;
        for (int i=0; i< reca.length; i++) {
          if (reca[i] > maximo) {
              maximo = reca[i];
              dia = i;
          }
        }

        return dia_semana(dia);

    }

    public static String dia_semana(int dia) {

        switch (dia) {
            case 0:
                return "MARTES";
            case 1:
                return "MIERCOLES";
            case 2:
                return "JUEVES";
            case 3:
                return "VIERNES";
            case 4:
                return "SABADO";
            case 5:
                return "DOMINGO";

        }

        return "";

    }

    public static double media (double recaudacion[]) {
        double acumulado = 0;

        for (int i = 0; i < recaudacion.length; i++) {
            acumulado += recaudacion[i];
        }

        return (acumulado/ recaudacion.length);

    }

    public static double domingo (double recaudacion[]) {

        return recaudacion[recaudacion.length-1];

    }


}
