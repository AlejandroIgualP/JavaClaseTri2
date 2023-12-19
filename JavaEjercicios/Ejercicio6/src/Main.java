import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero ");
        int num = scanner.nextInt();
        System.out.println("Dame otro numero ");
        int num1 = scanner.nextInt();
        Ejercicio6 ejercicio6 = new Ejercicio6();
        ejercicio6.elevar(num,num1);
    }
}