package za.ac.cput.domain.cart;

import za.ac.cput.domain.customer.Customer;

import java.util.Date;
import java.util.List;

public class Cart {
    private int cartId;
    private Customer customer;
    private Date createdDate;
    private List<CartItem> items;
}
