package org.alejandroIgual;

import javax.swing.*;
import java.sql.*;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

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
            Scanner scanner = new Scanner(System.in);
            System.out.println("Dame un numero de 1->(Insertar Cientifico) | 2-> (Borrar Cientifico) | 3->(Modificar Cientifico) | 4-> (Ver los cientificos)" );
            int numero = scanner.nextInt();

            switch (numero) {

                case 1: {
                    System.out.println("Usted eligio la opcion 1");
                    System.out.println("Dame un id");
                    int ids = scanner.nextInt();
                    PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM alumno WHERE id =?");
                    preparedStatement.setInt(1, ids);
                    ResultSet resultSet = preparedStatement.executeQuery();

                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String nombre = resultSet.getString("nombre");
                        String apellidos = resultSet.getString("apellidos");
                        String direccion = resultSet.getString("direccion");

                        Alumnos alumnos = new Alumnos(id, nombre, apellidos, direccion);
                        listaAlumno.add(alumnos);
                    }
                    resultSet.close();
                    preparedStatement.close();
                    connection.close();

                    break;
                }

                case 2: {
                    System.out.println("Usted eligió la opcion 2");
                    System.out.println("Dame un nombre");
                    String nombres = scanner.next();
                    System.out.println("Dame un apellido");
                    String apellido = scanner.next();

                    PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM alumno WHERE nombre =?");
                    preparedStatement.setString(1, nombres);
                    PreparedStatement preparedStatements = connection.prepareStatement("SELECT * FROM alumno WHERE apellidos = ?");
                    preparedStatements.setString(1,apellido);

                    ResultSet resultSet = preparedStatement.executeQuery();

                    while (resultSet.next()) {

                        String nombre = resultSet.getString("nombre");
                        String apellidos = resultSet.getString("apellidos");
                        String direccion = resultSet.getString("direccion");
                        int id = resultSet.getInt("id");

                        Alumnos alumnos = new Alumnos(id, nombre, apellidos, direccion);
                        listaAlumno.add(alumnos);
                    }
                    resultSet.close();
                    preparedStatement.close();
                    connection.close();


                    break;
                }

                case 3: {

                    System.out.println("Usted eligió la opcion 3");
                    System.out.println("Dame un nombre Incompleto");
                    String nombreIncompleto = scanner.next();

                    System.out.println("Dame un apellido Incompleto");
                    String apellidoIncompleto = scanner.next();

                    PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM alumno WHERE nombre LIKE ? OR apellidos LIKE ?");
                    preparedStatement.setString(1, '%'+nombreIncompleto+'%');
                    preparedStatement.setString(2,'%'+apellidoIncompleto+'%');

                    ResultSet resultSet = preparedStatement.executeQuery();

                    while (resultSet.next()) {

                        String nombre = resultSet.getString("nombre");
                        String apellidos = resultSet.getString("apellidos");
                        String direccion = resultSet.getString("direccion");
                        int id = resultSet.getInt("id");

                        Alumnos alumnos = new Alumnos(id, nombre, apellidos, direccion);
                        listaAlumno.add(alumnos);
                    }
                    resultSet.close();
                    preparedStatement.close();
                    connection.close();



                    break;
                }
                case 4:{






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
