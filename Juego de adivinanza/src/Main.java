import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numeroGenerado = new Random().nextInt(100);
        int intentos = 0;

        while (intentos < 5){
            System.out.println("Introduzca el numero entre 0 y 100");
            int numeroDeUsuario = lector.nextInt();
            intentos++;

            if (numeroDeUsuario == numeroGenerado) {
                System.out.println("Adivinaste el numero!!!");
                break;
            } else {
                System.out.println("Es incorrecto tu numero");
            }
        }
        }
    }
