package Orl27281.q9;

public class Seat extends Passenger {
    private String seatNumber;
    private String seatType; // Economy or Business

    public Seat(int id, String createdDate, String updatedDate,
                String airlineName, String address, String contactEmail,
                String flightNumber, String destination, String departureTime,
                String passengerName, String passportNumber, String nationality,
                String seatNumber, String seatType) throws DataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality);
        if (!"Economy".equals(seatType) && !"Business".equals(seatType)) {
            throw new DataException("seatType must be Economy or Business");
        }
        if (seatNumber == null || seatNumber.isEmpty()) throw new DataException("Seat number required");
        this.seatNumber = seatNumber;
        this.seatType = seatType;
    }

    public String getSeatNumber() { return seatNumber; }
    public String getSeatType() { return seatType; }
}
