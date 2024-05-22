package Ejercicio4;

class Vehiculo{
    private String nombre;
    private int dorsal;
    private int velocidadActual;
    private int velocidadMaxima;
    private String tipoCombustible;
    private int numeroRuedas;

    public Vehiculo() {
    }

    public Vehiculo(String nombre, int dorsal, int velocidadActual, int velocidadMaxima, String tipoCombustible, int numeroRuedas) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.velocidadActual = velocidadActual;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoCombustible = tipoCombustible;
        this.numeroRuedas = numeroRuedas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "nombre='" + nombre + '\'' +
                ", dorsal=" + dorsal +
                ", velocidadActual=" + velocidadActual +
                ", velocidadMaxima=" + velocidadMaxima +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                ", numeroRuedas=" + numeroRuedas +
                '}';
    }


    //Metodos

    public void sonidoMotor() {
        if (this.tipoCombustible.equals("electrico")) {
            System.out.println("Silencio");
        } else if (this.tipoCombustible.equals("gasolina")) {
            System.out.println("brum brum");
        } else if (this.tipoCombustible.equals("gasoil")) {
            System.out.println("sueno a cafetera");
        }
    }

    public void acelerar(int kmh) {
        this.velocidadActual += kmh;
        if (this.velocidadActual > this.velocidadMaxima) {
            this.velocidadActual = this.velocidadMaxima;
        }
    }

    public String mostrarInfo() {
        return "Piloto: " + this.nombre + ", Dorsal: " + this.dorsal + ", "
                + "velocidad actual/maxima: " + this.velocidadActual + "/" + this.velocidadMaxima + ", "
                + "tipo de combustible: " + this.tipoCombustible + ", num.ruedas: " + this.numeroRuedas;
    }

}

