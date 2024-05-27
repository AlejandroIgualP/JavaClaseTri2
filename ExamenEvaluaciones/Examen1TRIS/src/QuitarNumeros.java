import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuitarNumeros {
    public static void main(String[] args) {

        List<Integer> lista1 = new ArrayList<>(Arrays.asList(1,3,4,5,6,7,8,9,11,12,13,15));
        List<Integer> lista2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,10,12));
        List<Integer> numeroLimpios = new ArrayList<>();
    for (Integer numero1 : lista1){
        for (Integer numero2 : lista2) {
            if (!numeroLimpios.contains(numero1)) {
                numeroLimpios.add(numero1);
            }
            if (!numeroLimpios.contains(numero2)) {
                numeroLimpios.add(numero2);
            }
        }
    }
        System.out.println(numeroLimpios);

    }
}
