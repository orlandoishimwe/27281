package Orl27281.q10;

public class Payment extends Shipping {
    private String paymentMode;
    private String transactionId;

    public Payment(int id, String createdDate, String updatedDate,
                   String storeName, String location,
                   String categoryName, String categoryCode,
                   String productName, double price, String sku,
                   String customerName, String email, String phoneNumber,
                   int quantity,
                   String orderNumber, String orderDate,
                   String shippingAddress, double shippingFee,
                   String paymentMode, String transactionId) throws DataException {

        super(id, createdDate, updatedDate, storeName, location,
              categoryName, categoryCode, productName, price, sku,
              customerName, email, phoneNumber,
              quantity, orderNumber, orderDate,
              shippingAddress, shippingFee);

        if (paymentMode == null || paymentMode.isEmpty())
            throw new DataException("Payment mode required");
        if (transactionId == null || transactionId.isEmpty())
            throw new DataException("Transaction ID required");

        this.paymentMode = paymentMode;
        this.transactionId = transactionId;
    }
}
