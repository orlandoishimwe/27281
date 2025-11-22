package Orl27281.q5;

public class Payment extends Charge {
    private String paymentMode;
    private String transactionId;

    public Payment(int id, String createdDate, String updatedDate,
                   String companyName, String address, String phoneNumber,
                   String branchName, String locationCode,
                   String vehicleType, String registrationNumber, double dailyRate,
                   String customerName, String licenseNumber, String contactNumber,
                   String rentalDate, String returnDate, int rentalDays,
                   double rentalCharge, double penaltyCharge,
                   String paymentMode, String transactionId) throws DataException {

        super(id, createdDate, updatedDate, companyName, address, phoneNumber,
              branchName, locationCode, vehicleType, registrationNumber, dailyRate,
              customerName, licenseNumber, contactNumber,
              rentalDate, returnDate, rentalDays,
              rentalCharge, penaltyCharge);

        if (paymentMode == null || paymentMode.isEmpty())
            throw new DataException("Payment mode required");
        if (transactionId == null || transactionId.isEmpty())
            throw new DataException("Transaction ID required");

        this.paymentMode = paymentMode;
        this.transactionId = transactionId;
    }
}
