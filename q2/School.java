package Orl27281.q2;

public class School extends Entity {
    private String schoolName;
    private String address;
    private String phoneNumber;
    private String email;

    public School(int id, String createdDate, String updatedDate,
                  String schoolName, String address, String phoneNumber, String email)
            throws DataException {
        super(id, createdDate, updatedDate);
        if (phoneNumber == null || phoneNumber.length() != 10) throw new DataException("Phone must be 10 digits");
        if (email == null || !email.contains("@")) throw new DataException("Invalid email");
        this.schoolName = schoolName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getSchoolName() { return schoolName; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }
}
