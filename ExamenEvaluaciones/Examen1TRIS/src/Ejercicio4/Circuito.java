package Ejercicio4;

import java.util.ArrayList;

class Circuito{
    private String nombre;
    private ArrayList<Object> listaParticipantes;

    public Circuito(String nombre) {
        this.nombre = nombre;
        this.listaParticipantes = new ArrayList<>();
    }

    public void addParticipante(Object participante) {
        this.listaParticipantes.add(participante);
    }

    public void mostrarInfo() {
        System.out.println("Nombre del circuito: " + this.nombre);
        System.out.println("Lista de Participantes:");
    }

    public void inicializaCarrera() {
        for (Object elemento : this.listaParticipantes) {
            if (elemento instanceof Coche) {
                ((Coche) elemento).mostrarInfo();
            } else if (elemento instanceof Moto) {
                ((Moto) elemento).mostrarInfo();
            }
        }
    }
}