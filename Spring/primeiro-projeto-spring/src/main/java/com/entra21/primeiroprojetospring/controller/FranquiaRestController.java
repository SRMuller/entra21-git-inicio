package com.entra21.primeiroprojetospring.controller;

import com.entra21.primeiroprojetospring.model.dto.FranquiaPayloadDTO;
import com.entra21.primeiroprojetospring.view.service.FranquiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/franquias")
public class FranquiaRestController {

    @Autowired
    private FranquiaService franquiaService;

    @GetMapping
    public List<FranquiaPayloadDTO> getFranquias() {
        return franquiaService.getAll();
    }

    @PostMapping
    public void addFranquia(@RequestBody FranquiaPayloadDTO newFranquia) {
        franquiaService.save(newFranquia);
    }

    @GetMapping("/{id}")
    public FranquiaPayloadDTO getFranquia(@PathVariable(name = "id") Long id) {
        return franquiaService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteFranquia(@PathVariable(name = "id") Long id) {
        franquiaService.delete(id);
    }

    @PutMapping("/{id}")
    public FranquiaPayloadDTO updateFranquia(@PathVariable(name = "id") Long id,
                                             @RequestBody String novoNome) {
        return franquiaService.update(id, novoNome);
    }
}