package za.ac.cput.factory;

import za.ac.cput.domain.Order;
import za.ac.cput.utility.Helper;

import java.util.Date;


public class OrderFactory {
    public static Order buildOrder(long orderId, Date orderDate, double totalAmount, String status, String orderLine){
        if(orderId < 0 ||
                Helper.isNull(orderDate) ||
                Helper.isNegative(totalAmount) ||
                Helper.isNullorEmpty(status) ||
                Helper.isNullorEmpty(orderLine))
            return null;


        return new Order.Builder()
                .setOrderId(orderId)
                .setOrderDate(orderDate)
                .setTotalAmount(totalAmount)
                .setStatus(status)
                .setOrderLine(orderLine)
                .build();
    }
}
