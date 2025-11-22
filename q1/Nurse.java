package Orl27281.q1;

public class Nurse extends Doctor {
    private String nurseName;
    private String shift;
    private int yearsOfExperience;

    public Nurse(int id, String created, String updated,
                 String hospitalName, String address, String phoneNumber, String email,
                 String deptName, String deptCode,
                 String doctorName, String specialization, String doctorEmail, String doctorPhone,
                 String nurseName, String shift, int yearsOfExperience)
            throws DataException {

        super(id, created, updated, hospitalName, address, phoneNumber, email,
                deptName, deptCode, doctorName, specialization, doctorEmail, doctorPhone);

        if (!shift.equals("Day") && !shift.equals("Night"))
            throw new DataException("Shift must be Day or Night");
        if (yearsOfExperience < 0) throw new DataException("Experience must be ≥ 0");

        this.nurseName = nurseName;
        this.shift = shift;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getNurseName() { return nurseName; }
}
