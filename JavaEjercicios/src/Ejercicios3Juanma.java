import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

public class Ejercicios3Juanma{
    public static void main(String[] arg) {
        String ruta = "./indices.txt";
        File archivo = new File(ruta);
        String rutaSalida = "./sentenciasSQL.sql";
        File archivoSQL = new File(rutaSalida);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre de la tabla: ");
        String tabla = scanner.nextLine();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(archivo));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(archivoSQL));
            String linea = "";
            while ((linea = bufferedReader.readLine()) != null) {
                int idlinea = Integer.parseInt(linea);
                bufferedWriter.write("delete from " + tabla + " where id = " + idlinea);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}