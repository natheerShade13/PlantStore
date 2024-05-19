package za.ac.cput.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.Contact;
import za.ac.cput.domain.Customer;

import static org.junit.jupiter.api.Assertions.*;

class CustomerFactoryTest {

    private Customer customer1;
    private Customer customer2;
    private Customer customer3;

    @BeforeEach
    void setUp() {
        Address address = new Address.Builder()
                .setStreetNumber("10")
                .setStreetName("Main Street")
                .setSuburb("Suburb")
                .setCity("City")
                .setZipCode("12345")
                .setProvince("Province")
                .build();

        Contact contact = new Contact.Builder()
                .setEmail("keitu@example.com")
                .setMobileNumber("0123456789")
                .setWorkNumber("0987654321")
                .setAddress(address)
                .build();
        customer1 = CustomerFactory.createCustomer(1476789, "John", "Doe", contact);
        customer2 = CustomerFactory.createCustomer(55768, "leago", "", contact);
        customer3=customer1;
    }
    @Test
    void checkIfNotNull() {
        assertNotNull(customer1);
        System.out.println(customer1);
    }
    @Test
    void checkIfNull() {
        assertNull(customer2);
        System.out.println(customer2);
    }
    @Test
    void equalityTest(){
        assertNotEquals(customer1,customer2);
        System.out.println("NOT EQUAL");
    }
    @Test
    void identityTest(){
        assertSame(customer1, customer3);
        System.out.println("IDENTICAL");
    }
}