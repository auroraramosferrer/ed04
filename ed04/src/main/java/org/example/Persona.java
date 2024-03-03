package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que contiene la información del contacto
 * @author auroraramosferrer
 * @version 1.0 3/3/24
 * @see Agenda
 */
public class Persona {



    /** Nombre del contacto  */
    private String name;

    /** Lista de números del contacto */
    private List<String> phones;

    /**
     * Constructor de la clase Contacto
     * @param name nombre del contacto
     * @param phone lista de números del contacto
     */
    public Persona(String name, String phone) {
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


    /**
     * Método que permite asignar valor al atributo name
     * @param name nombre del contacto
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Método que pertmite asignar valor al atribuno phones
     * @param phones número de teléfono del contacto
     */
    public void setPhones(List<String> phones){
        this.phones = phones;
    }

}