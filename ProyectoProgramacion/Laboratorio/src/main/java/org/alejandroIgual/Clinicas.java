package org.alejandroIgual;

import java.util.ArrayList;
import java.util.List;

public class Clinicas {

    private String nombre;

    List<Experimentos> lista_Experimentos = new ArrayList<>();

    public Clinicas() {
    }

    public Clinicas(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Clinicas{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
