package Orl27281.q5;

public class Company extends Entity {
    private String companyName;
    private String address;
    private String phoneNumber;

    public Company(int id, String createdDate, String updatedDate,
                   String companyName, String address, String phoneNumber) throws DataException {
        super(id, createdDate, updatedDate);

        if (phoneNumber == null || phoneNumber.length() != 10)
            throw new DataException("Phone must be 10 digits");

        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getCompanyName() { return companyName; }
}
