package za.ac.cput.factory;

import za.ac.cput.domain.Product;
import za.ac.cput.utility.Helper;

public class ProductsFactory {

    public static Product buildProducts(String productId, String productName, String productDescription, double price) {
        if (Helper.isNullorEmpty(productId) ||
                Helper.isNullorEmpty(productName) ||
                Helper.isNullorEmpty(productDescription) ||
                !Helper.isValidPrice(price))
//                Helper.isValidImage(imageUrl))
            return null;
        return new Product.Builder().setProductId(productId).setProductName(productName).setProductDescription(productDescription)
                .setPrice(price).build();

    }
}
