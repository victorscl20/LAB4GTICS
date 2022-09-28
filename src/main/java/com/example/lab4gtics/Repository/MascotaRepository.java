package com.example.lab4gtics.Repository;

import com.example.lab4gtics.Controller.MascotaController;
import com.example.lab4gtics.entity.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Integer> {

    @Query(nativeQuery = true,value = "select * from mascota where lower(sexo) like %?1%")
    List<MascotaController> buscarPorSexo(String sexo);

    @Query(nativeQuery = true,value = "select m.* from mascota m\n" +
            "inner join raza_especie re on (re.idraza=m.raza_especie_idraza)\n" +
            "where lower(re.descripcion) like %?1%")

    List<MascotaController> buscarPorRaza(String raza);

    @Query(nativeQuery = true,value = "select * from mascota m\n" +
            "inner join cuenta c on (c.idcuenta=m.cuenta_idcuenta)\n" +
            "where lower(c.telefono) like %?1%")
    List<MascotaController> buscarPorContacto(String contacto);
}
