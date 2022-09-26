package moduloCompra.view.control;


import moduloCompra.DTO.FornecedorDTO;
import moduloCompra.Service.FornecedorService;
import moduloCompra.rository.Fornecedor_EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.GeneratedValue;
import java.util.List;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorControl {

    @Autowired
    private FornecedorService service;

    @Autowired
    private Fornecedor_EmpresaRepository fornecedor_empresaRepository;

    @GetMapping
    public List<FornecedorDTO> getFornecedor(){return FornecedorService.getAll();}
}
