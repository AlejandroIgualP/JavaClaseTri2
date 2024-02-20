package Clase;

import Clase_Abstracta.Bicicleta;

public class BiciMontania extends Bicicleta {


    public BiciMontania(String color, double precio,int marcha) {

        super(color, precio);
    }

    @Override
    public String toString() {
        return "BiciMontaña "+super.toString();

    }

    public void Marcha(int marcha){
        if (marcha>0 && marcha<7){
            System.out.println("Vas en la marcha adecuada");
            return;
        }else {
            System.out.println("La marcha es superior");
        }
    }
}



