package org.iesch;

import ConexionBase.ConexionBase;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //READ
        ConexionBase conexionBase = new ConexionBase();
        List<Persona> listPersona = conexionBase.obtenerTodo();
        System.out.println(listPersona);

        // INSERT
        Persona persona = new Persona("21312313R", "Pepe", "Luimi", "Poco", 126F, 178);
        conexionBase.insertar(persona);


        //Update
        Persona persona1 = new Persona("21312313R", "Luis", "Lopez", "Hombre", 156F, 190);
        conexionBase.ActualizarDatos(persona1);

        //Delete
        Persona persona2 = new Persona("21312313R", "Luis", "Lopez", "Hombre", 156F, 190);
        conexionBase.Borrardatos(persona2);

    }
}
