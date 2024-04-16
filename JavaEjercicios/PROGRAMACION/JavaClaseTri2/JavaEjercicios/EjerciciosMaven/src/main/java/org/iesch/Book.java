package org.iesch;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@XmlRootElement
public class Book {
    private String title;
    private String author;
    private String yearPublished;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished='" + yearPublished + '\'' +
                '}';
    }

    public Book() {
    }

    public Book(String title, String author, String yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(String yearPublished) {
        this.yearPublished = yearPublished;
    }

    public static void main(String[] args) {
        Book book = new Book("2 mas que uno","Menbrillo","2010");

        ObjectMapper objectMapper = new ObjectMapper();
        try {

            String json = objectMapper.writeValueAsString(book);
            System.out.println(json);
            objectMapper.writeValue(Paths.get("book.json").toFile(),book);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Ejercicio2

        ObjectMapper objectMapper1 = new ObjectMapper();
        Book book1 = null;
        try {
        book1 = objectMapper1.readValue(new File("book.json"),Book.class);


        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Marshall
        //Ejercicio5
        Book book3 = new Book("dfadfa","fadafaa","fadadfs");
        try {
            JAXBContext context = JAXBContext.newInstance(Book.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(book3, new File("BookXML.xml"));

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }

        //Deserializacion

        try {
            File archivo = new File("BookXML.xml");
            JAXBContext context = JAXBContext.newInstance(Book.class);

            Unmarshaller unmarshaller = context.createUnmarshaller();
            Book book4 = (Book) unmarshaller.unmarshal(archivo);
            System.out.println(book4);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }


    }
}
