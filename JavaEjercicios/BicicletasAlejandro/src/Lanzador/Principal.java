package Lanzador;

import Clase.BiciMontania;
import Clase_Abstracta.Bicicleta;

public class Principal {
    public static void main(String[] args) {
    BiciMontania bici1 = new BiciMontania("Verde",60,6);
    bici1.pintar("Azul");
    bici1.Marcha(60);
    System.out.println(bici1);

    }
}
