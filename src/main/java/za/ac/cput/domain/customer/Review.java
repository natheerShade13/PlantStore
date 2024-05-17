package za.ac.cput.domain.customer;

import za.ac.cput.domain.product.Product;

import java.util.Date;

public class Review {
    private int reviewId;
    private Product product;
    private Customer customer;
    private int rating;
    private String comment;
    private Date reviewDate;
}
