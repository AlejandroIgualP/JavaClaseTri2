import java.io.*;


public class Main {
    private static void deserializar(String archivo) throws IOException{
        try(FileInputStream fileInputStream = new FileInputStream(archivo);
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream)
        ){
            Estudiante estudiante = (Estudiante) inputStream.readObject();
            System.out.println(estudiante.toString());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
        public static void main(String[] args) throws IOException {
      Estudiante e1 = new Estudiante("Paco Lopez",19);
      Estudiante e2 = new Estudiante("Luis Lopez",32);

        try (FileOutputStream fileOutputStream = new FileOutputStream("estudiante.ser")) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(e1);
            objectOutputStream.writeObject(e2);
        }
        }
    }