import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Ejercicio5 ejercicio5 = new Ejercicio5();
        Ejercicio5.positivonegativo();
    }
    public static void positivonegativo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero");
        double num = scanner.nextInt();
        if (num <0){
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es positivo");
        }
    }
}
