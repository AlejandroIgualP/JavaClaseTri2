package RepetirEjercicios;

import javax.swing.*;

public class QuitarVocales {

    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog("Dame una frase");
        String resultado = frase.replaceAll("[AEIOUaeiou]","");
        System.out.println(resultado);
    }
}
