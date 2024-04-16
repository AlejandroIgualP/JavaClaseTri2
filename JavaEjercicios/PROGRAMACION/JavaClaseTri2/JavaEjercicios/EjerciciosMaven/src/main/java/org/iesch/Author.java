package org.iesch;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private List BookWritten;

    public Author() {
    }

    public Author(String name, List bookWritten) {
        this.name = name;
        BookWritten = bookWritten;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getBookWritten() {
        return BookWritten;
    }

    public void setBookWritten(List bookWritten) {
        BookWritten = bookWritten;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", BookWritten=" + BookWritten +
                '}';
    }

    public static void main(String[] args) {


        List<String> listaLibros = new ArrayList<>();
        listaLibros.add(0,"Caminante Sin camino");
        listaLibros.add(1,"Estrella fugaz");
        listaLibros.add(2,"La luna Amarilla");



        Author author = new Author("Luisma Perez",listaLibros);


        //Serializar JSON

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            File archivo = new File("AuthorJ.json");
            String json = objectMapper.writeValueAsString(author);
            System.out.println(json);
            objectMapper.writeValue(archivo,author);


        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Serializar XML

        try {

            JAXBContext context = JAXBContext.newInstance(Author.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            marshaller.marshal(author,new File("AuthorJ.json"));

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }

    }
}
