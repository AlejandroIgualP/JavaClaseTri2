package Clase;

import Clase_Abstracta.Bicicleta;

public class BiciMontania extends Bicicleta {
        int marcha;

    public BiciMontania(String color, double precio,int marcha) {
        super(color, precio);
            if (marcha>0 && marcha<7){
                this.marcha = marcha;
            }else {
                this.marcha = marcha;
                System.out.println("La marcha es superior");
            }

    }

    @Override
    public String toString() {
        return "BiciMontaña "+super.toString()+" marcha= "+marcha;

    }


}



