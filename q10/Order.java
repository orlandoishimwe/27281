package Orl27281.q10;

public class Order extends Cart {
    private String orderNumber;
    private String orderDate;

    public Order(int id, String createdDate, String updatedDate,
                 String storeName, String location,
                 String categoryName, String categoryCode,
                 String productName, double price, String sku,
                 String customerName, String email, String phoneNumber,
                 int quantity,
                 String orderNumber, String orderDate) throws DataException {

        super(id, createdDate, updatedDate, storeName, location,
              categoryName, categoryCode, productName, price, sku,
              customerName, email, phoneNumber, quantity);

        if (orderNumber == null || orderNumber.isEmpty())
            throw new DataException("Order number required");

        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
    }
}
