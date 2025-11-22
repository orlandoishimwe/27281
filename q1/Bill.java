package Orl27281.q1;

public class Bill extends Treatment {
    private double doctorFee;
    private double medicineCost;
    private double totalBill;

    public Bill(int id, String created, String updated,
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
                admissionDate, roomNumber, roomCharges, diagnosis, treatmentGiven, treatmentCost);

        if (doctorFee <= 0 || medicineCost <= 0)
            throw new DataException("Invalid cost");

        this.doctorFee = doctorFee;
        this.medicineCost = medicineCost;
    }

    public double getDoctorFee() { return doctorFee; }
    public double getMedicineCost() { return medicineCost; }
}
