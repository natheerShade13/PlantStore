package za.ac.cput.factory;

import za.ac.cput.domain.GiftCard;
import za.ac.cput.utility.Helper;

public class GiftCardFactory {

    public static GiftCard buildGiftCards(long giftCardId, int number, int pin, double amount,
                                          boolean isUsed){
        if(giftCardId < 0 || Helper.isNegative(number) || Helper.isNegative(pin) ||
        Helper.isNegative(amount))
            return null;

        return new GiftCard.Builder().setGiftCardId(giftCardId).setNumber(number).setPin(pin).setAmount(amount)
                .setUsed(isUsed).build();
    }

/*
    public static GiftCard buildGiftCards(int number, int pin, double amount, boolean isUsed){
        if(Helper.isNegative(number) || Helper.isNegative(pin) || Helper.isNegative(amount))
            return null;

        String id = Helper.generateID();

        return new GiftCard.Builder().setGiftCardId(id).setNumber(number).setPin(pin).setAmount(amount)
                .setUsed(isUsed).build();
    }

 */

}
