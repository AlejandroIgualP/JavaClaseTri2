package org.iesch;

import javax.xml.bind.*;
import javax.xml.bind.annotation.XmlRootElement;

import java.io.File;

import static javax.xml.bind.Marshaller.*;

@XmlRootElement
public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private String matricula;

    public Coche() {
    }

    public Coche(String marca, String modelo, String color, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public static void main(String[] args) {
        Coche coche1 = new Coche("Seat", "Corolla", "Azul", "1342ed2qw");

        JAXBContext jaxbContext;

        {
            try {
                jaxbContext = JAXBContext.newInstance(Coche.class);
                Marshaller marshaller = jaxbContext.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                marshaller.marshal(coche1, new File("CocheXML.xml")); //O tambien System.out;

            } catch (JAXBException e) {
                throw new RuntimeException(e);
            }
        }

        //Deserializar

        try {
            File archivo = new File("CocheXML.xml");
            JAXBContext context = JAXBContext.newInstance(Coche.class);

            Unmarshaller unmarshaller = context.createUnmarshaller();
            Coche coche = (Coche) unmarshaller.unmarshal(archivo);
            System.out.println(coche);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }


    }
}
