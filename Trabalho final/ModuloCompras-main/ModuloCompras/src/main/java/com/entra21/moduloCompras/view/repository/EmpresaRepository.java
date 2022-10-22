package com.entra21.moduloCompras.view.repository;

import com.entra21.moduloCompras.model.entity.EmpresaEntity;
import com.entra21.moduloCompras.model.entity.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<EmpresaEntity, Long> {
    public EmpresaEntity findByIdGerente(PessoaEntity id);
}
