import java.util.Random;
import java.util.Scanner;

public class practica {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int aleatorio = new Random().nextInt (10);
        int intentosMaximos = 5;
        int intentoUsuario = 0;
        int numeroUsuario =0;


        while (intentoUsuario < intentosMaximos) {
            System.out.println("elige un numero");
            numeroUsuario = teclado.nextInt();
            if (numeroUsuario == aleatorio) {
                System.out.println("acertaste el numero es: " + aleatorio + " lo lograste en: " + intentoUsuario + " intentos");
            } else if (numeroUsuario < aleatorio) {
                System.out.println("el numero es mayor");
            } else if (numeroUsuario > aleatorio) {
                System.out.println("el numero es menor");
            }
            intentoUsuario++;
            if (intentoUsuario == intentosMaximos) {
                System.out.println("lo siento, ya no tienes mas intentos, el numero secreto era :" + aleatorio);
                break;
            }
        }


    }
}
