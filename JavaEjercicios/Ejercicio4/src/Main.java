import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //->Aleatorio entre 0 y 100
        //int resultado = (int)(Math.random()*100+1);
        //System.out.println(resultado);


        //->Modifica el programa para pedir al usuario un número entero positivo y el
        //programa devuelva tres números enteros aleatorios entre 0 y el número
        //elegido por el usuario.
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Dame un numero ");
        //int numero = scanner.nextInt();
        //for(int i = 1; i<3; i++)
            //System.out.println((int)(Math.random()*(numero-0+1)+0));

        //->Modifica el programa para pedir al usuario dos números enteros positivos y el
        //programa devuelva tres números enteros aleatorios entre los dos números
        //elegidos por el usuario.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero ");
        int num = scanner.nextInt();
        System.out.println("Dame otra numero ");
        int num2 = scanner.nextInt();
        for(int i = 1; i<=3; i++)
            System.out.println((int)(Math.random()*(num-num2+1)+num2));

    }
}