package Orl27281.q7;

public class Department extends School {
    private String departmentName;
    private String deptCode;

    public Department(int id, String createdDate, String updatedDate,
                      String schoolName, String address,
                      String departmentName, String deptCode) throws DataException {
        super(id, createdDate, updatedDate, schoolName, address);

        if (deptCode == null || deptCode.length() < 2)
            throw new DataException("Department code must be ≥ 2 characters");

        this.departmentName = departmentName;
        this.deptCode = deptCode;
    }

    public String getDepartmentName() { return departmentName; }
}
