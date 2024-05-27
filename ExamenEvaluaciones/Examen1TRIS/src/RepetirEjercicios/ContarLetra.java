package RepetirEjercicios;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ContarLetra {
    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog("Dame una frase");
        String letra = "abcdefghijklmnñopqrstuvwxyz";
        List<Letra> listaOrdenar = new ArrayList<>();



        for (int i = 0; i < letra.length(); i++) {
            String letras = frase.replaceAll("[^"+letra.charAt(i)+"]","");

            if (!(letras.length() < 1)){
                listaOrdenar.add(new Letra(letra.charAt(i),letras.length()));
            }
        }

        listaOrdenar.sort(Letra::compareTo);
        //Para darle la vuelta.
       // System.out.println(listaOrdenar.reversed());
       // listaOrdenar = listaOrdenar.reversed();
        System.out.println(listaOrdenar);
    }
}
