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
    @ManyToOne
    @JoinColumn(name = "raza_especie_idraza")
    private RazaEspecie razaEspecie;
    @Basic
    @Column(name = "raza_otros")
    private String razaOtros;
    @ManyToOne
    @JoinColumn(name = "cuenta_idcuenta")
    private Cuenta cuentaIdcuenta;


    public RazaEspecie getRazaEspecie() {
        return razaEspecie;
    }

    public void setRazaEspecie(RazaEspecie razaEspecie) {
        this.razaEspecie = razaEspecie;
    }

    public void setCuentaIdcuenta(Cuenta cuentaIdcuenta) {
        this.cuentaIdcuenta = cuentaIdcuenta;
    }

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


    public String getRazaOtros() {
        return razaOtros;
    }

    public void setRazaOtros(String razaOtros) {
        this.razaOtros = razaOtros;
    }




}
