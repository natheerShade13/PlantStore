package za.ac.cput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Notification;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class NotificationFactoryTest {

    @Test
    @Order(1)
    void testCreateNotification() {
        // Create necessary objects for testing
        Customer customer = new Customer();
        String message = "Test message";
        boolean isRead = false;
        Date dateSent = new Date();

        // Call the factory method to create a notification
        Notification notification = NotificationFactory.createNotification(123L, customer, message, isRead, dateSent);

        // Assertions to verify if the notification is created successfully
        assertNotNull(notification);
        assertEquals(123L, notification.getNotificationId());
        assertEquals(customer, notification.getCustomer());
        assertEquals(message, notification.getMessage());
        assertEquals(isRead, notification.isRead());
        assertEquals(dateSent, notification.getDateSent());
    }

    /*
    @Test
    @Order(2)
    void testCreateNotificationWithoutId() {
        // Create necessary objects for testing
        Customer customer = new Customer();
        String message = "Test message";
        boolean isRead = false;
        Date dateSent = new Date();

        // Call the factory method without providing a notification ID
        Notification notification = NotificationFactory.createNotification(customer, message, isRead, dateSent);

        // Assertions to verify if the notification is created successfully
        assertNotNull(notification);
        assertEquals(customer, notification.getCustomer());
        assertEquals(message, notification.getMessage());
        assertEquals(isRead, notification.isRead());
        assertEquals(dateSent, notification.getDateSent());
    }
     */
}
