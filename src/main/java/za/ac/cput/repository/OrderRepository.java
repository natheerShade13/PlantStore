package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    Order findOrderByOrderId(Long orderId);

}
