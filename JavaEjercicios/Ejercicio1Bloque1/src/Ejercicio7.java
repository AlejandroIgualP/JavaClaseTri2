import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Ejercicio7 ejercicio7 = new Ejercicio7();
        Ejercicio7.bisiesto();
    }
    public static void bisiesto(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un año");
        double ano = scanner.nextInt();
        if ((ano % 4 ==0) && (ano % 100 !=0) || (ano % 400 == 0)){
            System.out.println("Es el año bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }


    }
}
