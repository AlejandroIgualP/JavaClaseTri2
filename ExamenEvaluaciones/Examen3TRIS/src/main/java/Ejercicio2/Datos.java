package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Datos {
    private List<Estudios> datos;

    public Datos() {
        this.datos = new ArrayList<>();
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
