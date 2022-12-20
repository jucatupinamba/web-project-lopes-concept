package br.com.lopesconcept.service;

import br.com.lopesconcept.model.Cadastro;
import br.com.lopesconcept.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroService {
    @Autowired
    private CadastroRepository cadastroRepository;

    public Cadastro addCadastro(Cadastro cadastroInicial){
         Cadastro tempCadastro = new Cadastro();
         tempCadastro.setNomeCompleto(cadastroInicial.getNomeCompleto());
         tempCadastro.setEmail(cadastroInicial.getEmail());
         tempCadastro.setTelefone(cadastroInicial.getTelefone());
         tempCadastro.setLocalizacao(cadastroInicial.getLocalizacao());
         tempCadastro.setMensagem(cadastroInicial.getMensagem());

         return cadastroRepository.save(tempCadastro);
    }

}
