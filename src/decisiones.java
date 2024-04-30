public class decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnPlan = true;
        double clasificacionDePelicula = 8.2;
        String tipoPlan = "plus";

        if (fechaDeLanzamiento >= 2022) {
            System.out.println ("Estas son las Peliculas mas populares");
        }else {
            System.out.println("peliculas retro");
        }

        if (incluidoEnPlan || tipoPlan.equals("plus")) {
            System.out.println("disfrute de su pelicula");
        }else {
            System.out.println("usted no es usuario plus");
        }
    }
}
