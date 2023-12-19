import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un lado ");
        int lado = scanner.nextInt();
        System.out.println("Dame otro lado ");
        int lado1 = scanner.nextInt();
        Ejercicio1 ejercicio1 = new Ejercicio1();
        ejercicio1.area(lado,lado1);

    }
}