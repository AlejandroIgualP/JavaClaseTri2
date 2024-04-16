package org.iesch;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookStore {

    private List<Book> listaBook;
    private List<Author> listaAuthor;

    public BookStore() {
    }

    public BookStore(List<Book> listaBook, List<Author> listaAuthor) {
        this.listaBook = listaBook;
        this.listaAuthor = listaAuthor;
    }

    public List<Book> getListaBook() {
        return listaBook;
    }

    public void setListaBook(List<Book> listaBook) {
        this.listaBook = listaBook;
    }

    public List<Author> getListaAuthor() {
        return listaAuthor;
    }

    public void setListaAuthor(List<Author> listaAuthor) {
        this.listaAuthor = listaAuthor;
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "listaBook=" + listaBook +
                ", listaAuthor=" + listaAuthor +
                '}';
    }

    //
    public static void main(String[] args) {
        List<Book> listaBook = new ArrayList<>();
        Book libro = new Book("Kilo menos","Jesus Perez","2010");
        Book libro1 = new Book("Yuto Julian","Jesus Perez","2002");
        Book libro2 = new Book("Write DOS","Jesus Perez","1978");

        listaBook.add(libro);
        listaBook.add(libro1);
        listaBook.add(libro2);

        List<Author> listaAuthor = new ArrayList<>();
        Author author = new Author("Jesus Perez",listaBook);
        listaAuthor.add(author);
        System.out.println(listaAuthor);


        ObjectMapper objectMapper = new ObjectMapper();
        try {
            File archivo = new File("BookStore.json");
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

            JAXBContext context = JAXBContext.newInstance(BookStore.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            marshaller.marshal(author,new File("AuthorJ.json"));

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }

    }
}
