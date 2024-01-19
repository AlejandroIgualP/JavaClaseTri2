import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Ejercicio9 ejercicio9 = new Ejercicio9();
        Ejercicio9.resta();
    }

    public static void resta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero");
        double num1 = scanner.nextInt();
        System.out.println("Dame otro numero");
        double num2 = scanner.nextInt();
        double mayor = Math.max(num1,num2);
        double menor = Math.min(num1,num2);
        double resultado = mayor - menor;
        System.out.println(Math.round(resultado));

    }
}
