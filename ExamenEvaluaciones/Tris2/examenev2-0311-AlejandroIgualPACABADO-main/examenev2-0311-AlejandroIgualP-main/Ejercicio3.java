import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio3 {
    public static void main(String[] args) {
        String rutaArchivo = "Metadata in DBMS.txt";
        Map<String, Integer> PalabraContar = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String Mayus_Minusculas = linea.toLowerCase();
                Pattern pattern = Pattern.compile("\\S+\\W");
                Matcher matcher = pattern.matcher(Mayus_Minusculas);

                while (matcher.find()) {
                    String palabra = matcher.group();
                    if (PalabraContar.containsKey(palabra)){
                        int contar = PalabraContar.get(palabra);
                        PalabraContar.put(palabra,contar+1);
                    }else {
                        PalabraContar.put(palabra,1);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Map<String,Integer> OrdenarLista = new LinkedHashMap<>();
        for (Map.Entry<String,Integer> entry : PalabraContar.entrySet()){
            String llave = entry.getKey();
            Integer valor = entry.getValue();
            OrdenarLista.put(llave,valor);
        }
        for (Map.Entry<String,Integer> entry : OrdenarLista.entrySet()){
            String llave = entry.getKey();
            Integer valor = entry.getValue();
            //Sin ordenar
            //System.out.println(llave+" "+valor);
        }
        TreeMap<String,Integer> OrdenarTreeMap = new TreeMap<>(OrdenarLista);
        for (Map.Entry<String,Integer> entry : OrdenarTreeMap.entrySet()){
            String llave = entry.getKey();
            Integer valor = entry.getValue();
            //Ordenada
            System.out.println(llave+" "+valor);
        }
    }
}
