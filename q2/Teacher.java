package Orl27281.q2;

public class Teacher extends Department {
    private String teacherName;
    private String subject;
    private String teacherEmail;
    private String phone;

    public Teacher(int id, String createdDate, String updatedDate,
                   String schoolName, String address, String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String teacherName, String subject, String teacherEmail, String phone) throws DataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, departmentName, departmentCode);
        if (subject == null || subject.isEmpty()) throw new DataException("Subject required");
        if (teacherEmail == null || !teacherEmail.contains("@")) throw new DataException("Invalid teacher email");
        if (phone == null || phone.length() != 10) throw new DataException("Teacher phone must be 10 digits");
        this.teacherName = teacherName;
        this.subject = subject;
        this.teacherEmail = teacherEmail;
        this.phone = phone;
    }

    public String getTeacherName() { return teacherName; }
    public String getSubject() { return subject; }
}
