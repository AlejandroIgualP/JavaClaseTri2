package org.iesch;

import javax.swing.*;
import java.sql.*;
import java.util.Scanner;



public class ConexionBase {

    private static final String url = "jdbc:mysql://localhost:3306/alumnos";
    private static final String name = "root";
    private static final String pass = "1234";

    public static void main(String[] args) {
        //metodo main


/*
EJERCICIO 2
        try {
            Connection connection = DriverManager.getConnection(url,name,pass);


            for (int i = 0; i < 1; i++) {
                String consulta = "INSERT INTO alumno (nombre,apellidos,direccion) VALUES (?,?,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(consulta);
                preparedStatement.setString(1,"nombre"+i);
                preparedStatement.setString(2,"apellidos"+i);
                preparedStatement.setString(3,"direccion"+i);
                preparedStatement.execute();

                preparedStatement.close();
            }
            connection.close();
    EJERCICIO 3
        } catch (SQLException e) {
           throw new RuntimeException(e);
        }
    }
*/

/*
EJERCICIO 4
    }
    public int insertarEstudiantes () {
        int numerofilas = 0;

        String nombre = JOptionPane.showInputDialog("Dame un nombre");
        String apellidos = JOptionPane.showInputDialog("Dame un apellido");
        String direccion = JOptionPane.showInputDialog("Dame una direccion");


        try {
            Connection connection = DriverManager.getConnection(url, name, pass);
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO alumno (nombre,apellidos,direccion) VALUES (?,?,?)");
            //autoincremental no debes pasarle nada.
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, apellidos);
            preparedStatement.setString(3, direccion);
            preparedStatement.execute();


            connection.close();
            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return numerofilas;
*/
    }

    public int ModificarDatos() {
    int numerosFilas = 0;

        int id = Integer.parseInt(JOptionPane.showInputDialog("Dame un id"));
        String nombre = JOptionPane.showInputDialog("Dame un nombre");
        String apellidos = JOptionPane.showInputDialog("Dame un apellido");
        String direccion = JOptionPane.showInputDialog("Dame una direccion");


        try {
            Connection connection = DriverManager.getConnection(url,name,pass);
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "UPDATE alumno SET nombre=?, apellidos =?, direccion= ? WHERE id = ?");

            preparedStatement.setString(1,nombre);
            preparedStatement.setString(2,apellidos);
            preparedStatement.setString(3,direccion);
            preparedStatement.setInt(4,id);

            numerosFilas = preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return numerosFilas;
    }
}