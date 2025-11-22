package Orl27281.q5;

import java.util.Scanner;

public class Main {
    private static final String STUDENT_ID = "27281";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=== Company ===");
            System.out.print("Company name: ");
            String companyName = sc.nextLine();
            if (companyName.trim().isEmpty()) throw new DataException("Company name required");

            System.out.print("Address: ");
            String address = sc.nextLine();
            if (address.trim().isEmpty()) throw new DataException("Address required");

            System.out.print("Phone (10 digits): ");
            String phone = sc.nextLine();
            if (phone.length() != 10 || !phone.matches("\\d+")) throw new DataException("Invalid phone");

            System.out.println("=== Branch ===");
            System.out.print("Branch name: ");
            String branchName = sc.nextLine();
            if (branchName.trim().isEmpty()) throw new DataException("Branch name required");

            System.out.print("Location code (≥3 chars): ");
            String locationCode = sc.nextLine();
            if (locationCode.length() < 3) throw new DataException("Invalid location code");

            System.out.println("=== Vehicle ===");
            System.out.print("Vehicle type: ");
            String vehicleType = sc.nextLine();
            if (vehicleType.trim().isEmpty()) throw new DataException("Vehicle type required");

            System.out.print("Registration number: ");
            String registrationNumber = sc.nextLine();
            if (registrationNumber.trim().isEmpty()) throw new DataException("Registration required");

            System.out.print("Daily rate (>0): ");
            double dailyRate = Double.parseDouble(sc.nextLine());
            if (dailyRate <= 0) throw new DataException("Daily rate must be > 0");

            System.out.println("=== Customer ===");
            System.out.print("Customer name: ");
            String customerName = sc.nextLine();
            if (customerName.trim().isEmpty()) throw new DataException("Customer name required");

            System.out.print("License number: ");
            String license = sc.nextLine();
            if (license.trim().isEmpty()) throw new DataException("License required");

            System.out.print("Contact number: ");
            String contact = sc.nextLine();
            if (contact.trim().isEmpty()) throw new DataException("Contact required");

            System.out.println("=== Rental ===");
            System.out.print("Rental date: ");
            String rentalDate = sc.nextLine();
            if (rentalDate.trim().isEmpty()) throw new DataException("Rental date required");

            System.out.print("Return date: ");
            String returnDate = sc.nextLine();
            if (returnDate.trim().isEmpty()) throw new DataException("Return date required");

            System.out.print("Rental days (>0): ");
            int rentalDays = Integer.parseInt(sc.nextLine());
            if (rentalDays <= 0) throw new DataException("Rental days must be > 0");

            System.out.println("=== Charges ===");
            System.out.print("Rental charge (≥0): ");
            double rentCharge = Double.parseDouble(sc.nextLine());
            if (rentCharge < 0) throw new DataException("Invalid rental charge");

            System.out.print("Penalty charge (≥0): ");
            double penalty = Double.parseDouble(sc.nextLine());
            if (penalty < 0) throw new DataException("Invalid penalty");

            System.out.println("=== Payment ===");
            System.out.print("Payment mode: ");
            String payMode = sc.nextLine();
            if (payMode.trim().isEmpty()) throw new DataException("Payment mode required");

            System.out.print("Transaction ID: ");
            String tid = sc.nextLine();
            if (tid.trim().isEmpty()) throw new DataException("Transaction ID required");

            RentalRecord record = new RentalRecord(
                    1, "2025-01-01", "2025-01-02",
                    companyName, address, phone,
                    branchName, locationCode,
                    vehicleType, registrationNumber, dailyRate,
                    customerName, license, contact,
                    rentalDate, returnDate, rentalDays,
                    rentCharge, penalty,
                    payMode, tid
            );

            double total = record.calculateTotalCharge();

            System.out.println("\n--- Rental Summary ---");
            System.out.println("Customer: " + customerName);
            System.out.println("Vehicle: " + vehicleType + " (" + registrationNumber + ")");
            System.out.println(String.format("Total Charge: %.2f %s", total, STUDENT_ID));

        } catch (DataException de) {
            System.out.println("Validation error: " + de.getMessage() + " " + STUDENT_ID);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid numeric input. " + STUDENT_ID);
        } finally {
            sc.close();
        }
    }
}
