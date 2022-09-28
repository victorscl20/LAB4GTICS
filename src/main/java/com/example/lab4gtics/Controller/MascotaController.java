package com.example.lab4gtics.Controller;

import com.example.lab4gtics.Repository.MascotaRepository;
import com.example.lab4gtics.Repository.RazaRepository;
import com.example.lab4gtics.entity.Mascota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/mascota")
public class MascotaController {
    @Autowired
    MascotaRepository mascotaRepository;
    @GetMapping(value = { "/", "/lista"})
    public String listarMascotas(Model model) {
        model.addAttribute("listaMascota", mascotaRepository.findAll());
        return "mascota/lista";
    }
    @Autowired
    RazaRepository razaRepository;
    @GetMapping("/nuevamascota")
    public String nuevaMascota(@ModelAttribute("mascota") Mascota mascota, Model model) {
        model.addAttribute("listaRaza", razaRepository.findAll());
        model.addAttribute("listaMascota", mascotaRepository.findAll());
        return "mascota/form";
    }

    @PostMapping("/guardar")
    public String guardarMascota(Mascota mascota, RedirectAttributes redirectAttributes, Model model){
        if (mascota.getIdmascota()==0) {
            redirectAttributes.addFlashAttribute("msg", "Mascota creada exitosamente");
        } else {
            redirectAttributes.addFlashAttribute("msg", "Mascota actualizada exitosamente");
        }

        if (mascota.getRazaEspecie() != null) {
            mascotaRepository.save(mascota);
            return "redirect:/mascota/lista";
        } else {
            model.addAttribute("errProd", "Error al crear producto");
            model.addAttribute("listaMascota", mascotaRepository.findAll());
            model.addAttribute("listaRaza", razaRepository.findAll());
            if (mascota.getIdmascota() != 0) {
                model.addAttribute("mascota", mascota);
                return "mascota/editar";
            } else {
                return "mascota/form";
            }
        }
    }

    @GetMapping("/editar")
    public String editarMascota(@ModelAttribute("mascota") Mascota mascota,
                                @RequestParam("id") int id,
                                Model model) {
        Optional<Mascota> optionalMascota = mascotaRepository.findById(id);
        System.out.println(id);
        if (optionalMascota.isPresent()) {
            mascota = optionalMascota.get();
            model.addAttribute("mascota", mascota);
            model.addAttribute("listaMascota", mascotaRepository.findAll());
            model.addAttribute("listaRaza", razaRepository.findAll());
            return "/mascota/editar";
        } else {
            return "redirect:/mascota/lista";
        }
    }



    @GetMapping("/nuevodueno")
    public String nuevoDueno(Model model) {

        return "mascota/form";
    }




}
