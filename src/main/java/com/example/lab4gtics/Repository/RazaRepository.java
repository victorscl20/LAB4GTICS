package com.example.lab4gtics.Repository;

import com.example.lab4gtics.entity.RazaEspecie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RazaRepository extends JpaRepository<RazaEspecie,Integer> {

}
