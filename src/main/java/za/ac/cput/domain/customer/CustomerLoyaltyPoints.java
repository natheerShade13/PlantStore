package za.ac.cput.domain.customer;

import za.ac.cput.domain.loyalty.LoyaltyProgram;

import java.math.BigDecimal;

public class CustomerLoyaltyPoints {
    private int customerLoyaltyPointsId;
    private Customer customer;
    private LoyaltyProgram loyaltyProgram;
    private BigDecimal pointsEarned;
    private BigDecimal pointsRedeemed;
}
