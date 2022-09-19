package moduloCompra.Service;


import moduloCompra.DTO.ItemDTO;
import moduloCompra.entity.ItemEntity;
import moduloCompra.rository.ItemReository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService {

    @Autowired
    public static ItemReository itemReository;

    public static List<ItemDTO> getAll() {
        return itemReository.findAll().stream().map((ir) -> {
            ItemDTO dto = new ItemDTO();
            dto.setIdItem(ir.getId());
            dto.setDescricao(ir.getDescricao());
            dto.setUnidadeMedida(ir.getUnidadeMedida());
            return dto;
        }).collect(Collectors.toList());
    }
    public void save(ItemDTO imput){
        ItemEntity newEntity = new ItemEntity();
        newEntity.setDescricao(imput.getDescricao());
        newEntity.setUnidadeMedida(imput.getUnidadeMedida());
        newEntity.setAtivo(imput.isAtivo());


    }
}
