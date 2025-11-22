package Orl27281.q1;

public class Doctor extends Department {
    private String doctorName;
    private String specialization;
    private String doctorEmail;
    private String phone;

    public Doctor(int id, String created, String updated,
                  String hospitalName, String address, String phoneNumber, String email,
                  String deptName, String deptCode,
                  String doctorName, String specialization, String doctorEmail, String phone)
            throws DataException {

        super(id, created, updated, hospitalName, address, phoneNumber, email, deptName, deptCode);

        if (specialization.isEmpty()) throw new DataException("Specialization required");
        if (!doctorEmail.contains("@")) throw new DataException("Invalid doctor email");
        if (phone.length() != 10) throw new DataException("Invalid doctor phone");

        this.doctorName = doctorName;
        this.specialization = specialization;
        this.doctorEmail = doctorEmail;
        this.phone = phone;
    }

    public String getDoctorName() { return doctorName; }
}
