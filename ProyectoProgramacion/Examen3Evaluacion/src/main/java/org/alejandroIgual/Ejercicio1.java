package org.alejandroIgual;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
         String url = "jdbc:mysql://localhost:3306";
         String user = "root";
         String pass = "1234";

        try {
            Connection connection = DriverManager.getConnection(url,user,pass);
            DatabaseMetaData databaseMetaData = connection.getMetaData();
            ResultSet resultSet = databaseMetaData.getCatalogs();
            List<String> lista = new ArrayList<>();

            while (resultSet.next()){
                String bbdd = resultSet.getNString(1);
                lista.add(bbdd);
                }
            System.out.println(lista);
            resultSet.close();
            if (lista.contains("supernivel")){
                System.out.println("no hago nada");
            } else {
                Statement statement = connection.createStatement();
                statement.execute("CREATE DATABASE supernivel");
                System.out.println("creamos la base de datos");
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
