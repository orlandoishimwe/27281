package Orl27281.q7;

public final class Transcript extends Grade {

    public Transcript(int id, String createdDate, String updatedDate,
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
    }

    public String calculateGrade() {
        double score = getTotalScore();
        if (score >= 80) return "A";
        if (score >= 70) return "B";
        if (score >= 60) return "C";
        if (score >= 50) return "D";
        return "F";
    }
}
