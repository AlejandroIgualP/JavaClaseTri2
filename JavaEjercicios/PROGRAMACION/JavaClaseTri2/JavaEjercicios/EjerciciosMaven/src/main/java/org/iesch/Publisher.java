package org.iesch;


import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

@XmlRootElement
public class Publisher extends Book{
    private String name;
    private String address;
    private List<Book> books;

    public Publisher(){
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
        Publisher publisher = new Publisher("Pinguino Andante","Calle el Paraiso",listaBook);


        Book book = new Book("Camion Volador","Pepe Alves","2010");
        Book book2 = new Book("Turco Bop","Dani Lomo","2015");


        listaBook.add(book);
        listaBook.add(book2);
        publisher.setBooks(listaBook);

        for (Book recorrer : listaBook){
            System.out.println(recorrer.getTitle());
        }
    }
}
