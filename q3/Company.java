package Orl27281.q3;

public class Company extends Entity {
    private String companyName;
    private String address;
    private String phoneNumber;
    private String email;

    public Company(int id, String createdDate, String updatedDate,
                   String companyName, String address, String phoneNumber, String email) throws DataException {
        super(id, createdDate, updatedDate);
        if (phoneNumber == null || phoneNumber.length() != 10) throw new DataException("Phone must be 10 digits");
        if (email == null || !email.contains("@")) throw new DataException("Invalid email");
        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getCompanyName() { return companyName; }
    public String getAddress() { return address; }
}
