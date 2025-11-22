package Orl27281.q7;

public class School extends Entity {
    private String schoolName;
    private String address;

    public School(int id, String createdDate, String updatedDate,
                  String schoolName, String address) throws DataException {
        super(id, createdDate, updatedDate);

        if (schoolName == null || schoolName.isEmpty())
            throw new DataException("School name required");
        if (address == null || address.isEmpty())
            throw new DataException("Address required");

        this.schoolName = schoolName;
        this.address = address;
    }

    public String getSchoolName() { return schoolName; }
}