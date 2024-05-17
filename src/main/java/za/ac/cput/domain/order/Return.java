package za.ac.cput.domain.order;

import java.util.Date;
import java.util.List;

public class Return {
    private int returnId;
    private Order order;
    private Date returnDate;
    private String returnReason;
    private String status;
    private List<ReturnItem> returnItems;
}
