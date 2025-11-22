package Orl27281.q1;

public final class HospitalRecord extends Bill {

    public HospitalRecord(int id, String created, String updated,
                          String hospitalName, String address, String phoneNumber, String email,
                          String deptName, String deptCode,
                          String doctorName, String specialization, String doctorEmail, String doctorPhone,
                          String nurseName, String shift, int yearsExperience,
                          String patientName, int age, String gender, String contact,
                          String admissionDate, String roomNumber, double roomCharges,
                          String diagnosis, String treatmentGiven, double treatmentCost,
                          double doctorFee, double medicineCost)
            throws DataException {

        super(id, created, updated, hospitalName, address, phoneNumber, email,
                deptName, deptCode, doctorName, specialization, doctorEmail, doctorPhone,
                nurseName, shift, yearsExperience, patientName, age, gender, contact,
                admissionDate, roomNumber, roomCharges,
                diagnosis, treatmentGiven, treatmentCost, doctorFee, medicineCost);
    }

    public double generateBill() {
        return getRoomCharges() + getTreatmentCost() + getDoctorFee() + getMedicineCost();
    }

    public String getPatientName() {
        return super.getPatientName();
    }

    public String getHospitalName() {
        return super.getHospitalName();
    }

    public String getNurseName() {
        return super.getNurseName();
    }
}
