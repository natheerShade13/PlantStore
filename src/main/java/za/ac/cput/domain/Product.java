package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Products {
    @Id
    private String productId;
    private String productName;
    private String productDescription;
    private double price;
    @Lob
    private byte[] imageUrl;


    protected Products() {
    }

    private Products(Builder builder) {
        this.productId = builder.productId;
        this.productName = builder.productName;
        this.productDescription = builder.productDescription;
        this.price = builder.price;
        this.imageUrl = builder.imageUrl;


    }

    public static class Builder {
        @Id
        private String productId;
        private String productName;
        private String productDescription;
        private double price;
        @Lob
        private byte[] imageUrl;

        public Builder setProductId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder setProductName(String productName) {
            this.productName = productName;
            return this;
        }

        public Builder setProductDescription(String productDescription) {
            this.productDescription = productDescription;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setImageUrl(byte[] imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Builder copy(Products products) {
            this.productId = products.productId;
            this.productName = products.productName;
            this.productDescription = products.productDescription;
            this.price = products.price;
            this.imageUrl = products.imageUrl;
            return this;

        }

        public Products build() {
            return new Products(this);
        }

    }


}
