import java.util.TreeMap;


public class Ejercicio5TreeMap {
    public static void main(String[] args) {
        Ejercicio5TreeMap ejercicio5TreeMap = new Ejercicio5TreeMap();
        Ejercicio5TreeMap.TreeMap();
    }
    public static void TreeMap(){
        TreeMap<String, Integer> tree_map = new TreeMap<>();
        //Meter caracteres
        tree_map.put("Perro",2);
        tree_map.put("Burro",6);
        tree_map.put("Gaita",5);
        tree_map.put("Choped",12);
        tree_map.put("Cara",242);

        //Te la muestra de manera Ascendente
        System.out.println(tree_map.descendingMap());


        //Recuperar un valor
        Integer ValorBurro = tree_map.get("Burro");
        System.out.println("El valor de burro es "+ ValorBurro);

        //Eliminar una entrada
        tree_map.remove("Perro");
        System.out.println("El TreeMap despues de eliminar Perro "+ tree_map);


    }
}
