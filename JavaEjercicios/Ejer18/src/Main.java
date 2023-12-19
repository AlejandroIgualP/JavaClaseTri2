import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num1 = scanner.nextInt();
        System.out.println("Introduce otro numero");
        int num2 = scanner.nextInt();
        Ejercicio18 ejercicio18 = new Ejercicio18();
        ejercicio18.coeficiente(num1,num2);
    }
}