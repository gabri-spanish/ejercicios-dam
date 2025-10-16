package tema2;
import java.util.Scanner;

public class practica1_tema2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        final int maximo_dia = 31;
        final int maximo_mes = 12;
        final int maximo_año = 2025;
        final int minimo_dia = 01;
        final int minimo_mes = 01;
        final int minimo_año = 1930;
        int dia_num = 0;
        int mes_num = 0;
        int año_num = 0;

        String fecha = String.valueOf(0);

            System.out.println("Introduce tu fecha de nacimiento (día/mes/año)");
            fecha = teclado.nextLine();

            int tama = fecha.length();
            String sinlinea = fecha.replace("/", " ");

            if (tama == 10 ) {
            String dia = sinlinea.substring(0,2);
            String mes = sinlinea.substring(3,5);
            String año = sinlinea.substring(6,10);

            try {
                dia_num = Integer.parseInt(dia);
                mes_num = Integer.parseInt(mes);
                año_num = Integer.parseInt(año);

            } catch (Exception e) {
                System.out.println("Formato no valido");
                return;
            }

                if ( dia_num > maximo_dia || dia_num < minimo_dia ) {

                    System.out.println("Introduce un día valido (1-31)");
                    return;

                } else if (mes_num > maximo_mes || mes_num < minimo_mes) {

                    System.out.println("Introduce un més valido (1-12)");
                    return;

                } else if (año_num > maximo_año || año_num < minimo_año) {

                    System.out.println("Introduce un año valido (1930-2025)");
                    return;

                } else {}


                int suma_fecha = dia_num + mes_num + año_num;
                System.out.println(dia_num + "+" + mes_num + "+" + año_num + " = " + suma_fecha);

                String sumafe_st = String.valueOf(suma_fecha);
                String i1 = sumafe_st.substring(0,1);
                String i2 = sumafe_st.substring(1,2);
                String i3 = sumafe_st.substring(2,3);
                String i4 = sumafe_st.substring(3,4);

                int num1 = Integer.parseInt(i1);
                int num2 = Integer.parseInt(i2);
                int num3 = Integer.parseInt(i3);
                int num4 = Integer.parseInt(i4);

                int total = num1+num2+num3+num4;
                System.out.println(num1 + "+" + num2 + "+" + num3 + "+" + num4 + " = " + total);
                System.out.println("Tu número de la suerte es el " + total);
            }



        else {
            System.out.println("El texto es diferente al formato de fecha indicado");
            }

    }
}
