package Orl27281.q3;

public class Salary extends Deduction {
    private double basicSalary;
    private double grossSalary;
    private double netSalary;

    public Salary(int id, String createdDate, String updatedDate,
                  String companyName, String address, String phoneNumber, String email,
                  String departmentName, String departmentCode,
                  String managerName, String managerEmail, String managerPhone,
                  String employeeName, int employeeId, String designation, String contactNumber,
                  int totalDays, int presentDays, int leaveDays,
                  double housingAllowance, double transportAllowance,
                  double taxDeduction, double loanDeduction,
                  double basicSalary) throws DataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
              departmentName, departmentCode, managerName, managerEmail, managerPhone,
              employeeName, employeeId, designation, contactNumber, totalDays, presentDays, leaveDays,
              housingAllowance, transportAllowance, taxDeduction, loanDeduction);
        if (basicSalary <= 0) throw new DataException("Basic salary must be > 0");
        this.basicSalary = basicSalary;
        this.grossSalary = basicSalary + totalAllowances();
        this.netSalary = this.grossSalary - totalDeductions();
        if (grossSalary <= 0 || netSalary <= 0) throw new DataException("Computed salaries must be > 0");
    }

    public double getBasicSalary() { return basicSalary; }
    public double getGrossSalary() { return grossSalary; }
    public double getNetSalary() { return netSalary; }
}
