package Orl27281.q9;

public class Payment extends Baggage {
    private String paymentDate;
    private String paymentMode;

    public Payment(int id, String createdDate, String updatedDate,
                   String airlineName, String address, String contactEmail,
                   String flightNumber, String destination, String departureTime,
                   String passengerName, String passportNumber, String nationality,
                   String seatNumber, String seatType,
                   String ticketNumber, double price,
                   double baggageWeight, double baggageFee,
                   String paymentDate, String paymentMode) throws DataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality, seatNumber, seatType, ticketNumber, price, baggageWeight, baggageFee);
        if (paymentDate == null || paymentDate.isEmpty()) throw new DataException("Payment date required");
        if (paymentMode == null || paymentMode.isEmpty()) throw new DataException("Payment mode required");
        this.paymentDate = paymentDate;
        this.paymentMode = paymentMode;
    }

    public String getPaymentDate() { return paymentDate; }
    public String getPaymentMode() { return paymentMode; }
}
