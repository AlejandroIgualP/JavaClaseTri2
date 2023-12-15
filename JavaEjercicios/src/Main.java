import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sumando1 =5;
        int sumando2 =10;

        Calculadora calculadora = new Calculadora();
        calculadora.sumar(sumando1,sumando2);
        calculadora.restar(sumando2,sumando1);
        calculadora.multiplicar(sumando2,sumando1);
        calculadora.dividir(sumando1,sumando2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la operacion a Realizar: ");
        System.out.println("1-> Sumar");
        System.out.println("2-> Restar");
        System.out.println("3-> Multiplicar");
        System.out.println("4-> Dividir");
        System.out.println("5-> Cerrar");

        int opcion = scanner.nextInt();
        if (opcion == 1){
            System.out.print("Introduce el primer sumando: ");
            int operando1 = scanner.nextInt();
            System.out.println("Introduce el segundo sumando: ");
            int operando2 = scanner.nextInt();
            calculadora.sumar(operando1,operando2);
        }
        else if (opcion == 2) {
            System.out.print("Introduce el primer sumando: ");
            int operando1 = scanner.nextInt();
            System.out.println("Introduce el segundo sumando: ");
            int operando2 = scanner.nextInt();
            calculadora.restar(operando1,operando2);
        }
        else if (opcion == 3) {
            System.out.print("Introduce el primer sumando: ");
            int operando1 = scanner.nextInt();
            System.out.println("Introduce el segundo sumando: ");
            int operando2 = scanner.nextInt();
            calculadora.multiplicar(operando1,operando2);
        }
        else if (opcion == 4) {
        System.out.print("Introduce el primer sumando: ");
        int operando1 = scanner.nextInt();
        System.out.println("Introduce el segundo sumando: ");
        int operando2 = scanner.nextInt();
        calculadora.dividir(operando1,operando2);
        }
        else if (opcion == 5) {
            System.exit(0);

        }
    }
}