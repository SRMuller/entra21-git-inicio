package moduloCompra.rository;


import moduloCompra.entity.Fornecedor_EmpresaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Fornecedor_EmpresaRepository extends JpaRepository<Fornecedor_EmpresaEntity, Long> {
}
