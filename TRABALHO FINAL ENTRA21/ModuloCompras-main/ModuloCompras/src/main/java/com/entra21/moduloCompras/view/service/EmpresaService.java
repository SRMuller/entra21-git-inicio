package com.entra21.moduloCompras.view.service;

import com.entra21.moduloCompras.model.dto.EmpresaDTO;
import com.entra21.moduloCompras.model.entity.EmpresaEntity;
import com.entra21.moduloCompras.view.repository.EmpresaRepository;
import com.entra21.moduloCompras.view.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<EmpresaDTO> getAll() {
        return empresaRepository.findAll().stream().map(e -> {
            EmpresaDTO dto = new EmpresaDTO();
            dto.setId(e.getId());
            dto.setRazao_social(e.getRazao_social());
            dto.setCnpj(e.getCnpj());
            dto.setEndereco(e.getEndereco());
            dto.setFornecedor(e.getFornecedor());
            return dto;
        }).collect(Collectors.toList());
    }

    public void save(EmpresaDTO input) {
        EmpresaEntity newEntity = new EmpresaEntity();
        newEntity.setRazao_social(input.getRazao_social());
        newEntity.setCnpj(input.getCnpj());
        newEntity.setEndereco(input.getEndereco());
        newEntity.setFornecedor(input.getFornecedor());
        newEntity.setIdGerente(pessoaRepository.findById(input.getId_gerente()).orElseThrow(()->new RuntimeException(String.valueOf(HttpStatus.NOT_FOUND))));
        empresaRepository.save(newEntity);
    }

    public EmpresaDTO getById(Long id) {
        EmpresaEntity e = empresaRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Empresa não encontrada."));
        EmpresaDTO dto = new EmpresaDTO();
        dto.setId(e.getId());
        dto.setRazao_social(e.getRazao_social());
        return dto;
    }

    public void delete(Long id) {
        empresaRepository.deleteById(id);
    }

    public EmpresaDTO update(Long id, EmpresaEntity empresaEntity) {
        EmpresaEntity e = empresaRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Empresa não encontrada."));
        e.setRazao_social(empresaEntity.getRazao_social());
        e.setEndereco(empresaEntity.getEndereco());
        e.setFornecedor(empresaEntity.getFornecedor());
        e.setCnpj(empresaEntity.getCnpj());
        e = empresaRepository.save(e);
        EmpresaDTO dto = new EmpresaDTO();
        dto.setRazao_social(e.getRazao_social());
        dto.setEndereco(e.getEndereco());
        dto.setFornecedor(e.getFornecedor());
        dto.setCnpj(e.getCnpj());
        dto.setId(e.getId());
        return dto;
    }

    public EmpresaEntity read(Long id, EmpresaEntity empresaEntity){
        return empresaRepository.findById(id).orElseThrow(() -> new RuntimeException("Empresa não encontrada"));
    }
}
