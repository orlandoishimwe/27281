package Orl27281.q2;

public class Result extends Exam {
    private double obtainedMarks;
    private String remarks;

    public Result(int id, String createdDate, String updatedDate,
                  String schoolName, String address, String phoneNumber, String email,
                  String departmentName, String departmentCode,
                  String teacherName, String subject, String teacherEmail, String teacherPhone,
                  String studentName, int rollNumber, String grade, String contactNumber,
                  String courseName, String courseCode, int creditHours,
                  String examName, int maxMarks, String examDate,
                  double obtainedMarks, String remarks) throws DataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, departmentName, departmentCode,
              teacherName, subject, teacherEmail, teacherPhone, studentName, rollNumber, grade, contactNumber,
              courseName, courseCode, creditHours, examName, maxMarks, examDate);
        if (obtainedMarks < 0) throw new DataException("Obtained marks cannot be negative");
        if (remarks == null || remarks.isEmpty()) throw new DataException("Remarks required");
        this.obtainedMarks = obtainedMarks;
        this.remarks = remarks;
    }

    public double getObtainedMarks() { return obtainedMarks; }
    public String getRemarks() { return remarks; }
}
