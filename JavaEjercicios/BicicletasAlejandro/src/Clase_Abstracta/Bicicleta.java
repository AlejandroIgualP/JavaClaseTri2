package Clase_Abstracta;

import Interf.Pintar;

public class Bicicleta implements Pintar {
    private String color;
    private double precio;

    public Bicicleta(String color, double precio) {
        this.color = color;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Bicicleta" +
                "color='" + color + '\'' +
                ", precio=" + precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }



    @Override
    public Object pintar(String color) {
        this.precio+=90;
        this.color=color;
        return null;
    }
}
