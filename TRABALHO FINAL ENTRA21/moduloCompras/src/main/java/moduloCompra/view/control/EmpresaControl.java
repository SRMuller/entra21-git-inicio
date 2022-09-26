package moduloCompra.view.control;


import moduloCompra.DTO.EmpresaDTO;
import moduloCompra.Service.EmpresaService;
import moduloCompra.rository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaControl {

    @Autowired
    private EmpresaService empresaService;

    @Autowired
    private EmpresaRepository empresaRepository;

    @GetMapping
    public List<EmpresaDTO> getEmpresa(){
        return EmpresaService.getAll();
    }
}

