import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Ejercicio8 ejercicio8 = new Ejercicio8();
        Ejercicio8.real();
    }
    public static void real() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero");
        double num = scanner.nextFloat();
        if ( num % 1 == 0){
            System.out.println("No tiene decimales");
        } else {
            System.out.println("Tiene decimales");
        }
    }
}
