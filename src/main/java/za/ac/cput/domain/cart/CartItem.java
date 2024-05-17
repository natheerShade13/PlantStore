package za.ac.cput.domain.cart;

import za.ac.cput.domain.product.Product;

import java.math.BigDecimal;

public class CartItem {
    private int cartItemId;
    private Cart cart;
    private Product product;
    private int quantity;
    private BigDecimal price;
}
