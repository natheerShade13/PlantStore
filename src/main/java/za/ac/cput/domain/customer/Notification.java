package za.ac.cput.domain.customer;

import java.util.Date;

public class Notification {
    private int notificationId;
    private Customer customer;
    private String message;
    private boolean isRead;
    private Date dateSent;
}
