import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4Repaso {
    public static void main(String[] args) {
        Ejercicio4Repaso ejercicio4Repaso = new Ejercicio4Repaso();
        Ejercicio4Repaso.OrdenaryBuscar();
    }
    public static void OrdenaryBuscar(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<String>();
        System.out.println("Dime un numero");
        int numero = scanner.nextInt();
        for (int i = 0; i < numero ; i++) {
            System.out.println("Introduce una palabra");
            String num = scanner.next();
            lista.add(num);
        }
        Collections.sort(lista);
        System.out.println("Lista ordenada" +lista);

         System.out.println("Dime la palabra que quieres buscar");
        String palabra = scanner.next();
        boolean comprobar = lista.contains(lista);
        if (comprobar){
            System.out.println(lista.indexOf(palabra));
        }else {
            System.out.println("La palabra no esta en la lista ");
        }

    }

}
