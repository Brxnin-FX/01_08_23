package com.example.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {

    @RequestMapping("/formulario")
    public String exibirFormulario() {
        return "formulario";
    }

    @PostMapping("/processarFormulario")
    public String processarFormulario(@RequestParam("nome") String nome, @RequestParam("descricao") String descricao) {
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        
        String Objeto = "Nome: " + nome + "Descrição: " + descricao;
        
        ModelAndView mv = new ModelAndView();
        mv.addObject(Objeto, mv);	

        
        return "redirect:/ListTask";
    }
}
