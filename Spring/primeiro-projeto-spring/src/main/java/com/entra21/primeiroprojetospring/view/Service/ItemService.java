package com.entra21.primeiroprojetospring.view.Service;


import com.entra21.primeiroprojetospring.model.dto.ItemPayloadDTO;
import com.entra21.primeiroprojetospring.view.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<ItemPayloadDTO> getAll(Long idGenero){
        return itemRepository.findAll().stream().map(it ->{
            ItemPayloadDTO dto = new ItemPayloadDTO();
            dto.setIdItem(it.getIdItem());
            dto.setTitulo(it.getTitulo());
            dto.setEmprestado(it.isEmprestado());
            
            return dto;
        }).collect(Collectors.toList());
    }
}
