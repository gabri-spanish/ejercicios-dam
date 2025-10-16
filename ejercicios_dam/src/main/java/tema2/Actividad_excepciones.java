package tema2;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Actividad_excepciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        LocalDateTime hoy = LocalDateTime.now();
        System.out.println("El día es: "+hoy.getDayOfMonth());
        System.out.println("El mes es: "+hoy.getMonthValue());
        System.out.println("El año es: "+hoy.getYear());
        System.out.println("La hora es: "+hoy.getHour());
        System.out.println("Minutos: "+hoy.getMinute());

    int modo = 0;
    int año_int = 0;
    Integer año_h = Integer.parseInt(String.valueOf(hoy.getYear()));

        try {
            System.out.println("Introduce el modo de ejecución...");
            modo = teclado.nextInt();
        } catch (Exception e) {

            System.out.println("Formato inválido");

        }

        if (modo == 1) {

            System.out.println("Introduce tu año de nacimiento...");
            String año = teclado.nextLine();

            año_int = Integer.parseInt(año);

            if (año_int >= 1900 && año_int <= año_h) {

                System.out.println("Valor válido");

            } else {

                System.out.println("Valor inválido");
                return;

            }

        }else if (modo == 2) {

            System.out.println("Introduce tu edad...");
            int edad = teclado.nextInt();

            if ( edad >= 0 ) {

                int naci = hoy.getYear() - edad;
                System.out.println("Tu año de nacimiento es " + naci);


            }

            else {

                System.out.println("Valor inválido");
                return;

            }

        }


    }
}