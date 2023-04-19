package com.example.lab4_20202073.Controller;

import com.example.lab4_20202073.Entity.Vuelo;
import com.example.lab4_20202073.Repository.VueloRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class VueloController {
    final VueloRepository vueloRepository;
    public VueloController(VueloRepository vueloRepository){this.vueloRepository=vueloRepository;}
    @GetMapping("/principal")
    public String principal(Model model){
        List<Vuelo> lista = vueloRepository.findAll();
        model.addAttribute("listaVuelos", lista);
        return "homePage";
    }
}
