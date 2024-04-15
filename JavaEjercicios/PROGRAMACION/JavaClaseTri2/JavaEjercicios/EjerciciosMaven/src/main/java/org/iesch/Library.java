package org.iesch;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Library {

    private List<Book> libro;

    public List<Book> getLibro() {
        return libro;
    }

    public Library() {
    }

    @Override
    public String toString() {
        return "Library{" +
                "libro=" + libro +
                '}';
    }

    public void setLibro(List<Book> libro) {
        this.libro = libro;
    }

    public static void main(String[] args) {

         List<Book> listaLibro = new ArrayList<>();

       Library library = new Library();
       Book libro1 = new Book("cacsas","dfsaafas","dfasasdf");
       Book libro2 = new Book("cacsas","dfsaafas","dfasasdf");
       Book libro3 = new Book("cacsas","dfsaafas","dfasasdf");

       listaLibro.add(libro1);
       listaLibro.add(libro2);
       listaLibro.add(libro3);
       library.setLibro(listaLibro);

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String json = objectMapper.writeValueAsString(library);
            objectMapper.writeValue(Paths.get("Library.json").toFile(),library);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Deserializar

        ObjectMapper objectMapper1 = new ObjectMapper();

        Library library1 = null;
        try {
          library1 =  objectMapper1.readValue(new File("Library.json"),Library.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(library1);
    }

}
