import java.util.Scanner;

public class Ejercicio8 {
    public static void main (String[] arg) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el precio de una vivienda");
        float precio = scanner.nextFloat();

        System.out.println("Introduce la superficie de la vivienda");
        float superficie = scanner.nextFloat();

        System.out.println("Tiene garaje?");
        boolean garaje = scanner.nextBoolean();


        if (precio<15000 && superficie>80 && garaje) {
            System.out.println("Me interesa");
        }
        else System.out.println("No me interesa");
        scanner.close();
    }

}
