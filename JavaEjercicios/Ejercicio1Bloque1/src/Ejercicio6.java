import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Ejercicio6 ejercicio6 = new Ejercicio6();
        Ejercicio6.raiz();
    }
    public static void raiz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero");
        double num = scanner.nextInt();
        double calcular = Math.sqrt(num);
        System.out.println("La raiz cuadrada es " + calcular);
        if (num < 0 ) {
            System.out.println("El numero es negativo entonces no se puede hacer la operacion");

        }
    }
}
