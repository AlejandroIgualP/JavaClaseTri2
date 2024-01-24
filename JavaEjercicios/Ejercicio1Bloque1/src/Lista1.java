import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Lista1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el numero de palabra");
        int n = scanner.nextInt();

        System.out.println("Introduzca las palabras");
        ArrayList listapalabras = new ArrayList();

        for (int i = 0; i < n; i++){
            System.out.println("");
            String palabra = scanner.next();
            listapalabras.add(palabra);
            System.out.println(listapalabras);
        }





    }
}
