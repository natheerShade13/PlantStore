package za.ac.cput.factory;

import za.ac.cput.domain.OrderLine;
import za.ac.cput.utility.Helper;

public class OrderLineFactory {
    public static OrderLine buildOrderLine(long orderLineId, String item, int quantity, double price){
        if( orderLineId < 0 || Helper.isNullOrEmpty(item) ||
                quantity < 0 || Helper.isNegative(price))
            return null;

        return new OrderLine.Builder().setOrderLineId(orderLineId)
                .setItem(item)
                .setQuantity(quantity)
                .setPrice(price)
                .build();
    }
}
