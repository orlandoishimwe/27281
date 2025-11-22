package Orl27281.q4;

public class Hotel extends Entity {
    private String hotelName;
    private String address;
    private String phoneNumber;
    private String email;

    public Hotel(int id, String createdDate, String updatedDate,
                 String hotelName, String address, String phoneNumber, String email) throws DataException {
        super(id, createdDate, updatedDate);
        if (phoneNumber == null || phoneNumber.length() != 10) throw new DataException("Phone must be 10 digits");
        if (email == null || !email.contains("@")) throw new DataException("Invalid email");
        this.hotelName = hotelName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getHotelName() { return hotelName; }
    public String getAddress() { return address; }
}
