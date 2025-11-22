package Orl27281.q10;

public final class OrderRecord extends Receipt {

    public OrderRecord(int id, String createdDate, String updatedDate,
                       String storeName, String location,
                       String categoryName, String categoryCode,
                       String productName, double price, String sku,
                       String customerName, String email, String phoneNumber,
                       int quantity,
                       String orderNumber, String orderDate,
                       String shippingAddress, double shippingFee,
                       String paymentMode, String transactionId,
                       double totalAmount) throws DataException {

        super(id, createdDate, updatedDate, storeName, location,
              categoryName, categoryCode, productName, price, sku,
              customerName, email, phoneNumber,
              quantity, orderNumber, orderDate,
              shippingAddress, shippingFee,
              paymentMode, transactionId,
              totalAmount);
    }

    public double calculateTotal() {
        return (getPrice() * getQuantity()) + getShippingFee();
    }
}
