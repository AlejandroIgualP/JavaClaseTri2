package org.iesch;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Arrays;

import static com.fasterxml.jackson.databind.cfg.CoercionInputShape.Array;


//Sacar solo los libros MIRAR PubliserLista y AdaptadorLibro
public class main {
    public static void main(String[] args) {

        Book l1 = new Book("Don quijote","Cervantes","1607");
        Book l2 = new Book("Don kikiki","topa","2000");
        Book l3 = new Book("Don pepepe","melendi","1900");

        Publisher publisher = new Publisher();
        publisher.setName("Escolar");
        publisher.setAddress("Plaza san juan");
        publisher.setBooks(Arrays.asList(l1,l2,l3));


        ObjectMapper objectMapper = new ObjectMapper();


        try {
         String json = objectMapper.writeValueAsString(publisher);
         System.out.println(json);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        //Serializar a XML
        try {
            JAXBContext context = JAXBContext.newInstance(Publisher.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
           marshaller.marshal(publisher,System.out);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }


        //De objetos a Importar base de datos

        ObjectMapper objectMapper1 = new ObjectMapper();
        try {
            Connection connection = DriverManager.getConnection();
            Book json = objectMapper1.readValue(new File("book.json"),Book.class);
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO alumno VALUES (?,?)");
            preparedStatement.


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
