package ConexionBase;

import org.iesch.Persona;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static javax.management.remote.JMXConnectorFactory.connect;

public class ConexionBase {
    private  final String url= "jdbc:mysql://localhost:3306/personas";
    private  final String user= "root";
    private  final String pass= "1234";

    public  Connection conexionBase() throws SQLException {
        return DriverManager.getConnection(url,user,pass);
    }

    public List<Persona> obtenerTodo() {
        List<Persona> listaPersonas = new ArrayList<>();
        try {
            Connection connection = conexionBase();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * FROM persona");
            while (resultSet.next()){
                String dni = resultSet.getString("dni");
                String nombre = resultSet.getString("nombre");
                String apellidos = resultSet.getString("apellidos");
                String sexo = resultSet.getString("sexo");
                int altura = resultSet.getInt("altura");
                float peso = resultSet.getFloat("peso");

            /*
            Persona p = new Persona();
            p.setDni(dni);
            p.setNombre(nombre);
            p.setApellido(apellido);
            p.setSexo(sexo);
            p.setAltura(altura);
            p.setPeso(peso);
             */

                Persona p = new Persona(dni, nombre, apellidos, sexo, peso,altura);
                listaPersonas.add(p);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaPersonas;
    }

    public int insertar (Persona persona){
        int numerosFilas = 0;
        try {
            Connection connection = conexionBase();
            PreparedStatement Prestatement = connection.prepareStatement(
                    "Insert into persona (dni, nombre, apellidos, sexo, altura, peso)"+
                            " VALUES (?,?,?,?,?,?)");
            Prestatement.setString(1,persona.getDni());
            Prestatement.setString(2,persona.getNombre());
            Prestatement.setString(3,persona.getApellidos());
            Prestatement.setString(4,persona.getSexo());
            Prestatement.setInt(5,persona.getAltura());
            Prestatement.setFloat(6,persona.getPeso());

            //Ejecutamos la consulta
            numerosFilas = Prestatement.executeUpdate();


            Prestatement.close();
            connection.close();

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    return numerosFilas;
    }
    public int Borrardatos (Persona persona){
        int numerofilas=0;
        try {
            Connection connection = conexionBase();
            PreparedStatement preparedStatement= connection.prepareStatement(
                    "delete from persona where dni = ?"
            );
            preparedStatement.setString(1, persona.getDni());
            numerofilas=preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return numerofilas;
    }

    public int ActualizarDatos (Persona persona){
        int numerosFilas = 0;
        try {
            Connection connection = conexionBase();
            PreparedStatement Prestatement = connection.prepareStatement(
                    "UPDATE persona SET nombre = ?, apellidos = ? ,sexo = ?,altura = ? , peso= ? where dni= ?");

            Prestatement.setString(1,persona.getNombre());
            Prestatement.setString(2,persona.getApellidos());
            Prestatement.setString(3,persona.getSexo());
            Prestatement.setInt(4,persona.getAltura());
            Prestatement.setFloat(5,persona.getPeso());
            Prestatement.setString(6,persona.getDni());


            //Ejecutamos la consulta
            numerosFilas = Prestatement.executeUpdate();


            Prestatement.close();
            connection.close();

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return numerosFilas;

    }
}
