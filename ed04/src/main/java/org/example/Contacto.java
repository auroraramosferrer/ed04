package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que contiene la información del contacto
 * @author auroraramosferrer
 * @version 1.0 3/3/24
 * @see Agenda
 */
public class Contacto {

    /** Nombre del contacto  */
    private String name;

    /** Lista de números del contacto */
    private List<String> phones;

    /**
     * Constructor de la clase Contacto
     * @param name nombre del contacto
     * @param phone lista de números del contacto
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Devuelve el nombre del contacto
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Devuelve el listado de teléfonos del contacto
     * @return phones
     */
    public List<String> getPhones() {
        return this.phones;
    }

}