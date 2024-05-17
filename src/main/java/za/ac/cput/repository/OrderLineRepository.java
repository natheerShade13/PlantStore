package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.OrderLine;

public interface OrderLineRepository extends JpaRepository<OrderLine, Long> {
    OrderLine findOrderLineByOrderLineId(long orderLineId);

}
