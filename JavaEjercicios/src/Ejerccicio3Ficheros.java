import java.io.*;
import java.util.Scanner;

public class Ejerccicio3Ficheros {
    public static void main(String[] args) {
    Ejerccicio3Ficheros ejerccicio4Ficheros = new Ejerccicio3Ficheros();
    Ejerccicio3Ficheros.ficheros();
    Ejerccicio3Ficheros.archivo();
    }
    public static void ficheros() {

        File fichero = new File("./indice.txt");


        try {
            if (fichero.createNewFile()) ;
            System.out.println("El fichero se ha creado perfectamente");

            FileWriter permitir = new FileWriter(fichero); //Permite para poder escribir pero no escribe
            BufferedWriter Escribir = new BufferedWriter(permitir);//Escribir dentro de un archivo
            PrintWriter CrearyEscribir = new PrintWriter(fichero);//Crear y tambien te permite Escribir dentro
            CrearyEscribir.write("1" + '\n' + '2' + '\n' + '3' + '\n' + '5' + '\n' + "69" + '\n' + "36" + "\n" + "8" + "\n" + "36" + "\n");
            CrearyEscribir.close();// Si no lo cierras no se escribira nada
            Escribir.close();// Aqui tambien hace falta cerrarlo tanto en el (Bufferd como en el PRINT)

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void archivo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame el nombre de una tabla");
        String nombre = scanner.next();


        File fichero2 = new File("D:\\Users\\dam1\\Desktop\\Sentencias.Sql.sql");

        try {
            if (fichero2.createNewFile()){

                FileWriter permitir = new FileWriter(fichero2);
                BufferedWriter escribir = new BufferedWriter(permitir);
                PrintWriter escribimos = new PrintWriter(fichero2);
                escribimos.write("delete " +nombre+ " where id="+"\\n");
                escribir.close();
                escribimos.close();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
