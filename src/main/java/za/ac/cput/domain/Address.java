package za.ac.cput.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "address")
public class Address {
    @EmbeddedId
    @Column(name = "addressId", nullable = false)
    private AddressId addressId;
    @Column(name = "surburb")
    private String suburb;
    @Column(name = "city")
    private String city;
    @Column(name = "zipCode")
    private String zipCode;
    @Column(name = "province")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address address)) return false;
        return Objects.equals(getAddressId(), address.getAddressId()) && Objects.equals(getSuburb(), address.getSuburb()) && Objects.equals(getCity(), address.getCity()) && Objects.equals(getZipCode(), address.getZipCode()) && Objects.equals(getProvince(), address.getProvince());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAddressId(), getSuburb(), getCity(), getZipCode(), getProvince());
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", suburb='" + suburb + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", province='" + province + '\'' +
                '}';
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
