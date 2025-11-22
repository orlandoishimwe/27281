package Orl27281.q9;

public class Ticket extends Seat {
    private String ticketNumber;
    private double price;

    public Ticket(int id, String createdDate, String updatedDate,
                  String airlineName, String address, String contactEmail,
                  String flightNumber, String destination, String departureTime,
                  String passengerName, String passportNumber, String nationality,
                  String seatNumber, String seatType,
                  String ticketNumber, double price) throws DataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality, seatNumber, seatType);
        if (ticketNumber == null || ticketNumber.isEmpty()) throw new DataException("Ticket number required");
        if (price <= 0) throw new DataException("Price must be > 0");
        this.ticketNumber = ticketNumber;
        this.price = price;
    }

    public String getTicketNumber() { return ticketNumber; }
    public double getPrice() { return price; }
}