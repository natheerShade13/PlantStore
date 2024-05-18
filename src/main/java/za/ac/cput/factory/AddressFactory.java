package za.ac.cput.factory;

import za.ac.cput.domain.Address;
import za.ac.cput.utility.CustomerHelper;


public class AddressFactory {
    public static Address createAddress(int streetNumber, String streetName, String suburb, String city, String zipCode, String province) {
        if (streetNumber < 0 || CustomerHelper.isNullOrEmpty(streetName) || CustomerHelper.isNullOrEmpty(suburb) || CustomerHelper.isNullOrEmpty(city) || CustomerHelper.isNullOrEmpty(province)) {
            return null;
        }
        return new Address.Builder()
                .setStreetNumber(streetNumber)
                .setStreetName(streetName)
                .setSuburb(suburb)
                .setCity(city)
                .setZipCode(zipCode)
                .setProvince(province)
                .build();
    }
}

