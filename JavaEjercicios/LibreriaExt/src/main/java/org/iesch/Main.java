package org.iesch;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        String url = "https://www.google.com/search?q=Java+21";

        System.out.println("Protocolo: "+StringUtils.substringBefore(url,"//"));
        System.out.println("Dominio: "+ StringUtils.substringBetween(url, "://", "/"));
        System.out.println("Ruta de acceso: " +StringUtils.substringBetween(url,"com/","?"));
        System.out.println("Criterio de busqueda: "+ StringUtils.substringAfter(url,"=").replace("+"," "));
    }
}