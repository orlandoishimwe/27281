package Orl27281.q4;

public class Payment extends Service {
    private String paymentMethod;
    private String paymentDate;

    public Payment(int id, String createdDate, String updatedDate,
                   String hotelName, String address, String phoneNumber, String email,
                   String roomNumber, String roomType, double pricePerNight,
                   String customerName, String customerEmail, String contactNumber,
                   String bookingDate, String checkInDate, String checkOutDate,
                   String serviceName, double serviceCost,
                   String paymentMethod, String paymentDate) throws DataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber, bookingDate, checkInDate, checkOutDate, serviceName, serviceCost);
        if (paymentMethod == null || paymentMethod.isEmpty()) throw new DataException("Payment method required");
        if (paymentDate == null || paymentDate.isEmpty()) throw new DataException("Payment date required");
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() { return paymentMethod; }
}
