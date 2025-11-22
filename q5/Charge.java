package Orl27281.q5;

public class Charge extends Rental {
    private double rentalCharge;
    private double penaltyCharge;

    public Charge(int id, String createdDate, String updatedDate,
                  String companyName, String address, String phoneNumber,
                  String branchName, String locationCode,
                  String vehicleType, String registrationNumber, double dailyRate,
                  String customerName, String licenseNumber, String contactNumber,
                  String rentalDate, String returnDate, int rentalDays,
                  double rentalCharge, double penaltyCharge) throws DataException {

        super(id, createdDate, updatedDate, companyName, address, phoneNumber,
              branchName, locationCode, vehicleType, registrationNumber, dailyRate,
              customerName, licenseNumber, contactNumber,
              rentalDate, returnDate, rentalDays);

        if (rentalCharge < 0 || penaltyCharge < 0)
            throw new DataException("Charges must be ≥ 0");

        this.rentalCharge = rentalCharge;
        this.penaltyCharge = penaltyCharge;
    }

    public double getRentalCharge() { return rentalCharge; }
    public double getPenaltyCharge() { return penaltyCharge; }
}
