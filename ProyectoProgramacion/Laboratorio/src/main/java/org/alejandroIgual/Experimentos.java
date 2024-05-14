package org.alejandroIgual;

import java.util.Date;

public class Experimentos {

    private String nombre;
    private String descripcion;
    private Date fecha_inicio;
    private Date fecha_finalizacion;
    private String CientificoResponsable;

    private String estado;

    public Experimentos() {
    }

    public Experimentos(String nombre, String descripcion, Date fecha_inicio, Date fecha_finalizacion, String cientificoResponsable, String estado) {

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_finalizacion = fecha_finalizacion;
        CientificoResponsable = cientificoResponsable;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Experimentos{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fecha_inicio=" + fecha_inicio +
                ", fecha_finalizacion=" + fecha_finalizacion +
                ", CientificoResponsable='" + CientificoResponsable + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_finalizacion() {
        return fecha_finalizacion;
    }

    public void setFecha_finalizacion(Date fecha_finalizacion) {
        this.fecha_finalizacion = fecha_finalizacion;
    }

    public String getCientificoResponsable() {
        return CientificoResponsable;
    }

    public void setCientificoResponsable(String cientificoResponsable) {
        CientificoResponsable = cientificoResponsable;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
