package moduloCompra.view.control;


import moduloCompra.DTO.CotacaoFornecedorDTO;
import moduloCompra.DTO.OrdemCompraItemCotDTO;
import moduloCompra.Service.OC_ItemCotacaoService;
import moduloCompra.entity.OrdemCompraItemCoEntity;
import moduloCompra.rository.OrdemCompraItemCotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/OC_ItemCotacao")
public class OCItemCotacaoControl {

    @Autowired
    private OC_ItemCotacaoService oc_itemCotacaoService;

    @GetMapping
    public List<OrdemCompraItemCotDTO> getOC_itemCotacao(){
        return oc_itemCotacaoService.getAll();
    }

    @GetMapping(path = "/{id}")
    public List<CotacaoFornecedorDTO> getCotacaoFornecedor(@PathVariable Long id){return oc_itemCotacaoService.findById(id);  }
}
