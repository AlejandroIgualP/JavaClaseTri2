import javax.swing.*;

public class QuitarVocales {

    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog("Dame una frase");
        frase = frase.replaceAll("[aeiouAEIOU]", "");
        System.out.println(frase);




    }
}
