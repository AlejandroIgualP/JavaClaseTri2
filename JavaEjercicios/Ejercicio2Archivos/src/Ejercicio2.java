import java.io.File;

public class Ejercicio2 {



    public static void main(String[] args) {
        Ejercicio2 ejercicio2 = new Ejercicio2();
        ejercicio2.programa();

    }
    public static void programa() {
        File ruta = new File("D:\\Users\\dam1\\Desktop\\examen.txt");
        System.out.println(ruta.getAbsolutePath());
        if (ruta.exists()) {
            if (ruta.isDirectory()) {
                String[] lista = ruta.list();
                for (int i = 0; i < ruta.length(); i++) {
                    System.out.println(lista[i]);
                }
            } else {
                System.out.println("Es un directorio");
            }

        }
    }
}
