package za.ac.cput.factory;

import za.ac.cput.domain.Address;

public class AddressFactory {
    public static Address createAddress(int streetNumber,String streetName,String suburb,String city,String zipCode,String province){
        if(streetNumber<0 ||
                Helper.isNullOrEmpty(streetName) ||
                Helper.isNullOrEmpty(suburb) ||
                Helper.isNullOrEmpty(city)||Helper.isNullOrEmpty(province)
        )
            return null;

        return new Address.Builder().setStreetNumber(streetNumber)
                .setStreetName(streetName)
                .setSuburb(suburb)
                .setCity(city)
                .setCity(province)
                .build();

    }
}
