package Orl27281.q9;

public class Airline extends Entity {
    private String airlineName;
    private String address;
    private String contactEmail;

    public Airline(int id, String createdDate, String updatedDate,
                   String airlineName, String address, String contactEmail) throws DataException {
        super(id, createdDate, updatedDate);
        if (airlineName == null || airlineName.isEmpty()) throw new DataException("Airline name required");
        if (contactEmail == null || !contactEmail.contains("@")) throw new DataException("Invalid contact email");
        this.airlineName = airlineName;
        this.address = address;
        this.contactEmail = contactEmail;
    }

    public String getAirlineName() { return airlineName; }
}
