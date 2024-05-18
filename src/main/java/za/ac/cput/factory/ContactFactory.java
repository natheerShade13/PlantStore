package za.ac.cput.factory;

import za.ac.cput.domain.Address;
import za.ac.cput.domain.Contact;
import za.ac.cput.utility.CustomerHelper;


public class ContactFactory {
    public static Contact createContact(String email, String mobileNumber, String workNumber, Address address) {
        if (!CustomerHelper.isValidEmail(email) || !CustomerHelper.isNumbersTenDigits(mobileNumber)
                || !CustomerHelper.isNumbersTenDigits(workNumber) || CustomerHelper.isAddressNullOrEmpty(address)) {
            return null;
        }

        return new Contact.Builder().setEmail(email)
                .setMobileNumber(mobileNumber).setWorkNumber(workNumber)
                .setAddress(address).build();
    }


}
