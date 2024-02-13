import java.util.ArrayList;

public class Ejercicio3 {
    public static class MyException extends Exception{
        public MyException(){
            super("Esto es un error personalizado por mi");
        }
    }
    public static void main(String[] args) {


        try {
            throw new MyException();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}


