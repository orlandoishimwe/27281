package Orl27281.q4;

public class Room extends Hotel {
    private String roomNumber;
    private String roomType;
    private double pricePerNight;

    public Room(int id, String createdDate, String updatedDate,
                String hotelName, String address, String phoneNumber, String email,
                String roomNumber, String roomType, double pricePerNight) throws DataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email);
        if (pricePerNight <= 0) throw new DataException("Price per night must be > 0");
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
    }

    public String getRoomNumber() { return roomNumber; }
    public double getPricePerNight() { return pricePerNight; }
}
