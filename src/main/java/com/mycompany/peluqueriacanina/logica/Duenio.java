package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duenio implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_duenio;
    
    private String nombre;
    private String celular;

    public Duenio() {
    }

    public Duenio(String nombre, String celular, int id_duenio) {
        this.nombre = nombre;
        this.celular = celular;
        this.id_duenio = id_duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }

    @Override
    public String toString() {
        return "Duenio{" + "nombre=" + nombre + ", celular=" + celular + ", id_duenio=" + id_duenio + '}';
    }
    
    
}
