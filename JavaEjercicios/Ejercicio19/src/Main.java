import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero ");
        int num1 = scanner.nextInt();
        System.out.println("Dame otro numero ");
        int num2 = scanner.nextInt();
        Ejercicio19 ejercicio19 = new Ejercicio19();
        ejercicio19.elevar(num1,num2);
    }
}