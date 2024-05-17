package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

import java.util.Objects;

@Entity
@IdClass(AddressId.class)
public class Address {
    @Id
    private int streetNumber;
    @Id
    private String streetName;
    private String suburb;
    private String city;
    private String zipCode;
    private String province;

    protected Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetNumber=" + streetNumber +
                ", streetName='" + streetName + '\'' +
                ", suburb='" + suburb + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", province='" + province + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address address)) return false;
        return getStreetNumber() == address.getStreetNumber() && Objects.equals(getStreetName(), address.getStreetName()) && Objects.equals(getSuburb(), address.getSuburb()) && Objects.equals(getCity(), address.getCity()) && Objects.equals(getZipCode(), address.getZipCode()) && Objects.equals(getProvince(), address.getProvince());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStreetNumber(), getStreetName(), getSuburb(), getCity(), getZipCode(), getProvince());
    }

    public Address(Builder builder) {
        this.streetNumber =  builder.streetNumber;
        this.streetName = builder.streetName;
        this.suburb =  builder.suburb;
        this.city =  builder.city;
        this.zipCode =  builder.zipCode;
        this.province =  builder.province;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
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
    public static class Builder{
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

        public Address build(){
            return new Address(this);
        }
    }
}
