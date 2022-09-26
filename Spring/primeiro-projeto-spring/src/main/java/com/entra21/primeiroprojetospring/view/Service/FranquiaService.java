package com.entra21.primeiroprojetospring.view.service;

import com.entra21.primeiroprojetospring.model.dto.FranquiaPayloadDTO;
import com.entra21.primeiroprojetospring.model.entity.FranquiaEntity;
import com.entra21.primeiroprojetospring.view.repository.FranquiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FranquiaService {

    @Autowired
    private FranquiaRepository franquiaRepository;

    public List<FranquiaPayloadDTO> getAll() {
        return franquiaRepository.findAll().stream().map(fr -> {
            FranquiaPayloadDTO dto = new FranquiaPayloadDTO();
            dto.setId(fr.getId());
            dto.setNome(fr.getNome());
            return dto;
        }).collect(Collectors.toList());
    }

    public void save(FranquiaPayloadDTO input) {
        FranquiaEntity newEntity = new FranquiaEntity();
        newEntity.setNome(input.getNome());
        franquiaRepository.save(newEntity);
    }

    public FranquiaPayloadDTO getById(Long id) {
        FranquiaEntity e = franquiaRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Franquia não encontrada!"));
        FranquiaPayloadDTO dto = new FranquiaPayloadDTO();
        dto.setId(e.getId());
        dto.setNome(e.getNome());
        return dto;
    }

    public void delete(Long id) {
        franquiaRepository.deleteById(id);
    }

    public FranquiaPayloadDTO update(Long id, String novoNome) {
        FranquiaEntity e = franquiaRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Franquia não encontrada!"));
        e.setNome(novoNome);
        e = franquiaRepository.save(e);
        FranquiaPayloadDTO dto = new FranquiaPayloadDTO();
        dto.setNome(e.getNome());
        dto.setId(e.getId());
        return dto;
    }
}