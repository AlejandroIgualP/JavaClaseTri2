package Clase;

import Clase_Abstracta.Bicicleta;

public class Tandem extends Bicicleta {

    int asiento;
    public Tandem(String color, double precio,int asiento) {
        super(color, precio);
      if (asiento == 2 || asiento == 3){
          this.asiento = asiento;
      }else {
          System.out.println("No se permiten esos asientos");
          this.asiento=asiento;
      }
    }



    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    @Override
    public String toString() {
        return "Tandem"+ super.toString()+", Numero de asientos= "+asiento;
    }


}
