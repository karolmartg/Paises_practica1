package com.Country.controller;

import com.Country.domain.Pais;
import com.Country.service.ClienteService;
import lombok.extern.slf4j.Slf4j;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping("/")
    public String inicio(Model model){
        var paises = clienteService.getPaises();
        model.addAttribute("paises", paises);
        return "index";
    }
    
    @GetMapping("/pais/nuevo")
    public String paisNuevo(Pais pais){
        return "modifica_pais";
    }
    
    @PostMapping("/pais/guardar")
    public String paisGuardar(Pais pais){
        clienteService.save(pais);
        return "redirect:/";
    }
    
    @GetMapping("/pais/eliminar/{idPais}")
    public String paisEliminar(Pais pais){
        clienteService.delete(pais);
        return "redirect:/";
    }
    
    @GetMapping("/pais/modificar/{idPais}")
    public String paisModificar(Pais pais, Model model){
        pais = clienteService.getPais(pais);
        model.addAttribute("pais", pais);
        return "modifica_pais";
    }
}
