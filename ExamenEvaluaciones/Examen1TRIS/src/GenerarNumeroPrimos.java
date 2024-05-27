import javax.swing.*;

public class GenerarNumeroPrimos {
    public static void main(String[] args) {


        int numero = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero"));

        for (int i = 0; i < numero; i++) {
            boolean primo = true;
            for (int j = 2; j < i-1; j++) {
                if (i % j == 0){
                    primo=false;
                    break;
                }
            }
            if (primo){
                System.out.println(i);
            }

        }
    }
}