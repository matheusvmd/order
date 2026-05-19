package store.order;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderModel, String> {

    List<OrderModel> findByAccountIdOrderByCreatedAtDesc(String accountId);

    @EntityGraph(attributePaths = "items")
    Optional<OrderModel> findByIdAndAccountId(String id, String accountId);

}
