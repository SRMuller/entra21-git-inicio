package moduloCompra.view.control;


import moduloCompra.DTO.ItemDTO;
import moduloCompra.DTO.OrcamentoDTO;
import moduloCompra.Service.ItemService;
import moduloCompra.Service.OrcamentoService;
import moduloCompra.rository.ItemReository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemControl {

    @Autowired
    private ItemService service;

    @Autowired
    private ItemReository itemReository;

    @GetMapping
    public List<ItemDTO> getItem(){
        return ItemService.getAll();
    }




}
