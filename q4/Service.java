package Orl27281.q4;

public class Service extends Booking {
    private String serviceName;
    private double serviceCost;

    public Service(int id, String createdDate, String updatedDate,
                   String hotelName, String address, String phoneNumber, String email,
                   String roomNumber, String roomType, double pricePerNight,
                   String customerName, String customerEmail, String contactNumber,
                   String bookingDate, String checkInDate, String checkOutDate,
                   String serviceName, double serviceCost) throws DataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber, bookingDate, checkInDate, checkOutDate);
        if (serviceName == null || serviceName.isEmpty()) throw new DataException("Service name required");
        if (serviceCost <= 0) throw new DataException("Service cost must be > 0");
        this.serviceName = serviceName;
        this.serviceCost = serviceCost;
    }

    public double getServiceCost() { return serviceCost; }
}
