import java.util.HashMap;

public class Ejercicio4HashMap {
    public static void main(String[] args) {
        Ejercicio4HashMap ejercicio4HashMap = new Ejercicio4HashMap();
        Ejercicio4HashMap.HashMap();
    }
    public static void HashMap(){
        HashMap<String, Integer> HashMap = new HashMap<>();
        //Añadir elementos en una lista
        HashMap.put("Camello",2);
        HashMap.put("Pepe",7);
        HashMap.put("Albiol",12);
        HashMap.put("Tomillo",1);

        System.out.println(HashMap);

        //Recuperar un valor de la HashMap
        Integer ValorCamello = HashMap.get("Camello");
        System.out.println("¿Contiene Camello? "+ ValorCamello);

        //Eliminar una entrada
        HashMap.remove("Albiol");
        System.out.println("Despues de eliminar a Albiol"+ HashMap);



    }
}

