import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Ejercicio4 ejercicio4 = new Ejercicio4();
        Ejercicio4.Media();
    }
    public static void Media(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero");
        double num1 = scanner.nextInt();
        System.out.println("Dame otro numero");
        double num2 = scanner.nextInt();
        System.out.println("Dame otro numero");
        double num3 = scanner.nextInt();

        double resultado = num1 + num2 + num3 /3;
        System.out.println("La media sin redondear "+resultado);
        double round = Math.round(resultado);
        System.out.println("La media redondeada "+round);

    }
}
