package Orl27281.q9;

public class Baggage extends Ticket {
    private double baggageWeight;
    private double baggageFee;

    public Baggage(int id, String createdDate, String updatedDate,
                   String airlineName, String address, String contactEmail,
                   String flightNumber, String destination, String departureTime,
                   String passengerName, String passportNumber, String nationality,
                   String seatNumber, String seatType,
                   String ticketNumber, double price,
                   double baggageWeight, double baggageFee) throws DataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality, seatNumber, seatType, ticketNumber, price);
        if (baggageWeight < 0) throw new DataException("Baggage weight cannot be negative");
        if (baggageFee < 0) throw new DataException("Baggage fee must be ≥ 0");
        this.baggageWeight = baggageWeight;
        this.baggageFee = baggageFee;
    }

    public double getBaggageWeight() { return baggageWeight; }
    public double getBaggageFee() { return baggageFee; }
}
