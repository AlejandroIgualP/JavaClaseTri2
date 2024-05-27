package RepetirEjercicios;

import javax.swing.*;

public class SumaRecursiva {
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero"));
        System.out.println("La suma recursiva de 1 hasta "+ numero + " es " + SumaRecursiva(numero));
    }
  public static int SumaRecursiva(int n){
        if (n ==1){
            return 1;
        }else {
            return n + SumaRecursiva(n-1);
        }
  }


}
