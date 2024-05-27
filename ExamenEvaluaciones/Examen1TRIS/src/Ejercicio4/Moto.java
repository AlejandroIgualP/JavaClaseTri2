package Ejercicio4;

public class Moto extends Vehiculo {
    private String abrochado;

    public Moto(String abrochado) {
        this.abrochado = abrochado;
    }

    public Moto(String nombre, int dorsal, int velocidadActual, int velocidadMaxima, String tipoCombustible, int numeroRuedas, String abrochado) {
        super(nombre, dorsal, velocidadActual, velocidadMaxima, tipoCombustible, numeroRuedas);
        this.abrochado = abrochado;
    }

    public void abrocharCasco() {
        this.abrochado = "abrochado";
        System.out.println("El piloto con dorsal " + this.getDorsal() + " se ha abrochado el casco");
    }

    public String mostrarInfo() {
        if (this.abrochado.equals("abrochado")) {
            return "La moto con " + super.toString() + ", tiene el casco " + this.abrochado;
        }
        return "La moto con " + super.toString();
    }
}

