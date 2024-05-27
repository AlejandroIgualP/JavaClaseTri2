import javax.swing.*;

public class NumeroPrimo {

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero"));


        for (int i = 1; i <numero ; i++) {
            boolean esprimo = true;
            for (int j = 2; j < i-1 ; j++) {
                if (i % j == 0){
                    esprimo=false;
                break;
                }
            }
            if (esprimo){
                System.out.println(i);
            }
        }
    }
}
