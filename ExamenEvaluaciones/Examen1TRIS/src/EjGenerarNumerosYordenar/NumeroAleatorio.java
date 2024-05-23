package EjGenerarNumerosYordenar;

import java.util.Comparator;
import java.util.Objects;

public class NumeroAleatorio implements Comparable<NumeroAleatorio> {
    private Integer id;
    private Integer veces;

    public NumeroAleatorio() {
    }

    public NumeroAleatorio(Integer id, Integer veces) {
        this.id = id;
        this.veces = veces;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVeces() {
        return veces;
    }

    public void setVeces(Integer veces) {
        this.veces = veces;
    }

    @Override
    public String toString() {
        return "NumeroAleatorio{" +
                "id=" + id +
                ", veces=" + veces +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumeroAleatorio that = (NumeroAleatorio) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(NumeroAleatorio o) {
        if (this.veces<o.veces){return 1;}
        else if (this.veces==o.veces){return 0;}
        else {return -1;}
    }
}
