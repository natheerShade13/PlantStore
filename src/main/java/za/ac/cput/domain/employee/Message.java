package za.ac.cput.domain.employee;

import za.ac.cput.domain.customer.Customer;

import java.util.Date;

public class Message {
    private int messageId;
    private String subject;
    private String message;
    private boolean isRead;
    private Date dateSent;
    private Customer customer;
    private Employee employee;
}
