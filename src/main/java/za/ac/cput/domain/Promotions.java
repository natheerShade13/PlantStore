package za.ac.cput.domain;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Table
public class Promotions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long promotionId;
    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    private String discountType;
    private double discountAmount;

    protected Promotions() {
    }

    public Promotions(Builder builder){
        this.promotionId = builder.promotionId;
        this.name = builder.name;
        this.description = builder.description;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.discountType = builder.discountType;
        this.discountAmount = builder.discountAmount;

    }

    public String getDescription() {
        return description;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public String getDiscountType() {
        return discountType;
    }

    public Date getEndDate() {
        return endDate;
    }

    public long getPromotionId() {
        return promotionId;
    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Promotions that = (Promotions) o;
        return Double.compare(discountAmount, that.discountAmount) == 0 && Objects.equals(promotionId, that.promotionId) && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(startDate, that.startDate) && Objects.equals(endDate, that.endDate) && Objects.equals(discountType, that.discountType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(promotionId, name, description, startDate, endDate, discountType, discountAmount);
    }

    @Override
    public String toString() {
        return "Promotions{" +
                "description='" + description + '\'' +
                ", promotionId='" + promotionId + '\'' +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", discountType='" + discountType + '\'' +
                ", discountAmount=" + discountAmount +
                '}';
    }

    public static class Builder{

        private long promotionId;
        private String name;
        private String description;
        private Date startDate;
        private Date endDate;
        private String discountType;
        private double discountAmount;

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setDiscountAmount(double discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }

        public Builder setEndDate(Date endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder setDiscountType(String discountType) {
            this.discountType = discountType;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPromotionId(long promotionId) {
            this.promotionId = promotionId;
            return this;
        }

        public Builder setStartDate(Date startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder copy(Promotions promotions){
            this.promotionId = promotions.promotionId;
            this.name = promotions.name;
            this.description = promotions.description;
            this.startDate = promotions.startDate;
            this.endDate = promotions.endDate;
            this.discountType = promotions.discountType;
            this.discountAmount = promotions.discountAmount;
            return this;
        }

        public Promotions Build(){return new Promotions(this);}

    }

}
