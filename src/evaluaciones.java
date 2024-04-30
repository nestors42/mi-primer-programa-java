import java.util.Scanner;

public class evaluaciones {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluacion = 0;
        double totalEvaluaciones = 0;

        while (nota != -1) {
            System.out.println("escribe la nota que le darias a la pelicula matrix");
            nota = teclado.nextDouble();
            mediaEvaluacion = mediaEvaluacion + nota;
            totalEvaluaciones++;
        }
        System.out.println("la media para matrix es de: " + mediaEvaluacion / totalEvaluaciones);
        }
}
