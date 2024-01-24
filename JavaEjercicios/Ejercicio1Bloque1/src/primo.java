public class primo {
    public static void main(String[] args) {
        int numero = 95;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                System.out.println("El numero es primo");
            } else {
                System.out.println("El numero no es primo");
            }
        }
    }
}
