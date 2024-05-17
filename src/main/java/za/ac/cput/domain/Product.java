package za.ac.cput.domain;

import jakarta.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String name;
    private String description;
    private double price;
    private String imageUrl;
    private String sku;
    private int categoryId;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Review> reviews;

    public Product() {
    }

    private Product(Builder builder) {
        this.productId = builder.productId;
        this.name = builder.name;
        this.description = builder.description;
        this.price = builder.price;
        this.imageUrl = builder.imageUrl;
        this.sku = builder.sku;
        this.categoryId = builder.categoryId;
    }

    public Long getProductId() {
        return productId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getSku() {
        return sku;
    }

    public int getCategoryId(){
        return categoryId;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                categoryId == product.categoryId &&
                Objects.equals(productId, product.productId) &&
                Objects.equals(description, product.description) &&
                Objects.equals(name, product.name) &&
                Objects.equals(imageUrl, product.imageUrl) &&
                Objects.equals(sku, product.sku);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, description, name, price, imageUrl, sku, categoryId);
    }

    @Override
    public String toString() {
        return "Product:\n" +
                "Product ID: " + productId + '\n' +
                "Description: " + description + '\n' +
                "Name: " + name + '\n' +
                "Price: " + price + '\n' +
                "ImageUrl: " + imageUrl + '\n' +
                "Sku: " + sku + '\n' +
                "Category ID: " + categoryId;
    }

    public static class Builder {
        private Long productId;
        private String description;
        private String name;
        private double price;
        private String imageUrl;
        private String sku;
        private int categoryId;

        public Builder setProductId(Long productId) {
            this.productId = productId;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Builder setSku(String sku) {
            this.sku = sku;
            return this;
        }

        public Builder setCategoryId(int categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public Builder copy(Product product) {
            this.productId = product.productId;
            this.name = product.name;
            this.description = product.description;
            this.price = product.price;
            this.imageUrl = product.imageUrl;
            this.sku = product.sku;
            this.categoryId = product.categoryId;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
