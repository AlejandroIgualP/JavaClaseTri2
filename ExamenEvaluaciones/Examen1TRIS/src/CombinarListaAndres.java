import java.util.*;

public class CombinarListaAndres {
    public static void main(String[] args) {

        List<Integer> lista1 = new ArrayList<>(Arrays.asList(2, 3, 8, 9, 58,200));
        List<Integer> lista2 = new ArrayList<>(Arrays.asList(3, 8, 25, 120, 200,300));

        TreeSet<Integer> lista = new TreeSet<>();
        lista.addAll(lista1);
        lista.addAll(lista2);
        System.out.println(lista);

    }
}
