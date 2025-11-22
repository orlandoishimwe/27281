package Orl27281.q4;

public class Customer extends Room {
    private String customerName;
    private String customerEmail;
    private String contactNumber;

    public Customer(int id, String createdDate, String updatedDate,
                    String hotelName, String address, String phoneNumber, String email,
                    String roomNumber, String roomType, double pricePerNight,
                    String customerName, String customerEmail, String contactNumber) throws DataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight);
        if (customerEmail == null || !customerEmail.contains("@")) throw new DataException("Invalid customer email");
        if (contactNumber == null || contactNumber.length() != 10) throw new DataException("Customer contact must be 10 digits");
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.contactNumber = contactNumber;
    }

    public String getCustomerName() { return customerName; }
}
