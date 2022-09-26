package moduloCompra.view.control;


import moduloCompra.DTO.FuncionarioEmpresaDTO;
import moduloCompra.Service.FuncionarioService;
import moduloCompra.rository.FuncionarioEmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioEmpresaControl {

    @Autowired
    private FuncionarioService service;

    @Autowired
    private FuncionarioEmpresaRepository funcionarioEmpresaRepository;

    @GetMapping
    public List<FuncionarioEmpresaDTO> getFuncionario(){return FuncionarioService.getAll();}
}
