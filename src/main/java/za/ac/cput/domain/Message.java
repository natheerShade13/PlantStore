package za.ac.cput.domain;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "messages")
public class Message {
    @Id
    @Column(name = "message_id", nullable = false)
    private String messageId;

    @Column(name = "subject")
    private String subject;

    @Column(name = "message")
    private String message;

    @Column(name = "is_read")
    private boolean isRead;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_sent")
    private Date dateSent;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    // Private constructor to enforce the use of the builder
    private Message(Builder builder) {
        this.messageId = builder.messageId;
        this.subject = builder.subject;
        this.message = builder.message;
        this.isRead = builder.isRead;
        this.dateSent = builder.dateSent;
        this.customer = builder.customer;
        this.employee = builder.employee;
    }

    // Default constructor for JPA
    protected Message() {}

    // Getters for each field
    public String getMessageId() {
        return messageId;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }

    public boolean isRead() {
        return isRead;
    }

    public Date getDateSent() {
        return dateSent;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    // Builder class
    public static class Builder {
        private String messageId;
        private String subject;
        private String message;
        private boolean isRead;
        private Date dateSent;
        private Customer customer;
        private Employee employee;

        // Setter methods for each field returning Builder for chaining
        public Builder setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        public Builder setSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setIsRead(boolean isRead) {
            this.isRead = isRead;
            return this;
        }

        public Builder setDateSent(Date dateSent) {
            this.dateSent = dateSent;
            return this;
        }

        public Builder setCustomer(Customer customer) {
            this.customer = customer;
            return this;
        }

        public Builder setEmployee(Employee employee) {
            this.employee = employee;
            return this;
        }

        // Build method to create an instance of Message
        public Message build() {
            return new Message(this);
        }
    }
}
