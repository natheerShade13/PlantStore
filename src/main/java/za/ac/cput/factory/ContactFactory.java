package za.ac.cput.factory;

import za.ac.cput.domain.Address;
import za.ac.cput.domain.Contact;
import za.ac.cput.utility.Helper;

public class ContactFactory {
    public static Contact createContact(String email,String mobileNumber,String workNumber, Address address) {
        if (!Helper.isValidEmail(email)||Helper.isNumbersTenDigits(mobileNumber) ||Helper.isNumbersTenDigits(workNumber)  || Helper.isAddressNullOrEmpty(address))
            return null;

        return new Contact.Builder().setEmail(email)
                .setMobileNumber(mobileNumber)
                .setWorkNumber(workNumber)
                .setAddress(address)
                .build();
    }
}
