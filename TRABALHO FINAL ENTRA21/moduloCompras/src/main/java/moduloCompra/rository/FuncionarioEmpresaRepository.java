package moduloCompra.rository;


import moduloCompra.entity.Funcionario_empresaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioEmpresaRepository extends JpaRepository<Funcionario_empresaEntity, Long> {
}
