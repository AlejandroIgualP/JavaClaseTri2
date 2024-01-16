import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Ejercicio3 ejercicio3 = new Ejercicio3();
        Ejercicio3.circulo();
    }
    public static void circulo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un radio");
        double radio = scanner.nextInt();
        double area = Math.PI + Math.pow(radio,2);
        System.out.println("El area es "+ area);
    }
}
