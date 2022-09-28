package com.example.lab4gtics.Controller;

import com.example.lab4gtics.Repository.OpcionServicioRepository;
import com.example.lab4gtics.Repository.ServicioRepository;
import com.example.lab4gtics.entity.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/servicio")
public class ServiceController {

    @Autowired
    ServicioRepository servicioRepository;
    @Autowired
    OpcionServicioRepository opcionServicioRepository;


    @GetMapping(value = {"/listaservicios", ""})
    public String listarServicios(Model model) {
        List<Servicio> lista = servicioRepository.findAll();
        model.addAttribute("servicioLista", lista);
        model.addAttribute("opcionesLista", opcionServicioRepository.findAll());
        return "servicio/lista";
    }







}
