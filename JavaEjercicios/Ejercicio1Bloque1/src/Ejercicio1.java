import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Ejercicio1 ejercicio1 = new Ejercicio1();
        Ejercicio1.SuperficioPerimetro();    }
    public static void SuperficioPerimetro(){
        Scanner lado = new Scanner(System.in);
        System.out.println("Dame un lado");
        float lado2 = lado.nextInt();
        double superficie = Math.pow(lado2,2);
        System.out.println("la superficie es "+ superficie);
        double perimetro = lado2 * 4;
        System.out.println("El perimetro es "+ perimetro);




    }
}
