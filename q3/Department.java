package Orl27281.q3;

public class Department extends Company {
    private String departmentName;
    private String departmentCode;

    public Department(int id, String createdDate, String updatedDate,
                      String companyName, String address, String phoneNumber, String email,
                      String departmentName, String departmentCode) throws DataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email);
        if (departmentCode == null || departmentCode.length() < 3) throw new DataException("Department code must be ≥ 3 chars");
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() { return departmentName; }
    public String getDepartmentCode() { return departmentCode; }
}
