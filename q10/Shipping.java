package Orl27281.q10;

public class Shipping extends Order {
    private String shippingAddress;
    private double shippingFee;

    public Shipping(int id, String createdDate, String updatedDate,
                    String storeName, String location,
                    String categoryName, String categoryCode,
                    String productName, double price, String sku,
                    String customerName, String email, String phoneNumber,
                    int quantity,
                    String orderNumber, String orderDate,
                    String shippingAddress, double shippingFee) throws DataException {

        super(id, createdDate, updatedDate, storeName, location,
              categoryName, categoryCode, productName, price, sku,
              customerName, email, phoneNumber,
              quantity, orderNumber, orderDate);

        if (shippingFee < 0)
            throw new DataException("Shipping fee must be ≥ 0");

        this.shippingAddress = shippingAddress;
        this.shippingFee = shippingFee;
    }

    public double getShippingFee() { return shippingFee; }
}
