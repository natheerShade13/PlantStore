package za.ac.cput.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.core.annotation.Order;
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Review;

import java.time.LocalDate;

@TestMethodOrder(OrderAnnotation.class)
public class ReviewFactoryTest {

    private Customer.Review reviewA;
    private Customer.Review reviewB;

    @Test
    @Order(1)
    void createReview() {
        LocalDate reviewDateA = LocalDate.now();
        reviewA = ReviewFactory.createProductReview(1, 1, 5, "Beautiful and vibrant sunflowers", reviewDateA);
        Assertions.assertNotNull(reviewA);
        Assertions.assertEquals(1, reviewA.getProductId());
        Assertions.assertEquals(1, reviewA.getCustomerId());
        Assertions.assertEquals(5, reviewA.getRating());
        Assertions.assertEquals("Beautiful and vibrant sunflowers", reviewA.getComment());
        Assertions.assertEquals(reviewDateA, reviewA.getReviewDate());
        System.out.println(reviewA);
    }

    @Test
    @Order(2)
    void testCreateReview() {
        LocalDate reviewDateB = LocalDate.of(2021, 8, 10);
        reviewB = ReviewFactory.createProductReview(2, 2, 3, "Roses were nice but not fresh", reviewDateB);
        Assertions.assertNotNull(reviewB);
        Assertions.assertEquals(2, reviewB.getProductId());
        Assertions.assertEquals(2, reviewB.getCustomerId());
        Assertions.assertEquals(3, reviewB.getRating());
        Assertions.assertEquals("Roses were nice but not fresh", reviewB.getComment());
        Assertions.assertEquals(reviewDateB, reviewB.getReviewDate());
        System.out.println(reviewB);
    }
}
