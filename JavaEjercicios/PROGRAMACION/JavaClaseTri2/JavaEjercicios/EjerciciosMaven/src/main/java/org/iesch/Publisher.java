package org.iesch;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

@XmlRootElement
public class Publisher extends Book {
    private String name;
    private String address;
    private List<Book> books;

    public Publisher() {
    }

    public Publisher(String name, String address, List<Book> books) {
        this.name = name;
        this.address = address;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", books=" + books +
                '}';
    }

    public static void main(String[] args) {

        List<Book> listaBook = new ArrayList<>();
        List<String> solo_Titulo = new ArrayList<>();
        Publisher publisher = new Publisher("Pinguino Andante", "Calle el Paraiso", listaBook);


        Book book = new Book("Camion Volador", "Pepe Alves", "2010");
        Book book2 = new Book("Turco Bop", "Dani Lomo", "2015");


        listaBook.add(book);
        listaBook.add(book2);
        publisher.setBooks(listaBook);

        for (Book recorrer : listaBook) {
            String titulo = recorrer.getTitle();
            solo_Titulo.add(titulo);

            System.out.println(solo_Titulo);


            // Serializar en Json
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                String json = objectMapper.writeValueAsString(recorrer.getTitle());
                System.out.println(json);
                objectMapper.writeValue(new File("Publisher.json"), recorrer.getTitle());

            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        //Serializar en Xml
        Book libroXML = new Book("No se que pasa", "Juanma Pepe", "1999");

        try {

            File archivo = new File("PubliserXml.xml");
            JAXBContext context = JAXBContext.newInstance(Publisher.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(libroXML.getTitle(), archivo);


        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
