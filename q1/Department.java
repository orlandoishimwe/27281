package Orl27281.q1;

public class Department extends Hospital {
    private String departmentName;
    private String departmentCode;

    public Department(int id, String createdDate, String updatedDate,
                      String hospitalName, String address, String phone, String email,
                      String departmentName, String departmentCode)
            throws DataException {

        super(id, createdDate, updatedDate, hospitalName, address, phone, email);

        if (departmentCode.length() < 3) throw new DataException("Department code must be ≥ 3 characters");

        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }
}
