import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio7 {
    public String generar(){

        String[] listaLetras = {"a","b","c"};
        List<String> letras =  new ArrayList<>();
        letras.addAll(List.of(listaLetras));

        System.out.println(letras);
        return letras.toString();


    }
}
