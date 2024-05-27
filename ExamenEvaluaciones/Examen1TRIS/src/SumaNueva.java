import javax.swing.*;
public class SumaNueva {
    public static void main(String[] args) {
        int numeros = Integer.parseInt(JOptionPane.showInputDialog("Dame otro numero"));
        System.out.println("La resta desde 1"+ numeros+ " es "+ RestaRecursiva(numeros));
    }
    public static int RestaRecursiva(int num){
        if (num == 1){
            return 1;
        }else {
            return RestaRecursiva(num-1)-1;
        }
    }
}
