package org.iesch;

public class Alumnos {

private int dni;
private String nombre;
private String apellidos;
private String direccion;

    public Alumnos() {
    }

    public Alumnos(int dni, String nombre, String apellidos, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                ",dni='"+ dni + '\''+
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}

