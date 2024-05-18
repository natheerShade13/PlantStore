package za.ac.cput.domain;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastname;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "email")
    private Contact contact;

    public Customer() {
    }

    public Customer(Builder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        lastname = builder.lastname;
        this.contact = builder.contact;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public Contact getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", Lastname='" + lastname + '\'' +
                ", contact=" + contact +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer customer)) return false;
        return Objects.equals(getId(), customer.getId()) && Objects.equals(getFirstName(), customer.getFirstName()) && Objects.equals(getLastname(), customer.getLastname()) && Objects.equals(getContact(), customer.getContact());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastname(), getContact());
    }
    public static class Builder{
        private Long id;
        private String firstName;
        private String lastname;
        private Contact contact;

        public Builder() {
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastname(String lastname) {
            lastname = lastname;
            return this;
        }

        public Builder setContact(Contact contact) {
            this.contact = contact;
            return this;
        }
        public Customer build(){
            return new Customer(this);
        }
    }
}
