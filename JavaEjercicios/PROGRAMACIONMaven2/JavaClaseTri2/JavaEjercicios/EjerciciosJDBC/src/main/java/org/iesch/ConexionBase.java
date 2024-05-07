package org.iesch;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


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
/*
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
 */

    /*
    public int BorrarDatos(){
        int numerosFilas = 0;

        int id = Integer.parseInt(JOptionPane.showInputDialog("Dame un id"));

        try {
            Connection connection = DriverManager.getConnection(url,name,pass);
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "DELETE FROM alumno WHERE id = ?");


            preparedStatement.setInt(1,id);

            numerosFilas = preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return numerosFilas;
    }
    */
    /*
    public List<Alumnos> listarEstudiantes() {
        List<Alumnos> listaAlumno = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(url, name, pass);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * FROM alumno");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String apellidos = resultSet.getString("apellidos");
                String direccion = resultSet.getString("direccion");

                Alumnos alumnos = new Alumnos(id, nombre, apellidos, direccion);
                listaAlumno.add(alumnos);

            }
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaAlumno;
    }
    */
    /*
     public List<Alumnos> buscar() {
         List<Alumnos> listaAlumno = new ArrayList<>();
         try {
             Connection connection = DriverManager.getConnection(url, name, pass);


             Scanner scanner = new Scanner(System.in);
             System.out.println("Dame un numero de 1->(Por Dni) | 2-> (Por nombre o Apellidos) | 3->(Por nombre y Apellidos Incompletos)");
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


                 default: {

                     System.out.println("Pon un numero de 1 - 4 PORFAVOR");
                 }

             }

         } catch (SQLException e) {
             throw new RuntimeException(e);
         }
      return listaAlumno;
     }
     */
    /*
    public int insertarCursos () {
        int numerofilas = 0;

        String nombre = JOptionPane.showInputDialog("Dame un nombre");
        String instructor = JOptionPane.showInputDialog("Dame un instructor");



        try {
            Connection connection = DriverManager.getConnection(url, name, pass);
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO cursos (nombre,instructor) VALUES (?,?)");
            //autoincremental no debes pasarle nada.
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, instructor);
            preparedStatement.execute();


            connection.close();
            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return numerofilas;
    }
    */
    /*
    public int borrarCursos () {
        int numeroFilas = 0;

        String nombre = JOptionPane.showInputDialog("Dame un nombre");
            try {
                Connection connection = DriverManager.getConnection(url, name, pass);
                PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM cursos WHERE nombre = ?");
                preparedStatement.setString(1,nombre);
                preparedStatement.execute();

                connection.close();
                preparedStatement.close();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return numeroFilas;
        }

    }
     */
    /*
    public int ModificarCursos(){
        int numerosFilas = 0;

        Integer id = Integer.valueOf(JOptionPane.showInputDialog("Dame un id"));
        String nombre = JOptionPane.showInputDialog("Dame un nombre");
        String instructor = JOptionPane.showInputDialog("Dame un Instructor");

        try {
            Connection connection = DriverManager.getConnection(url,name,pass);
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE cursos SET nombre = ? ,instructor = ? WHERE id = ?");

            preparedStatement.setString(1,nombre);
            preparedStatement.setString(2,instructor);
            preparedStatement.setInt(3,id);
            preparedStatement.execute();

            connection.close();
            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return numerosFilas;
    }
    */

    /*
    public int listarCursos(){
        int numeroFilas = 0;

        List<Cursos> listaCursos = new ArrayList<>();

        try {
            Connection connection = DriverManager.getConnection(url,name,pass);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM cursos");
            ResultSet resultSet = preparedStatement.getResultSet();

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String instructor = resultSet.getString("instructor");

                Cursos cursos = new Cursos(id,nombre,instructor);
                listaCursos.add(cursos);
            }

            preparedStatement.execute();
            connection.close();
            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return numeroFilas;
    }
    */

    /*
    public int InsertarAlumnoCurso(){
        int numeroFilas = 0;
        int id_curso = Integer.parseInt(JOptionPane.showInputDialog("Dame un id de un cursos"));
        int id_alumno = Integer.parseInt(JOptionPane.showInputDialog("Dame un id de alumnos"));
        try {
            Connection connection = DriverManager.getConnection(url,name,pass);
            PreparedStatement statement = connection.prepareStatement("INSERT INTO matriculados (id_curso,id_alumno) VALUES (?,?)");
            statement.setInt(1,id_curso);
            statement.setInt(2,id_alumno);
            statement.execute();

            connection.close();
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return numeroFilas;
    }
    */

    /*
    public int Desmatricular(){
        int numeroFilas = 0;
        int id_matricula = Integer.parseInt(JOptionPane.showInputDialog("Dame un id de una matricula"));
        int id_alumno = Integer.parseInt(JOptionPane.showInputDialog("Dame un id de un alumno"));


        try {
            Connection connection = DriverManager.getConnection(url,name,pass);
            PreparedStatement statement = connection.prepareStatement("DELETE FROM matriculados WHERE id_matricula = ? AND id_alumno = ?");
            statement.setInt(1,id_matricula);
            statement.setInt(2,id_alumno);
            statement.execute();

            connection.close();
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return numeroFilas;
    }
    */
    /*
    public int ModificarCursosEMatriculas(){
        int numeroFilas = 0;
        int id_matricula = Integer.parseInt(JOptionPane.showInputDialog("Dame una matricula"));
        int id_curso = Integer.parseInt(JOptionPane.showInputDialog("Dame un id de un curso"));
        try {

             Connection  connection = DriverManager.getConnection(url,name,pass);
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE matriculados SET id_matricula = ? AND id_curos = ?");
            preparedStatement.setInt(1,id_matricula);
            preparedStatement.setInt(2,id_curso);
            preparedStatement.execute();

            connection.close();
            preparedStatement.close();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        return numeroFilas;
    }
     */
    /*
    public List<Matriculados> listadoMatriculado(){
        List<Matriculados> listaCursos = new ArrayList<>();

            try {

            int id_alumnoUnic = Integer.parseInt(JOptionPane.showInputDialog("Dame un id"));

            Connection connection = DriverManager.getConnection(url,name,pass);
            PreparedStatement preparedStatement = connection.prepareStatement("Select id_curso FROM matriculados WHERE id_alumno = ?");
            preparedStatement.setInt(1,id_alumnoUnic);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id_curso = resultSet.getInt("id_curso");



                Matriculados matriculados = new Matriculados(id_curso,id_alumnoUnic);
                listaCursos.add(matriculados);
            }

            preparedStatement.execute();
            connection.close();
            preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaCursos;
    }
     */

    public List<Matriculados> CursosExistentes(){
        List<Matriculados> listaCursos = new ArrayList<>();



            try {
                Connection connection = DriverManager.getConnection(url,name,pass);
                PreparedStatement preparedStatement = connection.prepareStatement("Select id_curso,id_alumno FROM matriculados");
                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {

                    int id_curso = resultSet.getInt("id_curso");
                    int id_alumno = resultSet.getInt("id_alumno");

                    Matriculados matriculados = new Matriculados(id_curso,id_alumno);
                    listaCursos.add(matriculados);


                }
                preparedStatement.execute();
                connection.close();
                preparedStatement.close();
                resultSet.close();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return listaCursos;
    }
    public List<Alumnos> CursoSeleccionado(){
        List<Alumnos> listaCursoSeleccionado = new ArrayList<>();
        int id_cursos = Integer.parseInt(JOptionPane.showInputDialog("Dame un id de los cursos vistos"));

        try {
            Connection connection1 = DriverManager.getConnection(url,name,pass);
            PreparedStatement preparedStatement1 = connection1.prepareStatement("Select id,nombre,apellidos,direccion FROM alumno INNER JOIN matriculados ON alumno.id = matriculados.id_alumno WHERE id_curso = ? ");
            preparedStatement1.setInt(1,id_cursos);
            ResultSet resultSet1 = preparedStatement1.executeQuery();

            while (resultSet1.next()){
                int id = resultSet1.getInt("id");
                String nombre = resultSet1.getString("nombre");
                String apellidos = resultSet1.getString("apellidos");
                String direccion = resultSet1.getString("direccion");

                Alumnos alumnos = new Alumnos(id,nombre,apellidos,direccion);
                listaCursoSeleccionado.add(alumnos);
            }

            preparedStatement1.execute();
            connection1.close();
            preparedStatement1.close();
            resultSet1.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaCursoSeleccionado;
    }
}