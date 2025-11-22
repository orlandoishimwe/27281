package Orl27281.q7;

public class Assessment extends Enrollment {
    private double testScore;
    private double examScore;

    public Assessment(int id, String createdDate, String updatedDate,
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
              courseName, creditHours, semester, enrollmentDate);

        if (testScore < 0 || testScore > 40) throw new DataException("Test score must be 0–40");
        if (examScore < 0 || examScore > 60) throw new DataException("Exam score must be 0–60");

        this.testScore = testScore;
        this.examScore = examScore;
    }

    public double getTestScore() { return testScore; }
    public double getExamScore() { return examScore; }
}