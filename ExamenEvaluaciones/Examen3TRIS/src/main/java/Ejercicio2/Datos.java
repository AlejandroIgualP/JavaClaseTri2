package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Datos {
    private List<Estudios> datos;


//Constructor
    public Datos() {
        this.datos = new ArrayList<>();
    }
//Get
    public Datos(List<Estudios> datos) {
        this.datos = datos;
    }

    public List<Estudios> getDatos() {
        return datos;
    }
//Set
    public void setDatos(List<Estudios> datos) {
        this.datos = datos;
    }
//ToString
    @Override
    public String toString() {
        return "Datos{" +
                "datos=" + datos +
                '}';
    }
}
