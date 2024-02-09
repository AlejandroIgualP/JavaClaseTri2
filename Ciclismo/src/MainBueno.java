import java.util.Scanner;

public class MainBueno {
    public static void main(String[] args) {
        ExtraEjercicio extraEjercicio = new ExtraEjercicio();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(" Dime el ciclista a buscar ");
            String ciclista = scanner.nextLine();
            extraEjercicio.DevolverEquipoCiclista(ciclista);
        }
    }
}


