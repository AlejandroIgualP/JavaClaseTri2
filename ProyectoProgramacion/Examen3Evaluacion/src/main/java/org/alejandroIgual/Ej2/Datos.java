package org.alejandroIgual.Ej2;

import java.util.ArrayList;
import java.util.List;

public class Datos {

    List<Estudios> datos = new ArrayList<>();

    public Datos() {
    }


    public Datos(List<Estudios> datos) {
        this.datos = datos;
    }

    public List<Estudios> getDatos() {
        return datos;
    }

    public void setDatos(List<Estudios> datos) {
        this.datos = datos;
    }

    @Override
    public String toString() {
        return "Datos{" +
                "datos=" + datos +
                '}';
    }
}
