package Orl27281.q2;

public class Fee extends Result {
    private double tuitionFee;
    private double examFee;
    private double totalFee;

    public Fee(int id, String createdDate, String updatedDate,
               String schoolName, String address, String phoneNumber, String email,
               String departmentName, String departmentCode,
               String teacherName, String subject, String teacherEmail, String teacherPhone,
               String studentName, int rollNumber, String grade, String contactNumber,
               String courseName, String courseCode, int creditHours,
               String examName, int maxMarks, String examDate,
               double obtainedMarks, String remarks,
               double tuitionFee, double examFee) throws DataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, departmentName, departmentCode,
              teacherName, subject, teacherEmail, teacherPhone, studentName, rollNumber, grade, contactNumber,
              courseName, courseCode, creditHours, examName, maxMarks, examDate, obtainedMarks, remarks);
        if (tuitionFee <= 0 || examFee <= 0) throw new DataException("Fees must be > 0");
        this.tuitionFee = tuitionFee;
        this.examFee = examFee;
        this.totalFee = tuitionFee + examFee;
    }

    public double getTotalFee() { return totalFee; }
}
