package za.ac.cput.domain.order;

import za.ac.cput.domain.payment.PaymentMethod;

import java.math.BigDecimal;
import java.util.Date;

public class Payment {
    private int paymentId;
    private Order order;
    private PaymentMethod paymentMethod;
    private BigDecimal amount;
    private Date paymentDate;
}
