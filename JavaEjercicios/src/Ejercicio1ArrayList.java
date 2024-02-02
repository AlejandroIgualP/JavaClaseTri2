import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1ArrayList {
    public static void main(String[] args) {
    Ejercicio1ArrayList ejercicio1ArrayList = new Ejercicio1ArrayList();
    Ejercicio1ArrayList.ArrayList();
    }
    public static void ArrayList(){
        ArrayList<String> lista = new ArrayList<>();

        //Añadir a la lista
        lista.add("Pene");
        lista.add("Conejo");
        lista.add("Vaca");
        lista.add("Zapato");

        //Imprimir la lista y imprime cada elemento
        System.out.println(lista);

        //Recorrer una lista
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));



        }
        //Añadir elemento a una lista
        lista.add(2,"Camello");
        System.out.println(lista);

        //Para eliminar un valor de la lista
        lista.remove(1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame una palabra para borrar ");
        String palabra = scanner.next();
        lista.remove(palabra);
        System.out.println(lista);





    }
}
