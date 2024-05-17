package za.ac.cput.domain.order;

import za.ac.cput.domain.customer.Customer;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Order {
    private int orderId;
    private Date orderDate;
    private BigDecimal totalAmount;
    private String status;
    private Customer customer;
    private List<OrderItem> orderItems;
    private List<OrderCoupon> orderCoupons;
    private List<Return> returns;
    private List<Payment> payments;
    private List<Delivery> deliveries;
    private List<Shipment> shipments;
}
