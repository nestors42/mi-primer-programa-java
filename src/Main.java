//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hola guachin");
        System.out.println("bienvenido a mi programa");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnPlan = true;
        double clasificacionDePelicula = 8.2;

        double media = (8.2 + 6.0 + 9) / 3;
        System.out.println(media);

        String sionopsis = """
                Matrix es una paradaja
                La mejor Pelicula del fin del milenio
                Fue lanzada en el año
                """ + fechaDeLanzamiento;
        System.out.println(sionopsis);

        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);
    };
}