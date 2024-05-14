package org.alejandroIgual;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cientificos {
    private String nombre;
    private String apellidos;
    private Date fecha_nacimiento;
    private int telefono;


    public Cientificos() {
    }

    public Cientificos(String nombre, String apellidos, Date fecha_nacimiento, int telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;

    }

    @Override
    public String toString() {
        return "Cientificos{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento +
                ", telefono=" + telefono +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


}