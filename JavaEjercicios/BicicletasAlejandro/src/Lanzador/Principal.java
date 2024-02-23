package Lanzador;

import Clase.BiciMontania;
import Clase.BiciPaseo;
import Clase.Tandem;
import Clase_Abstracta.Bicicleta;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
    BiciMontania bici1 = new BiciMontania("Verde",60,6);
    bici1.pintar("Azul");
    bici1.aumentarMarcha();
    bici1.disminuirMarcha();
    System.out.println(bici1);
    BiciMontania biciMontania1 = new BiciMontania("Gris",120,12);
    biciMontania1.pintar("Rojo");
    biciMontania1.aumentarMarcha();
    biciMontania1.disminuirMarcha();
    System.out.println(biciMontania1);
    //BiciPaseo
    BiciPaseo bici2 = new BiciPaseo("Rosa",30,20);
    bici2.pintar("Morado");
    System.out.println(bici2);
    // Tandem
    Tandem bici3 = new Tandem("Lila",80,2);
    System.out.println(bici3);
    Tandem bici4 = new Tandem("Azul",40,9);
    System.out.println(bici4);
    //Lista para las bicis

        ArrayList<Bicicleta> lista_bicis = new ArrayList<>();
        lista_bicis.add(bici1);
        lista_bicis.add(biciMontania1);
        lista_bicis.add(bici2);
        lista_bicis.add(bici3);
        lista_bicis.add(bici4);
        for (Bicicleta bicis: lista_bicis) {
            System.out.println(bicis);
        }
    }

}
