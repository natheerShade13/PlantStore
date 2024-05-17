package za.ac.cput.domain;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Address {
    @EmbeddedId
    private AddressId addressId;
    private String suburb;
    private String city;
    private String zipCode;
    private String province;

    protected Address() {
    }

    private Address(Builder builder) {
        this.addressId = new AddressId(builder.streetNumber, builder.streetName);
        this.suburb = builder.suburb;
        this.city = builder.city;
        this.zipCode = builder.zipCode;
        this.province = builder.province;
    }

    public AddressId getAddressId() {
        return addressId;
    }

    public String getSuburb() {
        return suburb;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getProvince() {
        return province;
    }

    public static class Builder {
        private int streetNumber;
        private String streetName;
        private String suburb;
        private String city;
        private String zipCode;
        private String province;

        public Builder() {
        }

        public Builder setStreetNumber(int streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setSuburb(String suburb) {
            this.suburb = suburb;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public Builder setProvince(String province) {
            this.province = province;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }
}
