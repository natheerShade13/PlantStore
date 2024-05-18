package za.ac.cput.domain;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table
public class GiftCards {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long giftCardId;
    private int number;
    private int pin;
    private double amount;
    private boolean isUsed;

    protected GiftCards() {
    }

    public GiftCards(Builder builder){
        this.giftCardId = builder.giftCardId;
        this.number = builder.number;
        this.pin = builder.pin;
        this.amount = builder.amount;
        this.isUsed = builder.isUsed;
    }

    public double getAmount() {
        return amount;
    }

    public long getGiftCardId() {
        return giftCardId;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public int getNumber() {
        return number;
    }

    public int getPin() {
        return pin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GiftCards giftCards = (GiftCards) o;
        return number == giftCards.number && pin == giftCards.pin && amount == giftCards.amount && isUsed == giftCards.isUsed && Objects.equals(giftCardId, giftCards.giftCardId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(giftCardId, number, pin, amount, isUsed);
    }

    @Override
    public String toString() {
        return "GiftCards{" +
                "giftCardId='" + giftCardId + '\'' +
                ", amount=" + amount +
                ", number=" + number +
                ", pin=" + pin +
                ", isUsed=" + isUsed +
                '}';
    }

    public static class Builder{

        private long giftCardId;
        private int number;
        private int pin;
        private double amount;
        private boolean isUsed;

        public Builder setAmount(double amount) {
            this.amount = amount;
            return this;
        }

        public Builder setGiftCardId(long giftCardId) {
            this.giftCardId = giftCardId;
            return this;
        }

        public Builder setUsed(boolean used) {
            isUsed = used;
            return this;
        }

        public Builder setNumber(int number) {
            this.number = number;
            return this;
        }

        public Builder setPin(int pin) {
            this.pin = pin;
            return this;
        }

        public Builder copy(GiftCards giftCards){

            this.giftCardId = giftCards.giftCardId;
            this.number = giftCards.number;
            this.pin = giftCards.pin;
            this.amount = giftCards.amount;
            this.isUsed = giftCards.isUsed;
            return this;

        }

        public GiftCards build(){return new GiftCards(this);}

    }

}
