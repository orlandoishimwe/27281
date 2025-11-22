package Orl27281.q7;

public class Grade extends Assessment {
    private double totalScore;

    public Grade(int id, String createdDate, String updatedDate,
                 String schoolName, String address,
                 String departmentName, String deptCode,
                 String teacherName, String qualification,
                 String studentName, String registrationNumber,
                 String courseName, int creditHours,
                 String semester, String enrollmentDate,
                 double testScore, double examScore) throws DataException {

        super(id, createdDate, updatedDate, schoolName, address,
              departmentName, deptCode, teacherName, qualification,
              studentName, registrationNumber,
              courseName, creditHours, semester, enrollmentDate,
              testScore, examScore);

        this.totalScore = testScore + examScore;
    }

    public double getTotalScore() { return totalScore; }
}
