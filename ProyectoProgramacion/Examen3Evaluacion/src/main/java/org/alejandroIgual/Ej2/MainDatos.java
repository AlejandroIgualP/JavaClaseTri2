package org.alejandroIgual.Ej2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainDatos {
    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper();
        Datos datos = new Datos();
        try {
            datos = objectMapper.readValue(new File("Uz.json"), Datos.class);
            System.out.println(datos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //Guardar en la BBdd
        String url = "jdbc:mysql://localhost:3306/openData";
        String user = "root";
        String pass = "1234";


        {
            try {
                Connection connection = DriverManager.getConnection(url, user, pass);
                PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO datos VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
                for (Estudios estudios : datos.getDatos()) {
                    preparedStatement.setString(1, estudios.getLocalidad());
                    preparedStatement.setFloat(2, estudios.getTasa_graduacion());
                    preparedStatement.setFloat(3, estudios.getMedia_cursos_matriculados());
                    preparedStatement.setString(4, estudios.getTipo_estudio());
                    preparedStatement.setString(5, estudios.getEstudio());
                    preparedStatement.setString(6, estudios.getSexo());
                    preparedStatement.setFloat(7, estudios.getTasa_abandono());
                    preparedStatement.setInt(8, estudios.getAlumnos_graduados());
                    preparedStatement.setInt(9, estudios.getCurso_academico());
                    preparedStatement.setInt(10, estudios.getAlumnos_graduados_en_tiempo());
                    preparedStatement.setFloat(11, estudios.getTasa_abandono());
                    preparedStatement.setInt(12, estudios.getAlumnos_interrumpen_estudios());
                    preparedStatement.setInt(13, estudios.getAlumnos_interrumpen_est_ano1());
                    preparedStatement.executeUpdate();

                }

                preparedStatement.close();
                connection.close();

            } catch (SQLException e) {
                throw new RuntimeException();
            }
        }
    }
}
