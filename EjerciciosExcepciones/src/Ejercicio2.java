import java.io.*;

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        Ejercicio2 ejercicio2 = new Ejercicio2();
        Ejercicio2.Abrir();
    }
    public static void Abrir() throws IOException {

        InputStream inputStream = null;
        try {
            String ruta = "D:\\Users\\dam1\\Desktop\\PROGRAMACION\\JavaClaseTri2\\EjerciciosExcepciones\\src\\data\\archivo.txt";
            File file = new File(ruta);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write("Hola cabeza nabo");
            bufferedWriter.flush();

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("El archivo no sea encontrado");
        }finally {
            if (inputStream!= null){
                try {
                    inputStream.close();
                }catch (IOException e){
                    System.out.println("Error al cerrar el inputStream");
                }
            }


        }


    }
}
