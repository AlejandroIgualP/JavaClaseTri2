import java.util.ArrayList;

public class Ciclismo extends ArrayList<Ciclismo> {
    private String name;
    private String pais;
    private Integer edad;

    @Override
    public String toString() {
        return "Ciclismo{" +
                "name='" + name + '\'' +
                ", pais='" + pais + '\'' +
                ", edad=" + edad +
                '}';
    }

    public Ciclismo(String name, String pais, Integer edad) {
        this.name = name;
        this.pais = pais;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }



}


