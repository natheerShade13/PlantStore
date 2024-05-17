package za.ac.cput.factory;

import za.ac.cput.domain.Customer;
import za.ac.cput.utility.Helper;

import java.time.LocalDate;

public class ReviewFactory {
    public static Customer.Review createProductReview(long productId, long customerId, int rating, String comment, LocalDate reviewDate) {
        if (productId <= 0 || customerId <= 0 || rating < 1 || rating > 5 || Helper.isNullOrEmpty(comment) || reviewDate == null) {
            return null;
        }
        long reviewId = Helper.generateUniqueID();
        return new Customer.Review.Builder()
                .setReviewId(reviewId)
                .setProductId(productId)
                .setCustomerId(customerId)
                .setRating(rating)
                .setComment(comment)
                .setReviewDate(reviewDate)
                .build();
    }
}
