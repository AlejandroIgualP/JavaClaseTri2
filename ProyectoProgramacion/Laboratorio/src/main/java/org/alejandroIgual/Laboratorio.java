package org.alejandroIgual;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.Period;
import java.util.List;
import java.util.Optional;

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


    //Ejecutar Metodos
    public static void main(String[] args) {

    Laboratorio laboratorio = new Laboratorio();
    //laboratorio.crearClinicas();
    //laboratorio.BorrarClinicas();
    //laboratorio.ModificarClinicas();
    //laboratorio.VerClinica();


    }
}
