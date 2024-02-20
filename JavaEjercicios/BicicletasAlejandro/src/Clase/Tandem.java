package Clase;

import Clase_Abstracta.Bicicleta;

public class Tandem extends Bicicleta {


    public Tandem(String color, double precio) {
        super(color, precio);
    }


    @Override
    public String toString() {
        return "Tandem"+ super.toString();
    }


}
