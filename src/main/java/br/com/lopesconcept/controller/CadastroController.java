package br.com.lopesconcept.controller;

import br.com.lopesconcept.model.Cadastro;
import br.com.lopesconcept.service.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@RestController
public class CadastroController {
    @Autowired
    private CadastroService cadastroService;

    @GetMapping("patrocinio")
    public ModelAndView patrocinio(){
        ModelAndView mv = new ModelAndView("Patrocinio.html");
        return mv;
    }

    @PostMapping
    public ResponseEntity<Cadastro> addCadastro(@Valid @RequestBody Cadastro cadastro){
        Cadastro criarCadastro = cadastroService.addCadastro(cadastro);
        return ResponseEntity.ok(criarCadastro);
    }


}
