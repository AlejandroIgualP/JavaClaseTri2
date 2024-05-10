package org.iesch;

public class Matriculados {


    private Integer id_curso;
    private Integer id_alumno;

    public Matriculados(Integer id_curso, Integer id_alumno) {
        this.id_curso = id_curso;
        this.id_alumno = id_alumno;
    }

    public Matriculados() {
    }

    @Override
    public String toString() {
        return "Matriculados{" +
                ", id_curso=" + id_curso +
                ", id_alumno=" + id_alumno +
                '}';
    }


    public Integer getId_curso() {
        return id_curso;
    }

    public void setId_curso(Integer id_curso) {
        this.id_curso = id_curso;
    }

    public Integer getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(Integer id_alumno) {
        this.id_alumno = id_alumno;
    }
}
