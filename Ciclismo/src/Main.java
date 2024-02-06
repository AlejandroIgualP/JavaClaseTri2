import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Main extends Ciclismo {
    public Main(String name, String pais, Integer edad) {
        super(name, pais, edad);
    }

    public static void main(String[] args) {
        File directorio = new File("\\src");
        if (directorio.isDirectory()) {
            File[] archivos = directorio.listFiles();
            if (archivos != null) {
                for (File archivo : archivos) {
                    try {
                        FileReader fileReader = new FileReader(archivo.getPath());
                        BufferedReader bufferedReader = new BufferedReader(fileReader);


                        String linea;
                        while ((linea = bufferedReader.readLine()) != null) {
                            System.out.println(linea);

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