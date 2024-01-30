import java.io.*;
import java.util.Scanner;

public class Ejerccicio4Ficheros {
    public static void main(String[] args) {
    Ejerccicio4Ficheros ejerccicio4Ficheros = new Ejerccicio4Ficheros();
    Ejerccicio4Ficheros.archivo();
    }
    public static void archivo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame el nombre de una tabla");
        String nombre = scanner.next();


        File fichero2 = new File("C:\\Users\\Aleja\\OneDrive\\Escritorio\\sentencias.Sql.sql");

        try {
            if (fichero2.createNewFile()){

                FileWriter permitir = new FileWriter(fichero2);
                BufferedWriter escribir = new BufferedWriter(permitir);
                PrintWriter escribimos = new PrintWriter(fichero2);
                escribimos.write("delete " +nombre+ " where id=1" + "\\n");
                escribir.close();
                escribimos.close();
                System.out.println("El fichero se ha creado bien");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
