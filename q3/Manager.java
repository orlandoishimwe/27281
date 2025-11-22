package Orl27281.q3;

public class Manager extends Department {
    private String managerName;
    private String managerEmail;
    private String phone;

    public Manager(int id, String createdDate, String updatedDate,
                   String companyName, String address, String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String managerName, String managerEmail, String phone) throws DataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode);
        if (managerName == null || managerName.isEmpty()) throw new DataException("Manager name required");
        if (managerEmail == null || !managerEmail.contains("@")) throw new DataException("Invalid manager email");
        if (phone == null || phone.length() != 10) throw new DataException("Manager phone must be 10 digits");
        this.managerName = managerName;
        this.managerEmail = managerEmail;
        this.phone = phone;
    }

    public String getManagerName() { return managerName; }
}
