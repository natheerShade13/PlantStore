package za.ac.cput.domain;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table
public class GiftCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long giftCardId;
    private int number;
    private int pin;
    private double amount;
    private boolean isUsed;

    protected GiftCard() {
    }

    public GiftCard(Builder builder){
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
        GiftCard giftCard = (GiftCard) o;
        return number == giftCard.number && pin == giftCard.pin && amount == giftCard.amount && isUsed == giftCard.isUsed && Objects.equals(giftCardId, giftCard.giftCardId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(giftCardId, number, pin, amount, isUsed);
    }

    @Override
    public String toString() {
        return "GiftCard{" +
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

        public Builder copy(GiftCard giftCard){

            this.giftCardId = giftCard.giftCardId;
            this.number = giftCard.number;
            this.pin = giftCard.pin;
            this.amount = giftCard.amount;
            this.isUsed = giftCard.isUsed;
            return this;

        }

        public GiftCard build(){return new GiftCard(this);}

    }

}
