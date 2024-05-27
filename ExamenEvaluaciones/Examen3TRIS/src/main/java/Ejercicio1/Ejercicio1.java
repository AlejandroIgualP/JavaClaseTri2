package Ejercicio1;

import java.sql.*;

public class Ejercicio1 {
    private static String bd = "jdbc:mysql://localhost:3306/supernivel";
    private static String user = "root";
    private static String password = "1234";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(bd,user,password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("show tables like 'alejandro'");
            boolean encontrado = false;
            while (resultSet.next()){
                if (resultSet.getString(1).equals("alejandro")){
                    encontrado=true;
                    System.out.println("No se ha creado la tabla ya que existia ya");
                    break;
                }
            }
            if (!encontrado){
                statement.execute("create table alejandro(id INT)");
                System.out.println("Se ha crado la tabla 'alejandro'");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
