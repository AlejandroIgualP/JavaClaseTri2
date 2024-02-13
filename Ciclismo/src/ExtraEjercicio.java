import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class ExtraEjercicio {
    File carpeta= new File("src\\Equipos");
    File[] lista_archivos = carpeta.listFiles();
    // private String[] rutasDeArchivos = {"C:\\Users\\Aleja\\OneDrive\\Escritorio\\Java\\JavaClaseTri2\\Ciclismo\\src\\Equipos\\Movistar.txt", "C:\\Users\\Aleja\\OneDrive\\Escritorio\\Java\\JavaClaseTri2\\Ciclismo\\src\\Equipos\\Visma.txt", "C:\\Users\\Aleja\\OneDrive\\Escritorio\\Java\\JavaClaseTri2\\Ciclismo\\src\\Equipos\\Emirates.txt"};
    private HashMap<String, ArrayList<Ciclismo>> equipos = new HashMap<>();
    public ExtraEjercicio() {
        Cargar_Datos();
        DevolverEquipoCiclista("Jorge Arcas");
        Max_corredores();
        Min_corredores();
        Ciclista_buscar();
        Hacer_media_de_equipos();
        Hacer_max_media_equipos();
        Mas_corredores_tiene();
    }
    public String DevolverEquipoCiclista(String nombre_jugador) {
        boolean corredor = false;
        String equipo_bueno = "";
        for (String buscar_equipo : equipos.keySet()) {
            ArrayList<Ciclismo> lista_buscar = equipos.get(buscar_equipo);
            // Recorriendo la lista de ciclismo ( Movistar,Vista,Emirates)
            for (Ciclismo cic : lista_buscar) {
                if (cic.getName().equals(nombre_jugador)) {
                    corredor = true;
                    equipo_bueno = buscar_equipo;
                }
            }
        }
        System.out.println("Ejecicio Extra " + " El corredor esta " + corredor + " " + equipo_bueno);
        return equipo_bueno;
    }
    public void Cargar_Datos() {
        for (File archivo : lista_archivos) {
            String nombreArchivo = archivo.getName();
            try {
                Scanner scanner = new Scanner(archivo);
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
    public void Min_corredores() {
        int min_corredores = 0;
        String min_equipo = "";
        int contador = 0;
        for (String re_equipos : equipos.keySet()) {
            ArrayList<Ciclismo> lista_equipo = equipos.get(re_equipos);
            //Iguala la variable min corredor a al tamaño del primer equipo.
            if (contador == 0) {
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
    public void Ciclista_buscar() {
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
    }
    // Hacer media de edades del equipo con menos corredores
    public void Hacer_media_de_equipos() {
        double media = 0;
        double menor_media = Integer.MAX_VALUE;
        String equipo = " ";
        //Te muestra todos los datos del fichero
        for (String equipos_lista : equipos.keySet()) {
            ArrayList<Ciclismo> lista_equipos = equipos.get(equipos_lista);
            // Media de todos
            for (Ciclismo ciclistas : lista_equipos) {
                media += ciclistas.getEdad();

            }
            media = media / lista_equipos.size();
            if (menor_media > media) {
                menor_media=media;
                equipo=equipos_lista;
            }
        }
        System.out.println("El equipo con menor " + equipo);
    }
    public void Hacer_max_media_equipos(){
        double media = 0;
        double menor_media = Integer.MIN_VALUE;
        String equipo = " ";
        //Te muestra todos los datos del fichero
        for (String equipos_lista : equipos.keySet()) {
            ArrayList<Ciclismo> lista_equipos = equipos.get(equipos_lista);
            // Media de todos
            for (Ciclismo ciclistas : lista_equipos) {
                media += ciclistas.getEdad();
            }
            media /= lista_equipos.size();
            if (menor_media < media) {
                menor_media=media;
                equipo=equipos_lista;
            }
        }
        System.out.println("El equipos con mayor media es "+ equipo);
    }
    public void Mas_corredores_tiene(){
        int contador = 0;
        int max_corredores =0;
        String p= " ";
        ArrayList<String>paises =new ArrayList<>();
        List<String> lista_paises = new ArrayList<>();
        //Datos del fichero
        for (String equipo : equipos.keySet()) {
            ArrayList<Ciclismo> lista_equipo = equipos.get(equipo);
            for (Ciclismo ciclista : lista_equipo) {
                paises.add(ciclista.getPais());
                if (!lista_paises.contains(ciclista.getPais())){
                    lista_paises.add(ciclista.getPais());
                }
            }
        }
        for (String pais : lista_paises){
            // Paises sin duplicados = System.out.println(pais);
            for (String pais_duplicado : paises){
                if (pais.equals(pais_duplicado)){
                    contador++;
                }
            }
            if (max_corredores < contador) {
                max_corredores = contador;
                p=pais;
            }
            contador =0;
        }
        System.out.println(p);
    }
}