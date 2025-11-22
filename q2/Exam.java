package Orl27281.q2;

public class Exam extends Course {
    private String examName;
    private int maxMarks;
    private String examDate;

    public Exam(int id, String createdDate, String updatedDate,
                String schoolName, String address, String phoneNumber, String email,
                String departmentName, String departmentCode,
                String teacherName, String subject, String teacherEmail, String teacherPhone,
                String studentName, int rollNumber, String grade, String contactNumber,
                String courseName, String courseCode, int creditHours,
                String examName, int maxMarks, String examDate) throws DataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, departmentName, departmentCode,
              teacherName, subject, teacherEmail, teacherPhone, studentName, rollNumber, grade, contactNumber,
              courseName, courseCode, creditHours);
        if (maxMarks <= 0) throw new DataException("maxMarks must be > 0");
        if (examDate == null || examDate.isEmpty()) throw new DataException("Exam date required");
        this.examName = examName;
        this.maxMarks = maxMarks;
        this.examDate = examDate;
    }

    public int getMaxMarks() { return maxMarks; }
    public String getExamName() { return examName; }
}
