package RepetirEjercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinarLista2 {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>(Arrays.asList("Juan", "Pepe", "Lucia", "Tomas", "Ana", "David"));
        List<String> lista1 = new ArrayList<>(Arrays.asList("Fernando", "Luis", "Jose", "Toni", "Luis", "Alejandro", "Ana", "Luis"));
        List<String> listaUnion = new ArrayList<>();
        List<String> listaBuena = new ArrayList<>();

        int contador = 1;
        listaUnion.addAll(lista);
        listaUnion.addAll(lista1);

        listaUnion.sort(null);
        System.out.println(listaUnion);

        String palabraAnterior = "";
        for (String palabra : listaUnion){
            if (palabra.equals(palabraAnterior)){
                contador++;
                if (contador == 2){
                    listaBuena.add(palabra);
                }
            }else {
                contador = 1;
                listaBuena.add(palabra);
            }
            palabraAnterior = palabra;
        }
        System.out.println(listaBuena);
    }
}
