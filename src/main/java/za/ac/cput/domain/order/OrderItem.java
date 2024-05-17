package za.ac.cput.domain.order;

import za.ac.cput.domain.product.Product;

import java.math.BigDecimal;

public class OrderItem {
    private int orderItemId;
    private Order order;
    private Product product;
    private int quantity;
    private BigDecimal price;
}
