package za.ac.cput.domain.product;

import java.math.BigDecimal;
import java.util.List;

public class Product {
    private int productId;
    private String name;
    private String description;
    private BigDecimal price;
    private String imageUrl;
    private String sku;
    private Category category;
    private Inventory inventory;
    private List<ProductTag> productTags;
}
