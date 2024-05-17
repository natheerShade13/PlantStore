package za.ac.cput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.GiftCards;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class GiftCardsFactoryTest {

    private GiftCards giftCardA;
    private GiftCards giftCardB;
    private GiftCards giftCardC;

    @Test
    @Order(1)
    void buildGiftCards() {
        giftCardA = GiftCardsFactory.buildGiftCards(123456789, 100, 4561, 1000
                , false);
        assertNotNull(giftCardA);
        System.out.println(giftCardA);
    }

    @Test
    @Order(2)
    void copyBuildGiftCards() {
        giftCardC = GiftCardsFactory.buildGiftCards(123456789, 100, 4561, 1000
                , false);
        giftCardB = new GiftCards.Builder().copy(giftCardC).setAmount(5000).build();
        assertNotNull(giftCardB);
        System.out.println(giftCardB);
    }
}