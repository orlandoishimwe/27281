package Orl27281.q3;

import java.util.Scanner;

public class Main {
    private static final String STUDENT_ID = "27281";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("=== Company Details ===");

            System.out.print("Company name: ");
            String companyName = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            String phone;
            while (true) {
                System.out.print("Phone (10 digits): ");
                phone = sc.nextLine();
                if (phone.matches("\\d{10}")) break;
                System.out.println("Invalid phone number. Must be exactly 10 digits.");
            }

            String email;
            while (true) {
                System.out.print("Email: ");
                email = sc.nextLine();
                if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) break;
                System.out.println("Invalid email format.");
            }

            System.out.println("=== Department ===");

            System.out.print("Department name: ");
            String deptName = sc.nextLine();

            String deptCode;
            while (true) {
                System.out.print("Department code (≥3 chars): ");
                deptCode = sc.nextLine();
                if (deptCode.length() >= 3) break;
                System.out.println("Department code must be at least 3 characters.");
            }

            System.out.println("=== Manager ===");

            System.out.print("Manager name: ");
            String managerName = sc.nextLine();

            String managerEmail;
            while (true) {
                System.out.print("Manager email: ");
                managerEmail = sc.nextLine();
                if (managerEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) break;
                System.out.println("Invalid email format.");
            }

            String managerPhone;
            while (true) {
                System.out.print("Manager phone (10 digits): ");
                managerPhone = sc.nextLine();
                if (managerPhone.matches("\\d{10}")) break;
                System.out.println("Invalid phone number. Must be exactly 10 digits.");
            }

            System.out.println("=== Employee ===");

            System.out.print("Employee name: ");
            String employeeName = sc.nextLine();

            int employeeId;
            while (true) {
                try {
                    System.out.print("Employee ID (>0): ");
                    employeeId = Integer.parseInt(sc.nextLine());
                    if (employeeId > 0) break;
                    System.out.println("Employee ID must be greater than 0.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number. Try again.");
                }
            }

            System.out.print("Designation: ");
            String designation = sc.nextLine();

            String contact;
            while (true) {
                System.out.print("Contact number (10 digits): ");
                contact = sc.nextLine();
                if (contact.matches("\\d{10}")) break;
                System.out.println("Invalid phone number. Must be exactly 10 digits.");
            }

            System.out.println("=== Attendance ===");

            int totalDays, presentDays, leaveDays;

            while (true) {
                try {
                    System.out.print("Total days (>=0): ");
                    totalDays = Integer.parseInt(sc.nextLine());
                    if (totalDays >= 0) break;
                    System.out.println("Total days must be >= 0.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number. Try again.");
                }
            }

            while (true) {
                try {
                    System.out.print("Present days (>=0, ≤ totalDays): ");
                    presentDays = Integer.parseInt(sc.nextLine());
                    if (presentDays >= 0 && presentDays <= totalDays) break;
                    System.out.println("Present days must be between 0 and totalDays.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number. Try again.");
                }
            }

            while (true) {
                try {
                    System.out.print("Leave days (>=0): ");
                    leaveDays = Integer.parseInt(sc.nextLine());
                    if (leaveDays >= 0) break;
                    System.out.println("Leave days must be >= 0.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number. Try again.");
                }
            }

            System.out.println("=== Allowances ===");

            double housing, transport;

            while (true) {
                try {
                    System.out.print("Housing allowance (≥0): ");
                    housing = Double.parseDouble(sc.nextLine());
                    if (housing >= 0) break;
                    System.out.println("Housing allowance must be >= 0.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number. Try again.");
                }
            }

            while (true) {
                try {
                    System.out.print("Transport allowance (≥0): ");
                    transport = Double.parseDouble(sc.nextLine());
                    if (transport >= 0) break;
                    System.out.println("Transport allowance must be >= 0.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number. Try again.");
                }
            }

            System.out.println("=== Deductions ===");

            double tax, loan;

            while (true) {
                try {
                    System.out.print("Tax deduction (≥0): ");
                    tax = Double.parseDouble(sc.nextLine());
                    if (tax >= 0) break;
                    System.out.println("Tax deduction must be >= 0.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number. Try again.");
                }
            }

            while (true) {
                try {
                    System.out.print("Loan deduction (≥0): ");
                    loan = Double.parseDouble(sc.nextLine());
                    if (loan >= 0) break;
                    System.out.println("Loan deduction must be >= 0.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number. Try again.");
                }
            }

            System.out.println("=== Salary ===");

            double basic;
            while (true) {
                try {
                    System.out.print("Basic salary (>0): ");
                    basic = Double.parseDouble(sc.nextLine());
                    if (basic > 0) break;
                    System.out.println("Basic salary must be greater than 0.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number. Try again.");
                }
            }

            PayrollRecord pr = new PayrollRecord(
                    1, "2025-01-01", "2025-01-02",
                    companyName, address, phone, email,
                    deptName, deptCode,
                    managerName, managerEmail, managerPhone,
                    employeeName, employeeId, designation, contact,
                    totalDays, presentDays, leaveDays,
                    housing, transport,
                    tax, loan,
                    basic
            );

            double net = pr.calculateNetSalary();
            System.out.println("\n--- Payroll Summary ---");
            System.out.println("Employee: " + pr.getEmployeeName());
            System.out.println("Employee ID: " + pr.getEmployeeId());
            System.out.println(String.format("Basic Salary: %.2f", pr.getBasicSalary()));
            System.out.println(String.format("Total Allowances: %.2f", pr.totalAllowances()));
            System.out.println(String.format("Total Deductions: %.2f", pr.totalDeductions()));
            System.out.println(String.format("Net Salary: %.2f %s", net, STUDENT_ID));

        } catch (DataException de) {
            System.out.println("Validation error: " + de.getMessage() + " " + STUDENT_ID);
        } finally {
            sc.close();
        }
    }
}
