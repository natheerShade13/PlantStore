package za.ac.cput.factory;

import za.ac.cput.domain.Product;
import za.ac.cput.utility.SupplierHelper;

public class ProductsFactory {

    public static Product buildProducts(String productId, String productName, String productDescription, double price) {
        if (SupplierHelper.isNullorEmpty(productId) ||
                SupplierHelper.isNullorEmpty(productName) ||
                SupplierHelper.isNullorEmpty(productDescription) ||
                !SupplierHelper.isValidPrice(price))
//                Helper.isValidImage(imageUrl))
            return null;
        return new Product.Builder().setProductId(productId).setProductName(productName).setProductDescription(productDescription)
                .setPrice(price).build();

    }
}
