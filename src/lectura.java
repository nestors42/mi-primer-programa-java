import java.util.Scanner;

public class lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("escribe tu pelicula favorita");
        String pelicula = teclado.nextLine();
        System.out.println("escribe la fecha de lanzamiento");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("por ultimo dinos que nota le das a la pelicula");
        double nota = teclado.nextDouble();
        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);
    }
}
