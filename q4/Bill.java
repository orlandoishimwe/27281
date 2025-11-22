package Orl27281.q4;

public class Bill extends Payment {
    private double roomCharge;
    private double serviceCharge;
    private double totalBill;

    public Bill(int id, String createdDate, String updatedDate,
                String hotelName, String address, String phoneNumber, String email,
                String roomNumber, String roomType, double pricePerNight,
                String customerName, String customerEmail, String contactNumber,
                String bookingDate, String checkInDate, String checkOutDate,
                String serviceName, double serviceCost,
                String paymentMethod, String paymentDate,
                double roomCharge, double serviceCharge) throws DataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber, bookingDate, checkInDate, checkOutDate, serviceName, serviceCost, paymentMethod, paymentDate);
        if (roomCharge <= 0 || serviceCharge < 0) throw new DataException("Charges must be > 0 (serviceCharge can be 0)");
        this.roomCharge = roomCharge;
        this.serviceCharge = serviceCharge;
        this.totalBill = roomCharge + serviceCharge;
    }

    public double getRoomCharge() { return roomCharge; }
    public double getServiceCharge() { return serviceCharge; }
    public double getTotalBill() { return totalBill; }
}
