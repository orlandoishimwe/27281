package Orl27281.q7;

public class Teacher extends Department {
    private String teacherName;
    private String qualification;

    public Teacher(int id, String createdDate, String updatedDate,
                   String schoolName, String address,
                   String departmentName, String deptCode,
                   String teacherName, String qualification) throws DataException {
        super(id, createdDate, updatedDate, schoolName, address, departmentName, deptCode);

        this.teacherName = teacherName;
        this.qualification = qualification;
    }

    public String getTeacherName() { return teacherName; }
}
