import org.w3c.dom.ls.LSOutput;

import java.util.regex.Pattern;
import java.net.*;
import java.io.*;
public class Url {

    public static void main(String[] args) {

        try {
            URL direccion = new URL("https://www.google.com/search?q=Java+21");


            System.out.println("Protocolo ="+direccion.getProtocol());
            System.out.println("Dominio ="+ direccion.getHost());
            System.out.println("Ruta de acceso ="+ direccion.getPath().replaceAll("\\/"," "));
            System.out.println("Termino de busqueda ="+ direccion.getQuery().replaceAll("\\+"," ").replaceAll("q="," "));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
