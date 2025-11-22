package Orl27281.q1;

public class Hospital extends Entity {
    private String hospitalName;
    private String address;
    private String phoneNumber;
    private String email;

    public Hospital(int id, String createdDate, String updatedDate,
                    String hospitalName, String address, String phoneNumber, String email)
            throws DataException {
        super(id, createdDate, updatedDate);

        if (phoneNumber.length() != 10) throw new DataException("Phone must be 10 digits");
        if (!email.contains("@")) throw new DataException("Invalid email");

        this.hospitalName = hospitalName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getHospitalName() { return hospitalName; }
}
