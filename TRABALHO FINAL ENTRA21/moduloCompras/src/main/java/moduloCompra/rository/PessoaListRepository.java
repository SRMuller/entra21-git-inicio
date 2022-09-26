package moduloCompra.rository;


import moduloCompra.entity.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaListRepository extends JpaRepository<PessoaEntity, Long> {
}
