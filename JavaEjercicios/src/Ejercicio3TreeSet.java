import java.util.TreeSet;
import java.util.regex.Pattern;

public class Ejercicio3TreeSet {
    public static void main(String[] args) {
        Ejercicio3TreeSet ejercicio3TreeSet = new Ejercicio3TreeSet();
        Ejercicio3TreeSet.TreeSet();
    }
    public static void TreeSet(){
        TreeSet<Integer> Tree_set = new TreeSet<Integer>();
        //Añadir elementos
        Tree_set.add(2);
        Tree_set.add(4);
        Tree_set.add(7);
        Tree_set.add(12);
        Tree_set.add(123);

        System.out.println(Tree_set.descendingSet());

        //Eliminar algun elemento
        Tree_set.remove(4);
        System.out.println(Tree_set);

        //Comprobar si un valor esta presente
        //Si esta te pondra true si no false
        System.out.println(Tree_set.contains(12));

    }
}

