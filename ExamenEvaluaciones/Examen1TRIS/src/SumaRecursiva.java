import javax.swing.*;

public class SumaRecursiva {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero"));
        System.out.println("La suma de los números desde 1 hasta " + num + " es: " + sumaRecursiva(num));
    }

    public static int sumaRecursiva(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumaRecursiva(n - 1);
        }
    }
}