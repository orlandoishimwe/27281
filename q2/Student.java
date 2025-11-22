package Orl27281.q2;

public class Student extends Teacher {
    private String studentName;
    private int rollNumber;
    private String grade;
    private String contactNumber;

    public Student(int id, String createdDate, String updatedDate,
                   String schoolName, String address, String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String teacherName, String subject, String teacherEmail, String teacherPhone,
                   String studentName, int rollNumber, String grade, String contactNumber) throws DataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, departmentName, departmentCode,
              teacherName, subject, teacherEmail, teacherPhone);
        if (rollNumber <= 0) throw new DataException("Roll number must be > 0");
        if (grade == null || grade.isEmpty()) throw new DataException("Grade required");
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.contactNumber = contactNumber;
    }

    public String getStudentName() { return studentName; }
    public int getRollNumber() { return rollNumber; }
    public String getGrade() { return grade; }
}