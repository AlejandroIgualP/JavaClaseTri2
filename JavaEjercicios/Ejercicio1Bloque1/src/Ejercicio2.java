import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Ejercicio2 ejercicio2 = new Ejercicio2();
        Ejercicio2.rectangulo();
    }
    public static void rectangulo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un lado");
        float lado = scanner.nextInt();
        System.out.println("Dame otro lado");
        float lado2 = scanner.nextInt();
        double resultado = lado * lado2;
        System.out.println("La superficie es "+ resultado);
        double perimetro = lado * 2 + lado2 *2;
        System.out.println("El perimetro es "+ perimetro);
    }
}
