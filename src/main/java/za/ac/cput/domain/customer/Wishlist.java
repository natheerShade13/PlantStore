package za.ac.cput.domain.customer;

import java.util.Date;
import java.util.List;

public class Wishlist {
    private int wishlistId;
    private Customer customer;
    private Date createdDate;
    private List<WishlistItem> items;
}
