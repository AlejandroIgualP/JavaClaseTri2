package Ejercicio4;

public class Coche extends Vehiculo {
    private String ventanilla;

    public Coche(String ventanilla) {
        this.ventanilla = ventanilla;
    }

    public Coche(String nombre, int dorsal, int velocidadActual, int velocidadMaxima, String tipoCombustible, int numeroRuedas, String ventanilla) {
        super(nombre, dorsal, velocidadActual, velocidadMaxima, tipoCombustible, numeroRuedas);
        this.ventanilla = ventanilla;
    }

    //Metodos
    public void bajarVentanilla() {
        this.ventanilla = "bajada";
        System.out.println("La ventanilla del coche con dorsal " + this.getDorsal() + " esta bajada");
    }

    public String mostrarInfo() {
        if (this.ventanilla.equals("bajada")) {
            return "El coche con " + super.toString() + ", tiene la ventanilla " + this.ventanilla;
        }
        return "El coche con " + super.toString();
    }
}
