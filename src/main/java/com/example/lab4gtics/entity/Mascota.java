package com.example.lab4gtics.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Mascota {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idmascota")
    private int idmascota;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "anho")
    private String anho;
    @Basic
    @Column(name = "historia")
    private String historia;
    @Basic
    @Column(name = "observaciones")
    private String observaciones;
    @Basic
    @Column(name = "sexo")
    private String sexo;
    @Basic
    @Column(name = "raza_especie_idraza")
    private int razaEspecieIdraza;
    @Basic
    @Column(name = "raza_otros")
    private String razaOtros;
    @Basic
    @Column(name = "cuenta_idcuenta")
    private Integer cuentaIdcuenta;

    public int getIdmascota() {
        return idmascota;
    }

    public void setIdmascota(int idmascota) {
        this.idmascota = idmascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnho() {
        return anho;
    }

    public void setAnho(String anho) {
        this.anho = anho;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getRazaEspecieIdraza() {
        return razaEspecieIdraza;
    }

    public void setRazaEspecieIdraza(int razaEspecieIdraza) {
        this.razaEspecieIdraza = razaEspecieIdraza;
    }

    public String getRazaOtros() {
        return razaOtros;
    }

    public void setRazaOtros(String razaOtros) {
        this.razaOtros = razaOtros;
    }

    public Integer getCuentaIdcuenta() {
        return cuentaIdcuenta;
    }

    public void setCuentaIdcuenta(Integer cuentaIdcuenta) {
        this.cuentaIdcuenta = cuentaIdcuenta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mascota mascota = (Mascota) o;
        return idmascota == mascota.idmascota && razaEspecieIdraza == mascota.razaEspecieIdraza && Objects.equals(nombre, mascota.nombre) && Objects.equals(anho, mascota.anho) && Objects.equals(historia, mascota.historia) && Objects.equals(observaciones, mascota.observaciones) && Objects.equals(sexo, mascota.sexo) && Objects.equals(razaOtros, mascota.razaOtros) && Objects.equals(cuentaIdcuenta, mascota.cuentaIdcuenta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idmascota, nombre, anho, historia, observaciones, sexo, razaEspecieIdraza, razaOtros, cuentaIdcuenta);
    }
}
