package za.ac.cput.domain.order;

import za.ac.cput.domain.shipping.ShippingMethod;

import java.util.Date;

public class Shipment {
    private int shipmentId;
    private Order order;
    private ShippingMethod shippingMethod;
    private Date shippedDate;
    private Date deliveryDate;
}
