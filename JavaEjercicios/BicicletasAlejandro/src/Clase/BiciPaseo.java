package Clase;

import Clase_Abstracta.Bicicleta;

public class BiciPaseo extends Bicicleta {
    private String tipo;

    public BiciPaseo(String color, double precio) {
        super(color, precio);
    }

    @Override
    public String toString() {
        return "BiciPaseo"+ super.toString();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

