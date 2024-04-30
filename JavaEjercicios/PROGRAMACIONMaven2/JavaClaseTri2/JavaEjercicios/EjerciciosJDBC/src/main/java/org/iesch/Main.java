package org.iesch;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ConexionBase conexionBase = new ConexionBase();

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
        */
        List<Alumnos> l = conexionBase.buscar();
        System.out.println(l);

    }
}