import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluacion = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("escribe la nota que le darias a la pelicula matrix");
            nota = teclado.nextDouble();
            mediaEvaluacion = mediaEvaluacion + nota;
        }
        System.out.println("la media para matrix es de: " + mediaEvaluacion / 3);
    }
}
