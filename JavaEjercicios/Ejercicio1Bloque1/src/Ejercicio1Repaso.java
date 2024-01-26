import java.util.Scanner;

public class Ejercicio1Repaso {
    public static void main(String[] args) {
        Ejercicio1Repaso ejercicio1Repaso = new Ejercicio1Repaso();
        Ejercicio1Repaso.mayorNumeros();
    }
    public static void mayorNumeros(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero");
        int num = sc.nextInt();
        System.out.println("Dame otro numero");
        int num2 = sc.nextInt();
        System.out.println("Dame otro numero");
        int num3 = sc.nextInt();

        int mayor= Math.max(num,num2);
        int mayorbueno= Math.max(mayor,num3);
        System.out.println("El numero mayor es "+mayorbueno);

        if (num == num2 || num2== num3 || num==num3) {
            System.out.println("Hay un empate");

        }
    }
}
