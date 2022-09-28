package com.example.lab4gtics.Repository;

import com.example.lab4gtics.Controller.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MascotaRepository extends JpaRepository<Mascota, Integer> {

    @Query(nativeQuery = true,value = "select * from mascota where lower(sexo) like %?1%")
    List<Mascota> buscarPorSexo(String sexo);

    @Query(nativeQuery = true,value = "select m.* from mascota m\n" +
            "inner join raza_especie re on (re.idraza=m.raza_especie_idraza)\n" +
            "where lower(re.descripcion) like %?1%")

    List<Mascota> buscarPorRaza(String raza);

    @Query(nativeQuery = true,value = "select * from mascota m\n" +
            "inner join cuenta c on (c.idcuenta=m.cuenta_idcuenta)\n" +
            "where lower(c.telefono) like %?1%")
    List<Mascota> buscarPorContacto(String contacto);
}
