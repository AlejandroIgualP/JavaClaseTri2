public class Calculadora {
    public int sumar(int sumando1, int sumando2) {
        System.out.println("La suma es "+ (sumando1 + sumando2));
        return sumando1 + sumando2;
    }


    public void restar(int sumando2, int sumando1) {
        System.out.println("La resta es " + (sumando2-sumando1));
    }

    public void multiplicar(int sumando2, int sumando1) {
        System.out.println("La multiplicacion es " + (sumando1 * sumando2));
    }

    public void dividir(int sumando1, int sumando2) {
        System.out.println("La division es "+ (sumando2/sumando1));
    }
}