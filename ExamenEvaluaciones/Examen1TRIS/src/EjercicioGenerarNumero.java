
import java.util.Random;
public class EjercicioGenerarNumero{
    public static void main(String[] args) {
        // Crea un objeto Random para generar números aleatorios
        Random random = new Random();

        // Crea un arreglo de 30 enteros para almacenar los números aleatorios
        int[] numeros = new int[30];

        // Crea un arreglo de 50 enteros para contar las frecuencias de los números
        int[] cuenta = new int[50];

        // Genera 30 números aleatorios entre 0 y 49 y almacena en el arreglo numeros
        for (int i = 0; i < 30; i++) {
            numeros[i] = random.nextInt(50);
            System.out.println(numeros[i]);

            // Incrementa el contador del número generado cada vez que se repita
            cuenta[numeros[i]]++;
        }

        // Imprime las frecuencias de cada número en orden descendente
        System.out.println("\n\nVeces que se repite cada número:");
        for (int i = 49; i >= 0; i--) {
            // Si el contador del número es mayor a 0, imprime el número y su frecuencia
            if (cuenta[i] > 0) {
                System.out.println(i + ": " + cuenta[i]);
            }
        }
    }
}