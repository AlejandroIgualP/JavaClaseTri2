public class Ejercicio1 {

    public static void main(String[] args) {
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int segundos = 9500;
        ejercicio1.segundos(segundos);
        ejercicio1.minutos(segundos);
    }
    public int segundos(int segundos){
        System.out.println("Son las "+ (segundos / 3600));
        return segundos;
       }
    public int minutos(int segundos){
        System.out.println("con Minutos "+ (segundos/60));
        return segundos;
    }
    {

    }
}