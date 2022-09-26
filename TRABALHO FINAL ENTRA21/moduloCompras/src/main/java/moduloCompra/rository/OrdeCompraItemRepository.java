package moduloCompra.rository;


import moduloCompra.entity.Ordem_Compra_ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdeCompraItemRepository extends JpaRepository<Ordem_Compra_ItemEntity, Long> {
}
