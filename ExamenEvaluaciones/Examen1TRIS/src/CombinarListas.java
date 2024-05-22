import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CombinarListas {
    public static void main(String[] args) {
        // Creamos dos listas de enteros con algunos elementos en común
        List<Integer> lista1 = new ArrayList<>(Arrays.asList(2, 3, 8, 9, 58,200));
        List<Integer> lista2 = new ArrayList<>(Arrays.asList(3, 8, 25, 120, 200,300));

        // Creamos una nueva lista vacía para almacenar los resultados
        List<Integer> resultado = new ArrayList<>();

        // Recorremos cada elemento de la primera lista
        for (Integer numero : lista1) {
            // Si el elemento no está presente en la segunda lista, lo agregamos a la lista de resultados
            if (!lista2.contains(numero)) {
                resultado.add(numero);
            }
        }

        // Recorremos cada elemento de la segunda lista
        for (Integer numero : lista2) {
            // Si el elemento no está presente en la lista de resultados, lo agregamos
            if (!resultado.contains(numero)) {
                resultado.add(numero);
            }
        }

        // Ordenamos la lista de resultados en orden ascendente
        resultado.sort(null);

        // Imprimimos el resultado final
        System.out.println("La lista combinada sin duplicados es: " + resultado);
    }
}