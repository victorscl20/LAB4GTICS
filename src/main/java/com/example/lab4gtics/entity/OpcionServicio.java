package com.example.lab4gtics.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "opcion_servicio", schema = "sandylance", catalog = "")
public class OpcionServicio {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idopcion_servicio")
    private int idopcionServicio;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "opcion_idopcion", nullable = false)
    private Opcion opcionIdopcion;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "servicio_idservicio", nullable = false)
    private Servicio servicioIdservicio;

    public int getIdopcionServicio() {
        return idopcionServicio;
    }

    public void setIdopcionServicio(int idopcionServicio) {
        this.idopcionServicio = idopcionServicio;
    }

    public Opcion getOpcionIdopcion() {
        return opcionIdopcion;
    }

    public void setOpcionIdopcion(Opcion opcionIdopcion) {
        this.opcionIdopcion = opcionIdopcion;
    }

    public Servicio getServicioIdservicio() {
        return servicioIdservicio;
    }

    public void setServicioIdservicio(Servicio servicioIdservicio) {
        this.servicioIdservicio = servicioIdservicio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OpcionServicio that = (OpcionServicio) o;
        return idopcionServicio == that.idopcionServicio && opcionIdopcion == that.opcionIdopcion && servicioIdservicio == that.servicioIdservicio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idopcionServicio, opcionIdopcion, servicioIdservicio);
    }
}
