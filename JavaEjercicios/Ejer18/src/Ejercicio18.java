import java.text.DecimalFormat;

public class Ejercicio18 {
    public int coeficiente(float num1, float num2){
        float resultado = num1 / num2;
        DecimalFormat decimal = new DecimalFormat("#.000");
        System.out.println("El resultado es " + decimal.format(resultado));

        return 0;
    }

}