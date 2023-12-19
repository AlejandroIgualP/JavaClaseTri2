import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] cochesElectricos = {"Tesla", "Nio", "BYD", "Rymac", "Ribian"};


        List<String> coches = new ArrayList<String>();
            coches.add("Audi");
            coches.add("Renault");
            coches.add("Ford");
            coches.add("Citroen");
            coches.add("Porche");

            coches.addAll(List.of(cochesElectricos));
        System.out.println(coches);
        System.out.println();

    }
}