import java.util.*;

public class CombinarListaAndres {
    public static void main(String[] args) {

        List<Integer> lista1 = new ArrayList<>(Arrays.asList(2, 3, 8, 9, 58,200));
        List<Integer> lista2 = new ArrayList<>(Arrays.asList(3, 8, 25, 120, 200,300));
        List<Integer> listaBuena = new ArrayList<>();

        for (Integer numero : lista1){
            for (Integer numero2 : lista2){
                if (!listaBuena.contains(numero)){
                    listaBuena.add(numero);
                }
                if (!listaBuena.contains(numero2)){
                    listaBuena.add(numero2);
                }
            }
        }
        listaBuena.sort(null);
        System.out.println(listaBuena);

    }
}
