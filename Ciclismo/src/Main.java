import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public class Main extends Ciclismo {
    public Main(String name, String pais, Integer edad) {
        super(name, pais, edad);
    }

    public static void main(String[] args) {
        //Leer los argumentos de un Archivos en un directorio

        File directorio = new File("C:\\Users\\Aleja\\OneDrive\\Escritorio\\Java\\JavaClaseTri2\\Ciclismo\\src\\Equipos");
        if (directorio.isDirectory()) {
            File[] archivos = directorio.listFiles();
            if (archivos != null) {
                for (File archivo : archivos) {
                    try {
                        FileReader fileReader = new FileReader(archivo.getPath());
                        BufferedReader bufferedReader = new BufferedReader(fileReader);

                        String linea;
                        int i = 1;
                        HashMap<Ciclismo,String> ciclista = new HashMap<>();
                        HashMap<String, Integer> equipo = new HashMap<>();
                        while ((linea = bufferedReader.readLine()) != null) {

                            //Separa el nombre
                            String[] nombre = linea.split("\\|");
                            String nombre1 = nombre[0];

                            //Separa el pais
                            String[] pais = linea.split("\\|");
                            String pais1 = pais[1];

                            //Separa la edad
                            Integer edad = Integer.valueOf(nombre[2].split(" ")[1]);

                            //Te añade en los datos en una lista y aparte con el regex ponemos al equipo que pertenecen
                            ciclista.put(new Ciclismo(nombre1,pais1,edad),archivo.getName().split("\\.txt")[0]);

                            // Te muestra lo ciclistas de cada equipo
                            String nomeq = (archivo.getName().split("\\.txt")[0]);
                            equipo.put(archivo.getName().split("\\.txt")[0],i++);



                        }
                        bufferedReader.close();
                    } catch (IOException io) {
                        System.out.println("No se ha podido leer el archivo " + archivo.getName());
                    }
                }
            }
        }

    }
}