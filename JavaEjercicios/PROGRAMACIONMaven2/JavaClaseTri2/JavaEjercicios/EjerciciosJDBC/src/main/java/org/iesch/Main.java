package org.iesch;

import javax.swing.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ConexionBase conexionBase = new ConexionBase();
        ConexionBase conexionBaseCursos = new ConexionBase();
        /*Ejercicio 4
        conexionBase.insertarEstudiantes();
        */

        /*Ejercicio 5
        conexionBase.ModificarDatos();
        */

        /*
        Ejercicio6
        conexionBase.BorrarDatos();
        */

        /*Ejercicio7
        List<Alumnos> listaBuena = conexionBase.listarEstudiantes();
        for (Alumnos listaVertical: listaBuena) {
            System.out.println(listaVertical);
        }
        */
        /*Ejercicio8
        List<Alumnos> l = conexionBase.buscar();
        System.out.println(l);
        */
        /*Ejercicio9
            Hacer unas tablas Nuevas
        */
        /* Ejercicio10

        conexionBaseCursos.insertarCursos();
        conexionBaseCursos.borrarCursos();
        conexionBaseCursos.modificarCursos;
        List<Cursos> listaBuena = conexionBaseCursos.listarCursos();
        for (Alumnos listaVertical: listaBuena){
            System.out.println(listaVertical);
        }
        */
        /* Ejercicio 11
        conexionBaseCursos.InsertarAlumnoCurso();
        */

        /*Ejercicio 12
        conexionBaseCursos.Desmatricular();
        */

        /*Ejercicio13
        conexionBaseCursos.ModificarCursosEMatriculas();
        */

        /*Ejercicio14
        List<Matriculados> listaBuena = conexionBaseCursos.listadoMatriculado();
        for (Matriculados listaVertical: listaBuena) {
            System.out.println(listaVertical);
        }
        */
        //Ejercicio15
        //Parte1

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Dame un  numero"));

    }
}