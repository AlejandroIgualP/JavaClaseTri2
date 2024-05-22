import javax.swing.*;

public class RestaRecursiva {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero"));
        System.out.println("La resta recursiva de 1 hasta "+ num + " es " + restaRecursivas(num));
    }
    public static int restaRecursivas(int n){
        if (n == 1){
            return 1;
        }else {
            return restaRecursivas(n-1)-1;
        }
    }
}
