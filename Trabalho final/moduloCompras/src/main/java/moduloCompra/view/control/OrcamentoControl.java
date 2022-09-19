package moduloCompra.view.control;


import moduloCompra.DTO.OrcamentoDTO;
import moduloCompra.Service.OrcamentoService;
import moduloCompra.rository.OrcamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orcamento")
public class OrcamentoControl {

    @Autowired
    private OrcamentoService service;

    @Autowired
    private OrcamentoRepository orcamentoRepository;

    @GetMapping
    public List<OrcamentoDTO> getOrcamento(){
        return OrcamentoService.getAll();
    }
}
