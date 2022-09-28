package com.example.lab4gtics.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "raza_especie", schema = "sandylance", catalog = "")
public class RazaEspecie {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idraza")
    private int idraza;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;

    public int getIdraza() {
        return idraza;
    }

    public void setIdraza(int idraza) {
        this.idraza = idraza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RazaEspecie that = (RazaEspecie) o;
        return idraza == that.idraza && Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idraza, descripcion);
    }
}
