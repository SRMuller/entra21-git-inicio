package moduloCompra.view.control;


import moduloCompra.DTO.PessoaListDTO;
import moduloCompra.Service.PessoaService;
import moduloCompra.rository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaControl {

    @Autowired
    private PessoaService service;

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping
    public List<PessoaListDTO> getPessoa(){
        return PessoaService.getAll();
    }


}
