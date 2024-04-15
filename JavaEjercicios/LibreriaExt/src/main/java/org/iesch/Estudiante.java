package org.iesch;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.nio.file.Paths;
import java.util.List;

public class Estudiante {
    private String nombre;
    private int edad;
    private String asignatura;
    private boolean aprobado;

    public Estudiante() {
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", asignatura='" + asignatura + '\'' +
                ", aprobado=" + aprobado +
                '}';
    }

    public Estudiante(String nombre, int edad, String asignatura, boolean aprobado) {
        this.nombre = nombre;
        this.edad = edad;
        this.asignatura = asignatura;
        this.aprobado = aprobado;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }


    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("ale", 12, "mates", true);


        /* Sererializar
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String json = objectMapper.writeValueAsString(estudiante);
            System.out.println(json);

            File file = new File("EstudientaManual.json");
            objectMapper.writeValue(file,json);
            objectMapper.writeValue(Paths.get("estudiante.json").toFile(),estudiante);

            -> Escribir en un fichero creado por el usuario
            FileWriter fileWriter = new FileWriter("D:\\Users\\dam1\\Desktop\\JavaClaseTri2\\JavaEjercicios\\LibreriaExt\\src\\main\\java\\org\\iesch\\archivo.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(json);
            bufferedWriter.flush();



        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    */

        //Deserializar

        ObjectMapper objectMapper = new ObjectMapper();
        Estudiante estudiante1 = null;
        try {
            estudiante1 = objectMapper.readValue(new File("estudiante.json"), Estudiante.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(estudiante1);
    }
}

