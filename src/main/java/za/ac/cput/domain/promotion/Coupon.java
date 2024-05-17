package za.ac.cput.domain.promotion;

import java.math.BigDecimal;
import java.util.Date;

public class Coupon {
    private int couponId;
    private String code;
    private String description;
    private String discountType;
    private BigDecimal discountAmount;
    private Date startDate;
    private Date endDate;
    private boolean isActive;
}
