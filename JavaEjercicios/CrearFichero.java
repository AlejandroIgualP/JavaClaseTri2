import java.io.File;
import java.io.IOException;


public class CrearFichero {



    public static void main(String[] args) {

            File myarchivo = new File("myarchivo.txt");

            if (myarchivo.exists());
        try {
            myarchivo.createNewFile();
            System.out.println(myarchivo.getName()+ " ha sido creado");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Se puede leer "+ myarchivo.canRead());
        System.out.println("Se puede escribir "+ myarchivo.canWrite());
        System.out.println("Se puede ejecutar "+ myarchivo.canWrite());
        System.out.println("Es un directorio "+ myarchivo.isDirectory());
        System.out.println("Es un archivo "+ myarchivo.isFile());
        System.out.println("Ultima modificacion "+ myarchivo.lastModified());
        System.out.println("Ruta de donde esta "+ myarchivo.toPath());

    }

}
