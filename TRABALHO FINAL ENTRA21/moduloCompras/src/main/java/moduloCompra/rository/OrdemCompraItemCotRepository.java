package moduloCompra.rository;

import moduloCompra.entity.OrdemCompraItemCoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemCompraItemCotRepository extends JpaRepository<OrdemCompraItemCoEntity, Long> {
}
