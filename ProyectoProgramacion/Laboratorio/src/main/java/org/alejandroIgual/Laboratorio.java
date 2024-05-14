package org.alejandroIgual;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.List;

public class Laboratorio {
    private int id;
    private String nombre;
    private String especialidad;
    private String direccion;

    private int telefono;
    private String correoElectronico;


    public Laboratorio() {
    }

    public Laboratorio(int id, String nombre, String especialidad, String direccion, int telefono, String correoElectronico) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Laboratorio{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    //--------------------------------------------------------------------------------------------------------------
    private static final String url = "jdbc:mysql://localhost:3306/Proyectolaboratorio";
    private static final String name = "root";
    private static final String pass = "1234";


    //Metodos

    //Clinicas

    public void crearClinicas(){
        String nombre = JOptionPane.showInputDialog("Dame un nombre de una Clinica");

        try {
            Connection connection = DriverManager.getConnection(url,name,pass);
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO clinicas (nombre) VALUES (?)");

            preparedStatement.setString(1,nombre);
            preparedStatement.execute();

            connection.close();
            preparedStatement.close();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void BorrarClinicas(){
        int id = Integer.parseInt(JOptionPane.showInputDialog("Dame un id"));

        try {
            Connection connection = DriverManager.getConnection(url,name,pass);
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM clinicas WHERE id = ?");
            preparedStatement.setInt(1,id);
            preparedStatement.execute();

            connection.close();
            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void ModificarClinicas(){
        Integer id = Integer.valueOf(JOptionPane.showInputDialog("Dame un id"));
        String nombre = JOptionPane.showInputDialog("Dame un nuevo nombre");

        try {

            Connection connection = DriverManager.getConnection(url,name,pass);
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE clinicas SET nombre = ? WHERE id = ?");
            preparedStatement.setString(1,nombre);
            preparedStatement.setInt(2,id);
            preparedStatement.execute();

            connection.close();
            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void VerClinica(){
        int id = Integer.parseInt(JOptionPane.showInputDialog("Dame un id de una clinica"));

        try {
            Connection connection = DriverManager.getConnection(url,name,pass);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM clinicas WHERE id = ?");
            preparedStatement.setInt(1,id);
            preparedStatement.execute();


            connection.close();
            preparedStatement.close();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Clinicas> listarEstudiantes() {
        List<Clinicas> listaClinicas = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(url, name, pass);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * FROM alumno");

            while (resultSet.next()) {
                String nombre = resultSet.getString("nombre");

                Clinicas clinicas = new Clinicas(nombre);
                listaClinicas.add(clinicas);

            }
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaClinicas;
    }

    //---------------------------------------------------------------------------------------------------------------------
    //CIENTIFICOS

    public List<Cientificos> Metodos() {
        List<Cientificos> listaCientificos = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(url, name, pass);



            String [] opciones ={"Insertar cientifico","Borrar cientifico","Modificar cientifico","Buscar cientifico"};
            String opcion = (String) JOptionPane.showInputDialog(null,"Elige lo que quieras hacer","Elegir",JOptionPane.PLAIN_MESSAGE,null,opciones,opciones[0]);

            switch (opcion) {

                case "Insertar cientifico": {

                    String nombre = JOptionPane.showInputDialog(null,"Dame un nombre","Nombre",JOptionPane.QUESTION_MESSAGE);
                    String apellidos = JOptionPane.showInputDialog("Dame unos apellidos");
                    String fecha_nacimiento = JOptionPane.showInputDialog("Dame tu fecha de nacimiento");

                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate fecha = LocalDate.parse(fecha_nacimiento, formato);

                    int telefono = Integer.valueOf(JOptionPane.showInputDialog("Dame tu numero de telefono"));




                       PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO cientificos (nombre,apellidos,fecha_nacimiento,telefono) VALUES (?,?,?,?)");
                       preparedStatement.setString(1, nombre);
                       preparedStatement.setString(2, apellidos);
                       preparedStatement.setDate(3, Date.valueOf(fecha));
                       preparedStatement.setInt(4, telefono);
                       preparedStatement.execute();


                       preparedStatement.close();
                       connection.close();

                       break;
                }

                case "Borrar cientifico": {
                    System.out.println("Usted eligió la opcion 2");



                    break;
                }

                case "Modificar cientifico": {
                    System.out.println("Usted eligió la opcion 3");


                    break;
                }
                case "Buscar cientifico":{
                    System.out.println("Usted eligio la opcion 4");


                }
                default: {
                    System.out.println("Pon un numero de 1 - 4 PORFAVOR");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaCientificos;
    }

}
