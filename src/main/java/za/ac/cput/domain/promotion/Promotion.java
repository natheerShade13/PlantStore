package za.ac.cput.domain.promotion;

import java.math.BigDecimal;
import java.util.Date;

public class Promotion {
    private int promotionId;
    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    private String discountType;
    private BigDecimal discountAmount;
}
