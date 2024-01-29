import java.util.*;

public class Libro {

  private String titulo;
  private String autor;


    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
    public static void main(String[] args) {

        List<Libro> lista = new ArrayList<>();

        Libro libro1 = new Libro("Don quijote", "Cervantes");
        Libro libro2 = new Libro("Orgullo y prejuicio", "Jane Austen");
        Libro libro3 = new Libro("Frankenstein", "Mary Shelley");
        Libro libro4 = new Libro("Don quijote", "Cervantes");
        Libro libro5 = new Libro("Don quijote", "Cervantes");
        Libro libro6 = new Libro("Don quijote", "Cervantes");
        Libro libro7 = new Libro("Los tres mosqueteros", "Alexandre Dumas");
        Libro libro8 = new Libro("Don quijote", "Cervantes");
        Libro libro9 = new Libro("Cumbres borrascosas", "Emily Brontë");



        lista.add(libro1);
        lista.add(libro2);
        lista.add(libro3);
        lista.add(libro4);
        lista.add(libro5);
        lista.add(libro6);
        lista.add(libro7);
        lista.add(libro8);
        lista.add(libro9);
        System.out.println(lista);

        Set<Libro> Lista_sinduplicados = new HashSet<Libro>(lista);
        lista.clear();
        lista.addAll(Lista_sinduplicados);
        System.out.println(Lista_sinduplicados);


}


}
