package com.entra21.primeiroprojetospring.view.Repository;


import com.entra21.primeiroprojetospring.model.entity.GeneroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository<GeneroEntity, Long> {
}
