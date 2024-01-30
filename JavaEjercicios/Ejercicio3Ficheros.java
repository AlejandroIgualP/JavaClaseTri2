import java.io.*;

public class Ejercicio3Ficheros {
    public static void main(String[] args) {
        Ejercicio3Ficheros ejercicio3Ficheros = new Ejercicio3Ficheros();
        Ejercicio3Ficheros.ficheros();
    }
    public static void ficheros(){

        File fichero = new File("C:\\Users\\Aleja\\OneDrive\\Escritorio\\indice.txt");


        try {
            if (fichero.createNewFile());
            System.out.println("El fichero se ha creado perfectamente");

            FileWriter permitir = new FileWriter(fichero); //Permite para poder escribir pero no escribe
            BufferedWriter Escribir = new BufferedWriter(permitir);//Escribir dentro de un archivo
            PrintWriter CrearyEscribir= new PrintWriter(fichero);//Crear y tambien te permite Escribir dentro
            CrearyEscribir.write("1"+'\n'+'2'+'\n'+'3'+'\n'+'5'+'\n'+"69"+'\n'+"36"+"\n"+"8"+"\n"+"36"+"\n");
            CrearyEscribir.close();// Si no lo cierras no se escribira nada
            Escribir.close();// Aqui tambien hace falta cerrarlo tanto en el (Bufferd como en el PRINT)

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
