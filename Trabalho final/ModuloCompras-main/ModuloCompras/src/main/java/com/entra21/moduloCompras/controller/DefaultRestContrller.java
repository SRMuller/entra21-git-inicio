package com.entra21.moduloCompras.controller;

import com.entra21.moduloCompras.model.dto.UsuarioDTO;
import com.entra21.moduloCompras.model.dto.PessoaDTO;
import com.entra21.moduloCompras.view.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DefaultRestContrller {

    @Autowired
    private PessoaService service;

    @PostMapping("/login")
    public UsuarioDTO login(@RequestBody UsuarioDTO login) {
        // Se retornar true, login sucesso
        return service.getLogin(login);
    }

    @PostMapping
    @RequestMapping("/cadastro")
    public void cadastro(@RequestBody PessoaDTO dto) {
        service.criar(dto);
    }
}
