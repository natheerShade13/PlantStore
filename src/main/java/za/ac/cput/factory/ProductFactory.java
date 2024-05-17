package za.ac.cput.factory;

import za.ac.cput.domain.Product;
import za.ac.cput.utility.Helper;

public class ProductFactory {

    public static Product createProduct(String name, String description, double price, String imageUrl, String sku, int categoryId) {
        if (name == null || name.isEmpty() || description == null || description.isEmpty() || price <= 0 || sku == null || sku.isEmpty() || categoryId <= 0) {
            return null;
        }

        return new Product.Builder()
                .setName(name)
                .setDescription(description)
                .setPrice(price)
                .setImageUrl(imageUrl)
                .setSku(sku)
                .setCategoryId(categoryId)
                .build();
    }
}
