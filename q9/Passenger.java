package Orl27281.q9;

public class Passenger extends Flight {
    private String passengerName;
    private String passportNumber;
    private String nationality;

    public Passenger(int id, String createdDate, String updatedDate,
                     String airlineName, String address, String contactEmail,
                     String flightNumber, String destination, String departureTime,
                     String passengerName, String passportNumber, String nationality) throws DataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime);
        if (passengerName == null || passengerName.isEmpty()) throw new DataException("Passenger name required");
        if (passportNumber == null || passportNumber.isEmpty()) throw new DataException("Passport number required");
        if (nationality == null || nationality.isEmpty()) throw new DataException("Nationality required");
        this.passengerName = passengerName;
        this.passportNumber = passportNumber;
        this.nationality = nationality;
    }

    public String getPassengerName() { return passengerName; }
    public String getPassportNumber() { return passportNumber; }
}
