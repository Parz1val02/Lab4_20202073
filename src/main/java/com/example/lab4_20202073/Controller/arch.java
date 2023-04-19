package com.example.lab4_20202073.Controller;

import com.example.lab4_20202073.Entity.User;
import com.example.lab4_20202073.Repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.ui.Model;
import java.util.Optional;

@Controller
public class arch {
    final UserRepository userRepository;
    public arch(UserRepository userRepository){this.userRepository=userRepository;}
    @GetMapping("/login")
    public String login(){
        return "inicio";
    }

    @PostMapping("/inicio")
    public String inicio(@RequestParam("correo") String correo,
                         @RequestParam("contrasena") String contrasena){
        User optionalUser = userRepository.Inicio(correo, contrasena);
        if(optionalUser!=null){
            return "redirect:/principal";
        }else{
            return "redirect:/login";
        }
    }



}
