package com.entra21.primeiroprojetospring.controller;

import com.entra21.primeiroprojetospring.model.dto.GeneroPayloadDTO;
import com.entra21.primeiroprojetospring.view.Service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/generos")
public class GeneroRestControll {

    @Autowired
    private GeneroService generoService;

    @GetMapping
    public List<GeneroPayloadDTO> getGenero() {
        return generoService.getAll();
    }

    @PostMapping
    public void addGenero(@RequestBody GeneroPayloadDTO newGenero) {
        generoService.save(newGenero);
    }

    @GetMapping("/{id}")
    public GeneroPayloadDTO getFranquia(@PathVariable(name = "id") Long id) {
        return generoService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteGenero(@PathVariable(name = "id") Long id) {
       generoService.delete(id);
    }

    @PutMapping("/{id}")
    public GeneroPayloadDTO updateGenero(@PathVariable(name = "id") Long id,
                                             @RequestBody String novoNome) {
        return generoService.update(id, novoNome);
    }
}
