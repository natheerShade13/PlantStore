package za.ac.cput.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.core.annotation.Order;
import za.ac.cput.domain.Review;
import za.ac.cput.utility.Helper;

import java.time.LocalDate;

@TestMethodOrder(OrderAnnotation.class)
public class ReviewFactoryTest {

    private Review reviewA;
    private Review reviewB;

    @Test
    @Order(1)
    void createReview() {
        long productIdA = Helper.generateUniqueID();
        long customerIdA = Helper.generateUniqueID();
        LocalDate reviewDateA = LocalDate.now();
        reviewA = ReviewFactory.createProductReview(productIdA, customerIdA, 5, "Beautiful and vibrant sunflowers", reviewDateA);
        Assertions.assertNotNull(reviewA);
        Assertions.assertEquals(productIdA, reviewA.getProductId());
        Assertions.assertEquals(customerIdA, reviewA.getCustomerId());
        Assertions.assertEquals(5, reviewA.getRating());
        Assertions.assertEquals("Beautiful and vibrant sunflowers", reviewA.getComment());
        Assertions.assertEquals(reviewDateA, reviewA.getReviewDate());
        Assertions.assertTrue(reviewA.getReviewId() > 0); // Check reviewId is set
        System.out.println(reviewA);
    }

    @Test
    @Order(2)
    void testCreateReview() {
        long productIdB = Helper.generateUniqueID();
        long customerIdB = Helper.generateUniqueID();
        LocalDate reviewDateB = LocalDate.of(2021, 8, 10);
        reviewB = ReviewFactory.createProductReview(productIdB, customerIdB, 3, "Roses were nice but not fresh", reviewDateB);
        Assertions.assertNotNull(reviewB);
        Assertions.assertEquals(productIdB, reviewB.getProductId());
        Assertions.assertEquals(customerIdB, reviewB.getCustomerId());
        Assertions.assertEquals(3, reviewB.getRating());
        Assertions.assertEquals("Roses were nice but not fresh", reviewB.getComment());
        Assertions.assertEquals(reviewDateB, reviewB.getReviewDate());
        Assertions.assertTrue(reviewB.getReviewId() > 0); // Check reviewId is set
        System.out.println(reviewB);
    }
}
