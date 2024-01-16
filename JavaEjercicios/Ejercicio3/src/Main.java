import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero ");
        int numero = scanner.nextInt();
        Ejercicio3 ejercicio3 = new Ejercicio3();
        ejercicio3.raiz(numero);
    }
}12