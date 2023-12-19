import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce los lados largos ");
        int lado= scanner.nextInt();
        System.out.println("Introduce los lados anchos ");
        int lado1= scanner.nextInt();
        Calcular calcular = new Calcular();
        calcular.areas(lado,lado1);
    }
}