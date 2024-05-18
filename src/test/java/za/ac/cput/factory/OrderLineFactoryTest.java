package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.OrderLine;

import static org.junit.jupiter.api.Assertions.*;

class OrderLineFactoryTest {

    @Test
    void buildOrderLine() {
        OrderLine orderLine = OrderLineFactory.buildOrderLine(131, "Flower", 2, 100);
        assertNotNull(orderLine);
        System.out.println(orderLine.toString());
    }
}