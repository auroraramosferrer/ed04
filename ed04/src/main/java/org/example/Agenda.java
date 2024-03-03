package org.example;

import java.util.*;

/**
 * Clase que contiene y permite modificar una lista de contactos
 * @author auroraramosferrer
 * @version 1.0 3/3/24
 * @see Contacto
 */
public class Agenda {

    /** Lista de Contacto */
    private List<Contacto> contacts;

    /** Constructor de la clase Agenda */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Añade un contacto
     * @param name nombre del contacto
     * @param phone teléfono del contacto
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Elimina un contacto
     * @param name nombre del contacto
     */
    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Modifica un número de teléfono del contacto
     * @param name nombre del contacto
     * @param oldPhone número de teléfono que queremos modificar
     * @param newPhone nuevo número de teléfono
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Devuelve la lista de contactos
     * @return contacts
     */
    public List<Contacto> getContacts() {
        return this.contacts;
    }
}