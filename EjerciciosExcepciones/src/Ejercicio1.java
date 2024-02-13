import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Ejercicio1 ejercicio1 = new Ejercicio1();
        Ejercicio1.Division();
    }
    public static void Division(){
        //Leer los numeros por pantalla
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero");
        int n1 = scanner.nextInt();
        System.out.println("Dame otro numero");
        int n2 = scanner.nextInt();

        //Hacer la division
        try {
            int division = n1 / n2;
            System.out.println(division);
        }catch (ArithmeticException arithmeticException){
            System.out.println("Error");


        }

    }
}
