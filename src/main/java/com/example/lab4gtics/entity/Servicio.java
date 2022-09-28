package com.example.lab4gtics.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "servicio", schema = "sandylance", catalog = "")
public class Servicio {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idservicio")
    private int idservicio;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "mascota_idmascota", nullable = false)
    private Mascota mascotaIdmascota;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cuenta_idcuenta", nullable = false)
    private Cuenta cuentaIdcuenta;
    @Basic
    @Column(name = "hora_inicio")
    private Timestamp horaInicio;
    @Basic
    @Column(name = "duracion")
    private int duracion;
    @Basic
    @Column(name = "entrega")
    private String entrega;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "responsable_idresponsable", nullable = false)
    private Responsable responsableIdresponsable;

    public int getIdservicio() {
        return idservicio;
    }

    public void setIdservicio(int idservicio) {
        this.idservicio = idservicio;
    }

    public Mascota getMascotaIdmascota() {
        return mascotaIdmascota;
    }

    public void setMascotaIdmascota(Mascota mascotaIdmascota) {
        this.mascotaIdmascota = mascotaIdmascota;
    }

    public Cuenta getCuentaIdcuenta() {
        return cuentaIdcuenta;
    }

    public void setCuentaIdcuenta(Cuenta cuentaIdcuenta) {
        this.cuentaIdcuenta = cuentaIdcuenta;
    }

    public Timestamp getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Timestamp horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Object getEntrega() {
        return entrega;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    public Responsable getResponsableIdresponsable() {
        return responsableIdresponsable;
    }

    public void setResponsableIdresponsable(Responsable responsableIdresponsable) {
        this.responsableIdresponsable = responsableIdresponsable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Servicio that = (Servicio) o;
        return idservicio == that.idservicio && mascotaIdmascota == that.mascotaIdmascota && cuentaIdcuenta == that.cuentaIdcuenta && duracion == that.duracion && responsableIdresponsable == that.responsableIdresponsable && Objects.equals(horaInicio, that.horaInicio) && Objects.equals(entrega, that.entrega);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idservicio, mascotaIdmascota, cuentaIdcuenta, horaInicio, duracion, entrega, responsableIdresponsable);
    }
}
