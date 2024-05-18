package za.ac.cput.factory;

import za.ac.cput.domain.Promotions;

import java.util.Date;

public class PromotionsFactory {

    public static Promotions buildPromotions(long promotionsId, String name, String description,
                                             Date startDate, Date endDate, String discountType,
                                             double discountAmount){

        if(promotionsId < 0 || Helper.isNullOrEmpty(name) || Helper.isNullOrEmpty(description) ||
                Helper.isNull(startDate) || Helper.isNull(endDate) || Helper.isNullOrEmpty(discountType) ||
                Helper.isNegative(discountAmount))
            return null;

        return new Promotions.Builder().setPromotionId(promotionsId).setName(name).setDescription(description)
                .setStartDate(startDate).setEndDate(endDate).setDiscountType(discountType)
                .setDiscountAmount(discountAmount).Build();
    }

}
