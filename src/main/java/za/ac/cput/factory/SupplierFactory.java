package za.ac.cput.factory;

import za.ac.cput.domain.Supplier;
import za.ac.cput.utility.Helper;

import java.util.logging.Handler;

public class SupplierFactory {
    public static Supplier buildSupplier(String supplierId, String firstName, String lastName, String email, String phoneNumber) {
        if (Helper.isNullorEmpty(supplierId) ||
                Helper.isNullorEmpty(firstName) ||
                Helper.isNullorEmpty(lastName) ||
                !Helper.isValidEmail(email) ||
                !Helper.isValidPhoneNumber(phoneNumber))
            return null;

        return new Supplier.Builder().setSupplierID(supplierId).setFirstName(firstName).setLastName(lastName).setEmail(email).setPhoneNumber(phoneNumber).build();

    }
}
