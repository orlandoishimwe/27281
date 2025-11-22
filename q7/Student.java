package Orl27281.q7;

public class Student extends Teacher {
    private String studentName;
    private String registrationNumber;

    public Student(int id, String createdDate, String updatedDate,
                   String schoolName, String address,
                   String departmentName, String deptCode,
                   String teacherName, String qualification,
                   String studentName, String registrationNumber) throws DataException {
        super(id, createdDate, updatedDate, schoolName, address,
              departmentName, deptCode, teacherName, qualification);

        if (registrationNumber == null || registrationNumber.isEmpty())
            throw new DataException("Registration number required");

        this.studentName = studentName;
        this.registrationNumber = registrationNumber;
    }

    public String getStudentName() { return studentName; }
}
