package za.ac.cput.utility;

import za.ac.cput.domain.Address;
import za.ac.cput.domain.Contact;

import java.util.regex.Pattern;

public class CustomerHelper {
    public static boolean isNullOrEmpty(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        return false;
    }
    public static boolean isNumbersTenDigits(String n){
        if (String.valueOf(n).length()==10){
            return true;
        }
        return false;
    }
    public static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return true;
        }
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }
    public static boolean isAddressNullOrEmpty(Address address) {
        if (address == null || isNullOrEmpty(address.toString())) {
            return true;
        }
        return false;
    }
    public static boolean isContactNullOrEmpty(Contact contact) {
        if (contact == null || isNullOrEmpty(contact.toString())) {
            return true;
        }
        return false;
    }
}
