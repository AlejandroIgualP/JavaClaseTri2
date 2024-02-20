package Clase;

import Clase_Abstracta.Bicicleta;

public class BiciPaseo extends Bicicleta {

    int velocidad;

    public BiciPaseo(String color, double precio,int velocidad) {
        super(color, precio);
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "BiciPaseo"+ super.toString()+" La velocidad a la que vas= "+velocidad+"Km ";
    }


}

