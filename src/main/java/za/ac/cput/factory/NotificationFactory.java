package za.ac.cput.factory;

import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Notification;
import za.ac.cput.utility.Helper;

import java.util.Date;

public class NotificationFactory {

    public static Notification createNotification(long notificationId, Customer customer, String message, boolean isRead, Date dateSent) {
        if (customer == null || Helper.isNullOrEmpty(message) || dateSent == null || notificationId <= 0) {
            return null; // Ensure all necessary fields are provided and notificationId is valid
        }

        return new Notification.Builder()
                .setNotificationId(notificationId)
                .setCustomer(customer)
                .setMessage(message)
                .setIsRead(isRead)
                .setDateSent(dateSent)
                .build();
    }

    /*
    public static Notification createNotification(Customer customer, String message, boolean isRead, Date dateSent) {
        if (customer == null || Helper.isNullOrEmpty(message) || dateSent == null) {
            return null; // Ensure all necessary fields are provided
        }

        long notificationId = Helper.generateID(); // Assuming generateID returns a long

        return new Notification.Builder()
                .setNotificationId(notificationId)
                .setCustomer(customer)
                .setMessage(message)
                .setIsRead(isRead)
                .setDateSent(dateSent)
                .build();
    }
    */
}
