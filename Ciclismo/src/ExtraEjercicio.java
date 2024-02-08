import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ExtraEjercicio {
    private String[] rutasDeArchivos = {"C:\\Users\\Aleja\\OneDrive\\Escritorio\\Java\\JavaClaseTri2\\Ciclismo\\src\\Equipos\\Movistar.txt", "C:\\Users\\Aleja\\OneDrive\\Escritorio\\Java\\JavaClaseTri2\\Ciclismo\\src\\Equipos\\Visma.txt", "C:\\Users\\Aleja\\OneDrive\\Escritorio\\Java\\JavaClaseTri2\\Ciclismo\\src\\Equipos\\Emirates.txt"};
    private HashMap<String, ArrayList<Ciclismo>> equipos = new HashMap<>();

    public ExtraEjercicio() {
        Cargar_Datos();
        DevolverEquipoCiclista("Jorge Arcas");
        Max_corredores();
        Min_corredores();
        Ciclista_buscar();
    }

    public String DevolverEquipoCiclista(String nombre_jugador) {
        boolean corredor = false;
        String equipo_bueno = "";
        for (String buscar_equipo : equipos.keySet()) {
            ArrayList<Ciclismo> lista_buscar = equipos.get(buscar_equipo);
            // Recorriendo la lista de ciclismo ( Movistar,Vista,Emirates)
            for (Ciclismo cic : lista_buscar) {
                if (cic.getName().equals("Jonas Vingegaard")) {
                    corredor = true;
                    equipo_bueno = buscar_equipo;
                }

            }

        }
        System.out.println("El corredor esta " + corredor + " " + equipo_bueno);
        return equipo_bueno;
    }

    public void Cargar_Datos() {
        for (String nombreArchivo : rutasDeArchivos) {
            try {
                Scanner scanner = new Scanner(new File(nombreArchivo));
                ArrayList<Ciclismo> ciclistas = new ArrayList<>();
                while (scanner.hasNextLine()) {
                    String linea = scanner.nextLine();
                    String[] partes = linea.split(" \\| ");
                    //Con este if se controla que no haya lineas erroneas en el fichero.
                    if (partes.length == 3) {
                        ciclistas.add(new Ciclismo(partes[0], partes[1], Integer.parseInt(partes[2].split(" ")[0])));
                    }

                }
                equipos.put(nombreArchivo.replace(".txt", ""), ciclistas);
            } catch (FileNotFoundException e) {
                System.out.println("Archivo no encontrado: " + nombreArchivo);
            }
        }
    }

    public void Max_corredores() {
        int total_corredores = 0;
        String max_equipo = "";
        for (String re_equipos : equipos.keySet()) {
            ArrayList<Ciclismo> lista_equipo = equipos.get(re_equipos);
            if (lista_equipo.size() >= total_corredores) {
                total_corredores = lista_equipo.size();
                max_equipo = re_equipos;
            }

        }
        System.out.println("El equipo con mas corredores es " + max_equipo);
    }

        public void Min_corredores(){
            int min_corredores = 0;
            String min_equipo = "";
            int contador = 0;
            for (String re_equipos : equipos.keySet()) {
                ArrayList<Ciclismo> lista_equipo = equipos.get(re_equipos);
                //Iguala la variable min corredor a al tamaño del primer equipo.
                if (contador == 0){
                    min_corredores = lista_equipo.size();
                    contador++;
                }
                // Te lo compara el tamaño del resto de quipos con el primero y vas viendo cual es el pequeño.
                if (lista_equipo.size() <= min_corredores) {
                    min_corredores = lista_equipo.size();
                    min_equipo = re_equipos;
                }
            }
            System.out.println("El equipos con menos corredores es " + min_equipo);
    }

    public void Ciclista_buscar(){
        boolean corredor = false;
        String equipo_bueno = "";
        for (String buscar_equipo : equipos.keySet()){
            ArrayList<Ciclismo> lista_buscar = equipos.get(buscar_equipo);
            // Recorriendo la lista de ciclismo ( Movistar,Vista,Emirates)
            for (Ciclismo cic : lista_buscar){
                if (cic.getName().equals("Jonas Vingegaard")) {
                    corredor = true;
                    equipo_bueno = buscar_equipo;
                }

            }

        }
        System.out.println("El corredor esta " + corredor + " " + equipo_bueno);
    }
    }