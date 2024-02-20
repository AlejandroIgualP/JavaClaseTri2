package Lanzador;

import Clase.BiciMontania;
import Clase.BiciPaseo;
import Clase_Abstracta.Bicicleta;

public class Principal {
    public static void main(String[] args) {
    BiciMontania bici1 = new BiciMontania("Verde",60,6);
    bici1.pintar("Azul");
    System.out.println(bici1);
    BiciPaseo bici2 = new BiciPaseo("Rosa",30,20);
    bici2.pintar("Morado");
    System.out.println(bici2);

    }
}
