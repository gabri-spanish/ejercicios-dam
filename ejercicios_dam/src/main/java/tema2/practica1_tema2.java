package tema2;
import java.util.Scanner;

public class practica1_tema2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String fecha = "00/00/0000";


        try {

            System.out.println("Introduce tu fecha de nacimiento (día/mes/año)");
            fecha = teclado.nextLine();
            String sinlinea = fecha.replace("/","");
            String dia = sinlinea.substring(0,2);
            String mes = sinlinea.substring(2,4);
            String año = sinlinea.substring(4,8);

            int dia_num = Integer.parseInt(dia);
            int mes_num = Integer.parseInt(mes);
            int año_num = Integer.parseInt(año);

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

        catch (Exception e) {

            System.out.println("FORMATO INTRODUCIDO INCORRECTO");
        }


    }
}
