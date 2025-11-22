package Orl27281.q5;

public class Rental extends Customer {
    private String rentalDate;
    private String returnDate;
    private int rentalDays;

    public Rental(int id, String createdDate, String updatedDate,
                  String companyName, String address, String phoneNumber,
                  String branchName, String locationCode,
                  String vehicleType, String registrationNumber, double dailyRate,
                  String customerName, String licenseNumber, String contactNumber,
                  String rentalDate, String returnDate, int rentalDays) throws DataException {

        super(id, createdDate, updatedDate, companyName, address, phoneNumber,
              branchName, locationCode, vehicleType, registrationNumber, dailyRate,
              customerName, licenseNumber, contactNumber);

        if (rentalDays <= 0)
            throw new DataException("Rental days must be > 0");

        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.rentalDays = rentalDays;
    }

    public int getRentalDays() { return rentalDays; }
}
