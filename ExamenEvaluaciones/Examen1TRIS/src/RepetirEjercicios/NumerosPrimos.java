package RepetirEjercicios;

import javax.swing.*;

public class NumerosPrimos {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero"));

        for (int i = 1; i < numero ; i++) {
            boolean primo = true;
            for (int j = 2; j < i - 1; j++) {
                if (j % i == 0) {
                    primo = false;
                }
            }
            if (primo){
                System.out.println(i);
        }

        }
    }
}
