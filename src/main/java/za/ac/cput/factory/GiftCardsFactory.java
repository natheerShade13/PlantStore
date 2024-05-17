package za.ac.cput.factory;

import za.ac.cput.domain.GiftCards;
import za.ac.cput.utility.Helper;

public class GiftCardsFactory {

    public static GiftCards buildGiftCards(String giftCardId, int number, int pin, double amount,
                                           boolean isUsed){
        if(Helper.isNullOrEmpty(giftCardId) || Helper.isNegative(number) || Helper.isNegative(pin) ||
        Helper.isNegative(amount))
            return null;

        return new GiftCards.Builder().setGiftCardId(giftCardId).setNumber(number).setPin(pin).setAmount(amount)
                .setUsed(isUsed).build();
    }

    public static GiftCards buildGiftCards(int number, int pin, double amount, boolean isUsed){
        if(Helper.isNegative(number) || Helper.isNegative(pin) || Helper.isNegative(amount))
            return null;

        String id = Helper.generateID();

        return new GiftCards.Builder().setGiftCardId(id).setNumber(number).setPin(pin).setAmount(amount)
                .setUsed(isUsed).build();
    }

}
