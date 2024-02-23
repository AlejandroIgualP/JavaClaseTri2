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
public void aumentarMarcha(){
     this.marcha ++;

}
public void disminuirMarcha(){
        this.marcha --;
}
    @Override
    public String toString() {
        return "BiciMontaña "+super.toString()+", Marcha= "+marcha;

    }


}



