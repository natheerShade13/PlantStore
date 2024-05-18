package za.ac.cput.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.core.annotation.Order;
import za.ac.cput.domain.Product;

@TestMethodOrder(OrderAnnotation.class)
public class ProductFactoryTest {

    private Product productA;
    private Product productB;

    @Test
    @Order(1)
    void createProduct() {
        productA = ProductFactory.createProduct("Sunflower", "Bright yellow flower", 29.99, "imageUrl", "SKU123", 1);
        Assertions.assertNotNull(productA);
        Assertions.assertEquals("Sunflower", productA.getName());
        Assertions.assertEquals("Bright yellow flower", productA.getDescription());
        Assertions.assertEquals(29.99, productA.getPrice(), 0.01);
        Assertions.assertEquals("imageUrl", productA.getImageUrl());
        Assertions.assertEquals("SKU123", productA.getSku());
        Assertions.assertEquals(1, productA.getCategoryId());
        Assertions.assertTrue(productA.getProductId() > 0);
        System.out.println(productA);
    }

    @Test
    @Order(2)
    void testCreateProduct() {
        productB = ProductFactory.createProduct("", "Some description", 15.99, "imageUrl", "SKU124", 2);
        Assertions.assertNull(productB);
    }
}
