package za.ac.cput.factory;

import za.ac.cput.domain.Contact;
import za.ac.cput.domain.Customer;
import za.ac.cput.utility.CustomerHelper;

public class CustomerFactory {

    public static Customer createCustomer(long Id, String firstName, String lastName, Contact contact){
        if(Id<0|| CustomerHelper.isNullOrEmpty(firstName) ||
                CustomerHelper.isNullOrEmpty(lastName)||
                CustomerHelper.isContactNullOrEmpty(contact)){
        return null;}

        return new Customer.Builder()
                .setId(Id)
                .setFirstName(firstName)
                .setLastname(lastName)
                .setContact(contact).build();
    }
    }
