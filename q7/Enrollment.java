package Orl27281.q7;

public class Enrollment extends Course {
    private String semester;
    private String enrollmentDate;

    public Enrollment(int id, String createdDate, String updatedDate,
                      String schoolName, String address,
                      String departmentName, String deptCode,
                      String teacherName, String qualification,
                      String studentName, String registrationNumber,
                      String courseName, int creditHours,
                      String semester, String enrollmentDate) throws DataException {
        super(id, createdDate, updatedDate, schoolName, address,
              departmentName, deptCode, teacherName, qualification,
              studentName, registrationNumber,
              courseName, creditHours);

        this.semester = semester;
        this.enrollmentDate = enrollmentDate;
    }
}
