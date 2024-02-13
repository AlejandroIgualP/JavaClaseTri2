import java.io.*;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        //Recorrer los archivos para asi poder ver su contenido
        HashMap<String,String> ciclistaEquipo = new HashMap<>();
        HashMap<String,Integer> numero_ciclistas = new HashMap<>();

        //Coger cada Archivo para ver su contenido
        String ruta = "src//Equipos";

        File directorio = new File(ruta);
        if(directorio.exists()&&directorio.isDirectory()){
            File[] archivos = directorio.listFiles();
            for (File archivo: archivos) {
                String nombreEquipo = archivo.getName().replace(".txt","").trim();
                System.out.println(archivo.getName());
                numero_ciclistas.put(nombreEquipo,0);
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(archivo));
                    String linea = " ";
                    //Mientras que bufferReader lea una linea que siga cuando no haya se parara
                    while ((linea = bufferedReader.readLine())!=null) {
                        // Te va a dividir por partes el contenido del fichero
                        String[] partes = linea.trim().split("\\|");
                        String nombre = partes[0].trim();
                        String pais = partes[1].trim();
                        String edad = partes[2].trim().replace("años"," ").trim();
                        // Recorrerlo para que te lo muestre
                        for (String parte : partes){
                            System.out.println(parte);
                        }
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                //Todos archivos tratados
                System.out.println(numero_ciclistas);
            }
        }else {
            System.out.println("El directorio no existe");
            System.exit(2);//Para cerrar un Programa
        }
    }
}