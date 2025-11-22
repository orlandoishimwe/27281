package Orl27281.q10;

public class Cart extends Customer {
    private int quantity;

    public Cart(int id, String createdDate, String updatedDate,
                String storeName, String location,
                String categoryName, String categoryCode,
                String productName, double price, String sku,
                String customerName, String email, String phoneNumber,
                int quantity) throws DataException {

        super(id, createdDate, updatedDate, storeName, location,
              categoryName, categoryCode, productName, price, sku,
              customerName, email, phoneNumber);

        if (quantity <= 0)
            throw new DataException("Quantity must be > 0");

        this.quantity = quantity;
    }

    public int getQuantity() { return quantity; }
}
