package Orl27281.q1;

public class Admission extends Patient {
    private String admissionDate;
    private String roomNumber;
    private double roomCharges;

    public Admission(int id, String created, String updated,
                     String hospitalName, String address, String phoneNumber, String email,
                     String deptName, String deptCode,
                     String doctorName, String specialization, String doctorEmail, String doctorPhone,
                     String nurseName, String shift, int yearsExperience,
                     String patientName, int age, String gender, String contact,
                     String admissionDate, String roomNumber, double roomCharges)
            throws DataException {

        super(id, created, updated, hospitalName, address, phoneNumber, email,
                deptName, deptCode, doctorName, specialization, doctorEmail, doctorPhone,
                nurseName, shift, yearsExperience, patientName, age, gender, contact);

        if (roomCharges <= 0) throw new DataException("Room charges must be > 0");

        this.admissionDate = admissionDate;
        this.roomNumber = roomNumber;
        this.roomCharges = roomCharges;
    }

    public double getRoomCharges() { return roomCharges; }
}
