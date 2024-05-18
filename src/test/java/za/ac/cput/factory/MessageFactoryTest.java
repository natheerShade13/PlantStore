package za.ac.cput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Message;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MessageFactoryTest {

    private Message messageA;
    private Message messageB;

    @Test
    @Order(1)
    void buildMessage() {
        Customer customerA = new Customer();
        Employee employeeA = new Employee();
        Date dateSentA = new Date();
        messageA = MessageFactory.buildMessage(123L, "Test Subject A", "Test Message A", false, dateSentA, customerA, employeeA);
        assertNotNull(messageA);
        assertEquals(123L, messageA.getMessageId());
        assertEquals("Test Subject A", messageA.getSubject());
        assertEquals("Test Message A", messageA.getMessage());
        assertFalse(messageA.isRead());
        assertEquals(dateSentA, messageA.getDateSent());
        assertEquals(customerA, messageA.getCustomer());
        assertEquals(employeeA, messageA.getEmployee());
    }

    /*
    @Test
    @Order(2)
    void testBuildMessage() {
        Customer customerB = new Customer();
        Employee employeeB = new Employee();
        Date dateSentB = new Date();
        messageB = MessageFactory.buildMessage("Test Subject B", "Test Message B", false, dateSentB, customerB, employeeB);
        assertNotNull(messageB);
        assertTrue(messageB.getMessageId() == 0);
        assertEquals("Test Subject B", messageB.getSubject());
        assertEquals("Test Message B", messageB.getMessage());
        assertFalse(messageB.isRead());
        assertEquals(dateSentB, messageB.getDateSent());
        assertEquals(customerB, messageB.getCustomer());
        assertEquals(employeeB, messageB.getEmployee());
    }
     */
}
