package Orl27281.q1;

public class Patient extends Nurse {
    private String patientName;
    private int age;
    private String gender;
    private String contact;

    public Patient(int id, String created, String updated,
                   String hospitalName, String address, String phoneNumber, String email,
                   String deptName, String deptCode,
                   String doctorName, String specialization, String doctorEmail, String doctorPhone,
                   String nurseName, String shift, int yearsExperience,
                   String patientName, int age, String gender, String contact)
            throws DataException {

        super(id, created, updated, hospitalName, address, phoneNumber, email,
                deptName, deptCode, doctorName, specialization, doctorEmail, doctorPhone,
                nurseName, shift, yearsExperience);

        if (age <= 0) throw new DataException("Age must be > 0");
        if (!gender.equals("Male") && !gender.equals("Female") && !gender.equals("Other"))
            throw new DataException("Invalid gender");

        this.patientName = patientName;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
    }

    public String getPatientName() { return patientName; }
}
