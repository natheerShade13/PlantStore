package za.ac.cput.factory;

import za.ac.cput.domain.Address;
import za.ac.cput.utility.CustomerHelper;

public class AddressFactory {
    public static Address createAddress(long addressId, String streetNumber, String streetName, String suburb, String city, String zipCode, String province) {
        if (CustomerHelper.isNullOrEmpty(streetNumber) || CustomerHelper.isNullOrEmpty(streetName) || CustomerHelper.isNullOrEmpty(suburb) || CustomerHelper.isNullOrEmpty(city) || CustomerHelper.isNullOrEmpty(province)) {
            return null;
        }
        return new Address.Builder()
                .setAddressId(addressId)
                .setStreetNumber(streetNumber)
                .setSuburb(suburb)
                .setCity(city)
                .setZipCode(zipCode)
                .setProvince(province)
                .build();
    }
}
