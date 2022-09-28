package com.example.lab4gtics.Controller;

import com.example.lab4gtics.Repository.MascotaRepository;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mascota")
public class Mascota {
    @Autowired
    MascotaRepository mascotaRepository;
    @GetMapping(value = { "/", "lista"})
    public String listarMascotas(Model model) {
        model.addAttribute("listaMascota", mascotaRepository.findAll());
        return "mascota/lista";
    }

    @GetMapping("/nuevamascota")
    public String nuevaMascota(Model model) {

        return "mascota/form";
    }

    @GetMapping("/nuevodueno")
    public String nuevoDueno(Model model) {

        return "mascota/form";
    }
    @Autowired


    @GetMapping("/servicioinfo")
    public String servicioInfo(Model model){
        return "mascota/listaservmasc";
    }
}
