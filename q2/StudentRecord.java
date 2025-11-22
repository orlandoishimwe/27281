package Orl27281.q2;

public final class StudentRecord extends Fee {

    public StudentRecord(int id, String createdDate, String updatedDate,
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
              courseName, courseCode, creditHours, examName, maxMarks, examDate, obtainedMarks, remarks, tuitionFee, examFee);
    }

    public double calculateAverageMarks() {
        // (obtainedMarks / maxMarks) * 100
        return (getObtainedMarks() / getMaxMarks()) * 100.0;
    }
}
