package za.ac.cput.factory;

import za.ac.cput.domain.GiftCards;

public class GiftCardsFactory {

    public static GiftCards buildGiftCards(long giftCardId, int number, int pin, double amount,
                                           boolean isUsed){
        if(giftCardId < 0 || Helper.isNegative(number) || Helper.isNegative(pin) ||
        Helper.isNegative(amount))
            return null;

        return new GiftCards.Builder().setGiftCardId(giftCardId).setNumber(number).setPin(pin).setAmount(amount)
                .setUsed(isUsed).build();
    }

/*
    public static GiftCards buildGiftCards(int number, int pin, double amount, boolean isUsed){
        if(Helper.isNegative(number) || Helper.isNegative(pin) || Helper.isNegative(amount))
            return null;

        String id = Helper.generateID();

        return new GiftCards.Builder().setGiftCardId(id).setNumber(number).setPin(pin).setAmount(amount)
                .setUsed(isUsed).build();
    }

 */

}
