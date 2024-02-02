import java.util.HashSet;

public class Ejercicio2HastSet {
    public static void main(String[] args) {
        Ejercicio2HastSet ejercicio2HastSet = new Ejercicio2HastSet();
        Ejercicio2HastSet.HastSET();
    }
    public static void HastSET(){
        HashSet<String> lista_HastSET = new HashSet<String>();
        //Añadir elementos
        lista_HastSET.add("Perro");
        lista_HastSET.add("Camello");
        lista_HastSET.add("Perro");
        lista_HastSET.add("Mino");
        lista_HastSET.add("Duplado");
        lista_HastSET.add("Iostar");
        //Muestra la lista sin duplicados
        System.out.println(lista_HastSET);

        //Eliminar elemento de dentro de la lista
        lista_HastSET.remove("Duplado");
        System.out.println(lista_HastSET);

        //Para comprobar si esta el valor
        System.out.println(lista_HastSET.contains("Perro"));
    }
}
