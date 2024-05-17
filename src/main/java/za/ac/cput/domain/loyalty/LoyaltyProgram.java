package za.ac.cput.domain.loyalty;

import za.ac.cput.domain.customer.CustomerLoyaltyPoints;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class LoyaltyProgram {
    private int loyaltyProgramId;
    private String name;
    private String description;
    private BigDecimal pointsToEarn;
    private Date startDate;
    private Date endDate;
    private List<CustomerLoyaltyPoints> customerLoyaltyPoints;
}
