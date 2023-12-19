public class Ejercicio1 {

    public static void main(String[] args) {
        int segundos = 6200;
            int horas = (segundos/3600);
            int minutos = (segundos/60%60);
            int seg = (segundos%60);
            System.out.println(" Son las " + horas + " con minutero " + minutos + " con segundos " + seg);

        }
}