package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Order;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class OrderFactoryTest {

    @Test
    void buildOrder() {
        Order order = OrderFactory.buildOrder(12345, new Date(), 2000.00, "Order Shipped", "Flowers" );
        assertNotNull(order);
        System.out.println(order.toString());
    }


    }