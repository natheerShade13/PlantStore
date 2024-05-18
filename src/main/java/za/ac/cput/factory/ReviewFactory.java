package za.ac.cput.factory;

import za.ac.cput.domain.Review;
import za.ac.cput.utility.ReviewHelper;

import java.time.LocalDate;

public class ReviewFactory {
    public static Review createProductReview(long productId, long customerId, int rating, String comment, LocalDate reviewDate) {
        if (productId <= 0 || customerId <= 0 || rating < 1 || rating > 5 || ReviewHelper.isNullOrEmpty(comment) || reviewDate == null) {
            return null;
        }
        long reviewId = ReviewHelper.generateUniqueID();
        return new Review.Builder()
                .setReviewId(reviewId)
                .setProductId(productId)
                .setCustomerId(customerId)
                .setRating(rating)
                .setComment(comment)
                .setReviewDate(reviewDate)
                .build();
    }
}
