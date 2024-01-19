import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Ejercicio15 ejercicio15 = new Ejercicio15();
        Ejercicio15.numeros();
    }

    public static void numeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero");
        double num1 = scanner.nextInt();
        System.out.println("Dame otro numero");
        double num2 = scanner.nextInt();
        System.out.println("Dame otro numero");
        double num3 = scanner.nextInt();

        double mayor = Math.max(num1, num2);
        double mayor_bueno = Math.max(mayor, num3);
        System.out.println(Math.round(mayor_bueno));

        double min = Math.min(num1, num2);
        double min_bueno = Math.min(min, num3);
        System.out.println(Math.round(min_bueno));

        int mediano = new Integer();
        if  (mediano != mayor_bueno && mediano != min_bueno) {
            System.out.println(mediano);
        }
    }
}


