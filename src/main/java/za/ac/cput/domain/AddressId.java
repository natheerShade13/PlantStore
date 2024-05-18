package za.ac.cput.domain;

import java.io.Serializable;
import java.util.Objects;

public class AddressId implements Serializable {
    private int streetNumber;
    private String streetName;

    public AddressId() {
    }

    public AddressId(int streetNumber, String streetName) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AddressId)) return false;
        AddressId addressId = (AddressId) o;
        return streetNumber == addressId.streetNumber &&
                Objects.equals(streetName, addressId.streetName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streetNumber, streetName);
    }

    @Override
    public String toString() {
        return "AddressId{" +
                "streetNumber=" + streetNumber +
                ", streetName='" + streetName + '\'' +
                '}';
    }
}
