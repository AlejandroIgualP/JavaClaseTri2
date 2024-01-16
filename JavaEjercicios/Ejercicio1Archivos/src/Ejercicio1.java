import java.awt.*;
import java.io.File;


public class Ejercicio1 {
    public static void main(String[] args) {
        Ejercicio1 Ejercicio1 = new Ejercicio1();
        Ejercicio1.analizarfichero();

    }
    public static void analizarfichero(){
        File fichero = new File("D:\\Users\\dam1\\Desktop\\examen.txt");
        System.out.println(fichero.getAbsoluteFile());
        System.out.println(fichero.getAbsolutePath());
        System.out.println(fichero.getName());
        System.out.println(fichero.exists());
        System.out.println(fichero.getParentFile());

        String nombre = ("D:\\Users\\dam1\\Desktop\\examen.txt");
        String extension=nombre.substring(nombre.lastIndexOf("."));
        System.out.println(extension);



    }
}
