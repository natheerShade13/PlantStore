package za.ac.cput.domain;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
public class Contact {
    @Id
    private String email;
    private String mobileNumber;
    private String workNumber;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumns({
            @JoinColumn(name = "streetNumber", referencedColumnName = "streetNumber"),
            @JoinColumn(name = "streetName", referencedColumnName = "streetName")
    })
    private Address address;

    protected Contact() {
    }

    public Contact(Builder builder) {
        this.email = builder.email;
        this.mobileNumber = builder.mobileNumber;
        this.workNumber = builder.workNumber;
        this.address = builder.address;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", workNumber='" + workNumber + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact contact)) return false;
        return Objects.equals(getEmail(), contact.getEmail()) && Objects.equals(getMobileNumber(), contact.getMobileNumber()) && Objects.equals(getWorkNumber(), contact.getWorkNumber()) && Objects.equals(getAddress(), contact.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmail(), getMobileNumber(), getWorkNumber(), getAddress());
    }
    public static class Builder{
        private String email;
        private String mobileNumber;
        private String workNumber;
        private Address address;

        public Builder() {
        }

        public String getEmail() {
            return email;
        }

        public String getMobileNumber() {
            return mobileNumber;
        }

        public String getWorkNumber() {
            return workNumber;
        }

        public Address getAddress() {
            return address;
        }
        public Contact build(){
            return new Contact(this);
        }
    }
}
