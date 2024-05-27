package RepetirEjercicios;

import javax.swing.*;

public class ContarUnaVocal {

    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog("Dame una frase");

        int contador = 0;

        for (int i = 0; i < frase.length() ; i++) {
            if (frase.charAt(i) == 'o'){
                contador++;
            }

        }
        System.out.println(contador);

    }
}
