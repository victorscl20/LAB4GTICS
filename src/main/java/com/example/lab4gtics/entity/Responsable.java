package com.example.lab4gtics.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Responsable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idresponsable")
    private int idresponsable;
    @Basic
    @Column(name = "nombre")
    private String nombre;

    public int getIdresponsable() {
        return idresponsable;
    }

    public void setIdresponsable(int idresponsable) {
        this.idresponsable = idresponsable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Responsable that = (Responsable) o;
        return idresponsable == that.idresponsable && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idresponsable, nombre);
    }
}
