package Clase;

import Clase_Abstracta.Bicicleta;

public class Tandem extends Bicicleta {
    private String tipo;

    public Tandem(String color, double precio) {
        super(color, precio);
    }


    @Override
    public String toString() {
        return "Tandem"+ super.toString();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
