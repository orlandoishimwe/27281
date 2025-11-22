package Orl27281.q6;

import java.util.Scanner;

public class Main {
    private static final String STUDENT_ID = "27281";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("=== Bank Details ===");

            System.out.print("Bank name: ");
            String bankName = sc.nextLine();
            if (bankName.trim().isEmpty()) throw new DataException("Bank name required");

            System.out.print("Branch code (≥3 chars): ");
            String branchCode = sc.nextLine();
            if (branchCode.length() < 3) throw new DataException("Invalid branch code");

            System.out.print("Address: ");
            String address = sc.nextLine();
            if (address.trim().isEmpty()) throw new DataException("Address required");

            System.out.println("=== Account ===");

            System.out.print("Account number: ");
            String acctNum = sc.nextLine();
            if (acctNum.trim().isEmpty()) throw new DataException("Account number required");

            System.out.print("Account type: ");
            String acctType = sc.nextLine();
            if (acctType.trim().isEmpty()) throw new DataException("Account type required");

            System.out.print("Initial balance (≥0): ");
            double balance = Double.parseDouble(sc.nextLine());
            if (balance < 0) throw new DataException("Invalid initial balance");

            System.out.println("=== Customer ===");

            System.out.print("Customer name: ");
            String custName = sc.nextLine();
            if (custName.trim().isEmpty()) throw new DataException("Customer name required");

            System.out.print("Email: ");
            String email = sc.nextLine();
            if (!email.contains("@")) throw new DataException("Invalid email");

            System.out.print("Phone (10 digits): ");
            String phone = sc.nextLine();
            if (phone.length() != 10 || !phone.matches("\\d+")) throw new DataException("Invalid phone");

            System.out.println("=== Transaction (metadata) ===");

            System.out.print("Transaction ID: ");
            String tid = sc.nextLine();
            if (tid.trim().isEmpty()) throw new DataException("Transaction ID required");

            System.out.print("Transaction type: ");
            String ttype = sc.nextLine();
            if (ttype.trim().isEmpty()) throw new DataException("Transaction type required");

            System.out.print("Transaction amount (>0): ");
            double tamount = Double.parseDouble(sc.nextLine());
            if (tamount <= 0) throw new DataException("Invalid transaction amount");

            System.out.println("=== Deposit ===");

            System.out.print("Deposit amount (>0): ");
            double depositAmt = Double.parseDouble(sc.nextLine());
            if (depositAmt <= 0) throw new DataException("Invalid deposit amount");

            System.out.print("Deposit date: ");
            String depositDate = sc.nextLine();
            if (depositDate.trim().isEmpty()) throw new DataException("Deposit date required");

            System.out.println("=== Withdrawal ===");

            System.out.print("Withdrawal amount (>0): ");
            double withdrawalAmt = Double.parseDouble(sc.nextLine());
            if (withdrawalAmt <= 0) throw new DataException("Invalid withdrawal amount");

            System.out.print("Withdrawal date: ");
            String withdrawalDate = sc.nextLine();
            if (withdrawalDate.trim().isEmpty()) throw new DataException("Withdrawal date required");

            System.out.println("=== Loan ===");

            System.out.print("Loan amount (>0): ");
            double loanAmount = Double.parseDouble(sc.nextLine());
            if (loanAmount <= 0) throw new DataException("Invalid loan amount");

            System.out.print("Interest rate (percent per year, >0): ");
            double interestRate = Double.parseDouble(sc.nextLine());
            if (interestRate <= 0) throw new DataException("Invalid interest rate");

            System.out.print("Duration (years, >0): ");
            int duration = Integer.parseInt(sc.nextLine());
            if (duration <= 0) throw new DataException("Invalid duration");

            System.out.println("=== Loan Payment ===");

            System.out.print("Payment amount (>0): ");
            double paymentAmount = Double.parseDouble(sc.nextLine());
            if (paymentAmount <= 0) throw new DataException("Invalid payment amount");

            System.out.print("Payment date: ");
            String paymentDate = sc.nextLine();
            if (paymentDate.trim().isEmpty()) throw new DataException("Payment date required");

            AccountRecord ar = new AccountRecord(
                    1, "2025-01-01", "2025-01-02",
                    bankName, branchCode, address,
                    acctNum, acctType, balance,
                    custName, email, phone,
                    tid, ttype, tamount,
                    depositAmt, depositDate,
                    withdrawalAmt, withdrawalDate,
                    loanAmount, interestRate, duration,
                    paymentAmount, paymentDate
            );

            double interest = ar.calculateInterest();

            System.out.println("\n--- Account Summary ---");
            System.out.println("Customer: " + ar.getCustomerName());
            System.out.println("Account: " + ar.getAccountNumber() + " (" + ar.getAccountType() + ")");
            System.out.println(String.format("Current Balance: %.2f", ar.getBalance()));
            System.out.println(String.format("Loan Amount: %.2f", ar.getLoanAmount()));
            System.out.println(String.format("Calculated Interest over %d years: %.2f %s",
                    ar.getDuration(), interest, STUDENT_ID));

        } catch (DataException de) {
            System.out.println("Validation error: " + de.getMessage() + " " + STUDENT_ID);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid numeric input. " + STUDENT_ID);
        } finally {
            sc.close();
        }
    }
}
