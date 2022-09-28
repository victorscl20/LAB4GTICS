package com.example.lab4gtics.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Opcion {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idopcion")
    private int idopcion;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;
    @Basic
    @Column(name = "tiempo_minutos")
    private int tiempoMinutos;
    @Basic
    @Column(name = "precio")
    private double precio;

    public int getIdopcion() {
        return idopcion;
    }

    public void setIdopcion(int idopcion) {
        this.idopcion = idopcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempoMinutos() {
        return tiempoMinutos;
    }

    public void setTiempoMinutos(int tiempoMinutos) {
        this.tiempoMinutos = tiempoMinutos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opcion opcion = (Opcion) o;
        return idopcion == opcion.idopcion && tiempoMinutos == opcion.tiempoMinutos && Double.compare(opcion.precio, precio) == 0 && Objects.equals(descripcion, opcion.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idopcion, descripcion, tiempoMinutos, precio);
    }
}
