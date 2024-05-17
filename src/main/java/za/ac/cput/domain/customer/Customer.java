package za.ac.cput.domain.customer;

import java.util.List;

public class Customer {
    private int customerId;
    private String name;
    private String email;
    private String address;
    private String phone;
    private List<Address> addresses;
    private List<Review> reviews;
    private List<Wishlist> wishlists;
    private List<CustomerLoyaltyPoints> loyaltyPoints;
    private List<Notification> notifications;
}