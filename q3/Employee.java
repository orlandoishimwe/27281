package Orl27281.q3;

public class Employee extends Manager {
    private String employeeName;
    private int employeeId;
    private String designation;
    private String contactNumber;

    public Employee(int id, String createdDate, String updatedDate,
                    String companyName, String address, String phoneNumber, String email,
                    String departmentName, String departmentCode,
                    String managerName, String managerEmail, String managerPhone,
                    String employeeName, int employeeId, String designation, String contactNumber) throws DataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
              departmentName, departmentCode, managerName, managerEmail, managerPhone);
        if (employeeId <= 0) throw new DataException("Employee ID must be > 0");
        if (contactNumber == null || contactNumber.length() != 10) throw new DataException("Contact must be 10 digits");
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.designation = designation;
        this.contactNumber = contactNumber;
    }

    public String getEmployeeName() { return employeeName; }
    public int getEmployeeId() { return employeeId; }
}
