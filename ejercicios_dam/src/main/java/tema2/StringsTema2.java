package tema2;

public class StringsTema2 {
    public static void main(String[] args) {

        String frase = "Al palo JuanFran del Atleti palo";

        String base_datos = "Raul                       ";
        System.out.println(base_datos.trim() + " - " + base_datos + "#");

        boolean igual = base_datos.trim().equals("Raul");
        System.out.println(igual);

        boolean igual_sin_mayusculas = "Raul".equalsIgnoreCase("raul");
        System.out.println(igual_sin_mayusculas);

        String frase_reemplazo = frase.replace("palo", "Florentino");
        System.out.println(frase_reemplazo);

    }

}
