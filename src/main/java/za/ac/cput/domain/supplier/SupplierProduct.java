package za.ac.cput.domain.supplier;

import za.ac.cput.domain.product.Product;

import java.math.BigDecimal;

public class SupplierProduct {
    private int supplierProductId;
    private Supplier supplier;
    private Product product;
    private BigDecimal supplyPrice;
}
