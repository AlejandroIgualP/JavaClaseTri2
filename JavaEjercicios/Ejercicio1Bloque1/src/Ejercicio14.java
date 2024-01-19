import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Ejercicio14 ejercicio14 = new Ejercicio14();
        Ejercicio14.cifras_numero();
    }

    public static double cifras_numero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero");
        double num1 = scanner.nextInt();
        if (num1 < 10000) {
            System.out.println(Math.floor(Math.log10(num1) + 1));
        } else {
            System.out.println("El numero es de mas de 5 cifras");
        }
        return num1;
    }
}
