package org.iesch;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class AdaptadorTituloLibros extends XmlAdapter<String, Book> {


    //Deserializar
    @Override
    public Book unmarshal(String titulo) throws Exception {
        Book book = new Book();
        book.setTitle(titulo);
        return book;
    }

    //Serializar
    @Override
    public String marshal(Book book) throws Exception {
        return book.getTitle();
    }
}
