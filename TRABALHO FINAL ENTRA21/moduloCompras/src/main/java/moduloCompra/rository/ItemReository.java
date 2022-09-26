package moduloCompra.rository;

import moduloCompra.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemReository extends JpaRepository<ItemEntity, Long> {
}
