package Orl27281.q1;

public class Treatment extends Admission {
    private String diagnosis;
    private String treatmentGiven;
    private double treatmentCost;

    public Treatment(int id, String created, String updated,
                     String hospitalName, String address, String phoneNumber, String email,
                     String deptName, String deptCode,
                     String doctorName, String specialization, String doctorEmail, String doctorPhone,
                     String nurseName, String shift, int yearsExperience,
                     String patientName, int age, String gender, String contact,
                     String admissionDate, String roomNumber, double roomCharges,
                     String diagnosis, String treatmentGiven, double treatmentCost)
            throws DataException {

        super(id, created, updated, hospitalName, address, phoneNumber, email,
                deptName, deptCode, doctorName, specialization, doctorEmail, doctorPhone,
                nurseName, shift, yearsExperience, patientName, age, gender, contact,
                admissionDate, roomNumber, roomCharges);

        if (treatmentCost <= 0) throw new DataException("Treatment cost must be > 0");

        this.diagnosis = diagnosis;
        this.treatmentGiven = treatmentGiven;
        this.treatmentCost = treatmentCost;
    }

    public double getTreatmentCost() { return treatmentCost; }
}
