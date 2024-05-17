package za.ac.cput.domain.payment;

import za.ac.cput.domain.customer.Customer;

import java.util.Date;

public class PaymentMethod {
    private int paymentMethodId;
    private Customer customer;
    private String cardNumber;
    private String cardHolderName;
    private Date expiryDate;
    private String cvv;
}
