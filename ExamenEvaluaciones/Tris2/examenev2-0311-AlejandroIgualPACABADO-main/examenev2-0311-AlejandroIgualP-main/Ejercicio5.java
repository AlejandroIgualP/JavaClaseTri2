import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame una direccion de correo");
        String direccion = scanner.nextLine();
        System.out.println(direccion);
    try{
        validarEmail(direccion);
        System.out.println("Has puesto una direccion correcta");
    } catch (EmailInvalido e ){
        System.out.println(e.getMessage());
    }
    }
    static void validarEmail(String direccion) throws EmailInvalido{
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(direccion);

        if (!matcher.matches()){
            throw new EmailInvalido("El email no es valido");

        }
    }
}
class EmailInvalido extends Exception{
    public EmailInvalido(String mensage){
        super(mensage);
    }
}
