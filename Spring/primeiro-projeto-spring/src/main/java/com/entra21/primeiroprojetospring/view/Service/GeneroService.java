package com.entra21.primeiroprojetospring.view.Service;


import com.entra21.primeiroprojetospring.model.dto.GeneroPayloadDTO;
import com.entra21.primeiroprojetospring.model.entity.GeneroEntity;
import com.entra21.primeiroprojetospring.view.Repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class GeneroService {


    @Autowired
    private GeneroRepository generoRepository;

    public List<GeneroPayloadDTO> getAll() {
        return generoRepository.findAll().stream().map(fr -> {
            GeneroPayloadDTO dto = new GeneroPayloadDTO();
            dto.setId(fr.getId());
            dto.setNome(fr.getNome());
            return dto;
        }).collect(Collectors.toList());
    }

    public void save(GeneroPayloadDTO input) {
        GeneroEntity newEntity = new GeneroEntity();
        newEntity.setNome(input.getNome());
        generoRepository.save(newEntity);
    }

    public GeneroPayloadDTO getById(Long id) {
        GeneroEntity e = generoRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Franquia não encontrada!"));
        GeneroPayloadDTO dto = new GeneroPayloadDTO();
        dto.setId(e.getId());
        dto.setNome(e.getNome());
        return dto;
    }

    public void delete(Long id) {
        generoRepository.deleteById(id);
    }

    public GeneroPayloadDTO update(Long id, String novoNome) {
        GeneroEntity e = generoRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Franquia não encontrada!"));
        e.setNome(novoNome);
        e = generoRepository.save(e);
        GeneroPayloadDTO dto = new GeneroPayloadDTO();
        dto.setNome(e.getNome());
        dto.setId(e.getId());
        return dto;
    }
}
