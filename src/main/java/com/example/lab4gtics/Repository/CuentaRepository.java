package com.example.lab4gtics.Repository;

import com.example.lab4gtics.dto.CuentasDto;
import com.example.lab4gtics.entity.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CuentaRepository  extends JpaRepository<Cuenta, Integer> {
    @Query(nativeQuery = true, value = "select c.idcuenta, c.correo, c.direccion,c.telefono,count(idmascota) as 'numero' from cuenta c\n" +
            "left join mascota m on m.cuenta_idcuenta = c.idcuenta\n" +
            "group by c.idcuenta;")
    List<CuentasDto> listaCuenta ();

    @Query(nativeQuery = true, value = "select * from mascota where cuenta_idcuenta=?1;")
    List<CuentasDto> listaMascotas (int id);
}
