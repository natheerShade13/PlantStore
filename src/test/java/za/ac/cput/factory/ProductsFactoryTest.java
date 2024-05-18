package za.ac.cput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Product;
import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class ProductsFactoryTest {


    @Test
    void a_buildProducts() {
        Product product = ProductsFactory.buildProducts("01","Cheery Flower","Filled with rich red fregnance that can make you smile",500.00f);
        System.out.println(product);
        assertNotNull(product);


    }

    @Test
    void b_buildProductsWithFailingData() {
        Product product = ProductsFactory.buildProducts("","Cheery Flower","Filled with rich red fregnance that can make you smile",500.00f);
        System.out.println(product.toString());
        assertNotNull(product);
    }
}