package RepetirEjercicios;

public class FibonacciRecursivo {
    public static void main(String[] args) {

        System.out.println(Recursivo(10));
        System.out.println("--------------------------------------");

        for (int i = 1; i <= 10; i++) {
            System.out.println(Recursivo(i));
        }
    }
    public static int Recursivo(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return Recursivo(n-1)+Recursivo(n-2);
    }
}
