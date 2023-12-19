public class Ejercicio17 {
    public int el_mayor(int num1,int num2,int num3){
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("El mayor es: " + num1);
            } else {
                System.out.println("El mayor es: " + num3);
            }
        } else if (num2 > num3) {
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("El mayor es: " + num3);
        }
        return num1 + num2 + num3;
    }
    public int el_menor(int num1,int num2,int num3){
        if (num1 < num2) {
            if (num1 < num3) {
                System.out.println("El menor es: " + num1);
            } else {
                System.out.println("El menor es: " + num3);
            }
        } else if (num2 < num3) {
            System.out.println("El menor es: " + num2);
        } else {
            System.out.println("El menor es: " + num3);
        }
        return num1 + num2 + num3;
    }
    public int multiplo(int num1,int num2,int num3){
        int mayor = el_mayor(num1,num2,num3);
        int menor = el_menor(num1,num2,num3);
        int resto = mayor%menor;
        if (resto==0){
            System.out.println("El numero es multiplo");
        }else {
            System.out.println("El numero no es multiplo");
        }
        return num1 + num2 + num3;
    }
}
