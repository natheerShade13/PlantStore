package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import java.util.Objects;

@Entity
public class Supplier {
    @Id
    private String supplierID;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
//    @OneToOne
//    private Contact contact;

    protected Supplier() {

    }

    private Supplier(Builder builder){
        this.supplierID = builder.supplierID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return Objects.equals(supplierID, supplier.supplierID) && Objects.equals(firstName, supplier.firstName) && Objects.equals(lastName, supplier.lastName) && Objects.equals(email, supplier.email) && Objects.equals(phoneNumber, supplier.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supplierID, firstName, lastName, email, phoneNumber);
    }

    public static class Builder{
    @Id
    private String supplierID;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public Builder setSupplierID(String supplierID) {
        this.supplierID = supplierID;
        return this;
    }

    public Builder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Builder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Builder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Builder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Builder copy(Supplier supplier){
        this.supplierID = supplier.supplierID;
        this.firstName = supplier.firstName;
        this.lastName = supplier.lastName;
        this.phoneNumber = supplier.phoneNumber;
        this.email = supplier.email;
        return this;
    }

    public Supplier build(){
        return new Supplier (this);
    }
}
}
