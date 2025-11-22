package Orl27281.q9;

public class Flight extends Airline {
    private String flightNumber;
    private String destination;
    private String departureTime; // keep as string

    public Flight(int id, String createdDate, String updatedDate,
                  String airlineName, String address, String contactEmail,
                  String flightNumber, String destination, String departureTime) throws DataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail);
        if (flightNumber == null || flightNumber.isEmpty()) throw new DataException("Flight number required");
        if (destination == null || destination.isEmpty()) throw new DataException("Destination required");
        if (departureTime == null || departureTime.isEmpty()) throw new DataException("Departure time required");
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public String getFlightNumber() { return flightNumber; }
    public String getDestination() { return destination; }
    public String getDepartureTime() { return departureTime; }
}