package Orl27281.q5;

public final class RentalRecord extends Invoice {

    public RentalRecord(int id, String createdDate, String updatedDate,
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
              rentalCharge, penaltyCharge, paymentMode, transactionId,
              rentalCharge + penaltyCharge);
    }

    public double calculateTotalCharge() {
        return getRentalCharge() + getPenaltyCharge();
    }
}
