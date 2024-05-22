
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame una Frase");
        String frase1 = scanner.nextLine().toLowerCase();
        System.out.println("Dame otra Frase");
        String frase2 = scanner.nextLine().toLowerCase();

        String[] palabras = frase1.split(" ");
        String primeraPalabra = palabras[0];

        for (String recorrerPalabras:palabras) {
            if (frase2.contains(recorrerPalabras) && !recorrerPalabras.equals(primeraPalabra)){
                primeraPalabra = recorrerPalabras;
                break;
            }
        }
        if (frase2.contains(primeraPalabra)){
            System.out.println("La primera palabra es " + primeraPalabra);
        }else {
            System.out.println("No hay ninguna palabra que tengan en comun");
        }

    }
}
