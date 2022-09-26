package com.entra21.primeiroprojetospring.controller;

import com.entra21.primeiroprojetospring.model.entity.DvdEntity;
import com.entra21.primeiroprojetospring.view.Repository.DvdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Dvds")
public class DvdRestController {

    @Autowired
    private DvdRepository dvdRepository;



    @GetMapping
    public List<DvdEntity> getAllDvds(){
        return dvdRepository.findAll();
    }


}
