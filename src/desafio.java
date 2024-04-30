import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String cuenta = "Corriente";
        double saldo = 1599.99;
        int opcionUsuario = 0;

        System.out.println("*************************************");
        System.out.println();
        System.out.println("Nombre del Cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + cuenta);
        System.out.println("Saldo disponible: " + saldo + "$");
        System.out.println();
        System.out.println("*************************************");
// PRIMER MENU
        String menu = """
                *** Escriba la opcion deseada *** ");
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;


//  mostrar menu
        Scanner teclado = new Scanner(System.in);
        while (opcionUsuario != 9) {
            System.out.println(menu);
            opcionUsuario = teclado.nextInt();

            switch (opcionUsuario) {
                case 1:
                    System.out.println("El saldo actualizado es de " + saldo + "$");
                    break;
                case 2:
                    System.out.println("Cual es el valor que desea retirar");
                    double retirarDinero = teclado.nextDouble();
                    if (retirarDinero > saldo) {
                        System.out.println("Dinero insuficiente");
                    } else {
                        saldo = saldo - retirarDinero;
                        System.out.println("Su saldo es de " + saldo + "$");
                        System.out.println("Usted retitó: " + retirarDinero + "$");
                    }
                    break;
                case 3:
                    System.out.println("Cual es el valor que desea depositar");
                    double depositarDinero = teclado.nextDouble();
                    saldo = saldo + depositarDinero;
                    System.out.println("Usted depositó: $" + depositarDinero);
                    System.out.println("El saldo actualizado es de " + saldo + "$");git
                    break;
                case 9:
                    System.out.println("Saliendo del programa, Gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}


