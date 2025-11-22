package Orl27281.q7;

public class Course extends Student {
    private String courseName;
    private int creditHours;

    public Course(int id, String createdDate, String updatedDate,
                  String schoolName, String address,
                  String departmentName, String deptCode,
                  String teacherName, String qualification,
                  String studentName, String registrationNumber,
                  String courseName, int creditHours) throws DataException {
        super(id, createdDate, updatedDate, schoolName, address,
              departmentName, deptCode, teacherName, qualification,
              studentName, registrationNumber);

        if (creditHours <= 0) throw new DataException("Credit hours must be > 0");

        this.courseName = courseName;
        this.creditHours = creditHours;
    }

    public int getCreditHours() { return creditHours; }
}
