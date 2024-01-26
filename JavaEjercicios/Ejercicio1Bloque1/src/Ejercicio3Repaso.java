import java.util.*;

public class Ejercicio3Repaso {
    public static void main(String[] args) {
        Ejercicio3Repaso ejercicio3Repaso = new Ejercicio3Repaso();
        Ejercicio3Repaso.duplicados();
    }
    public static void duplicados() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        System.out.println("cuantos numeros quieres añadir");
        int numero = sc.nextInt();
        int num;
        for (int i = 0; i < numero; i++) {
            System.out.println("Introduce un numero");
            num = sc.nextInt();
            lista.add(num);
            System.out.println(lista);
        }

        Set<Integer> listaSinDuplicados = new HashSet<Integer>(lista);
        lista.clear();
        lista.addAll(listaSinDuplicados);
        System.out.println(listaSinDuplicados);

        }

    }

