package Orl27281.q10;

public class Customer extends Product {
    private String customerName;
    private String email;
    private String phoneNumber;

    public Customer(int id, String createdDate, String updatedDate,
                    String storeName, String location,
                    String categoryName, String categoryCode,
                    String productName, double price, String sku,
                    String customerName, String email, String phoneNumber) throws DataException {

        super(id, createdDate, updatedDate, storeName, location,
              categoryName, categoryCode, productName, price, sku);

        if (email == null || !email.contains("@"))
            throw new DataException("Invalid email");
        if (phoneNumber == null || phoneNumber.length() != 10)
            throw new DataException("Phone number must be 10 digits");

        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() { return customerName; }
}
