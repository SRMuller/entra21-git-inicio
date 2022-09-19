package com.entra21.primeiroprojetospring.view;


import com.entra21.primeiroprojetospring.model.entity.FranquiaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface franquiaRepository extends JpaRepository<FranquiaEntity, Long>{


}
