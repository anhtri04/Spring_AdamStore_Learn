package Spring_AdamStore.repository.sql;

import Spring_AdamStore.entity.sql.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

    boolean existsByProductVariantId(Long productVariantId);

    List<OrderItem> findAllByOrderId(Long orderId);

    void deleteAllByOrderId(Long orderId);
}
