package Orl27281.q8;

import java.util.Scanner;

public class Main {
    private static final String STUDENT_ID = "27281"; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=== Library Details ===");
            System.out.print("Library name: ");
            String libName = sc.nextLine();
            if (libName.trim().isEmpty()) throw new DataException("Library name required");

            System.out.print("Location: ");
            String location = sc.nextLine();
            if (location.trim().isEmpty()) throw new DataException("Location required");

            System.out.print("Phone (10 digits): ");
            String phone = sc.nextLine();
            if (phone.length() != 10 || !phone.matches("\\d+")) throw new DataException("Invalid phone");

            System.out.println("=== Section ===");
            System.out.print("Section name: ");
            String sectionName = sc.nextLine();
            if (sectionName.trim().isEmpty()) throw new DataException("Section name required");

            System.out.print("Section code (≥3 chars): ");
            String sectionCode = sc.nextLine();
            if (sectionCode.length() < 3) throw new DataException("Invalid section code");

            System.out.println("=== Book ===");
            System.out.print("Title: ");
            String title = sc.nextLine();
            if (title.trim().isEmpty()) throw new DataException("Book title required");

            System.out.print("Author: ");
            String author = sc.nextLine();
            if (author.trim().isEmpty()) throw new DataException("Author required");

            System.out.print("ISBN (≥10 chars): ");
            String isbn = sc.nextLine();
            if (isbn.length() < 10) throw new DataException("Invalid ISBN");

            System.out.println("=== Member ===");
            System.out.print("Member name: ");
            String memberName = sc.nextLine();
            if (memberName.trim().isEmpty()) throw new DataException("Member name required");

            System.out.print("Member ID (>0): ");
            int memberId = Integer.parseInt(sc.nextLine());
            if (memberId <= 0) throw new DataException("Invalid member ID");

            System.out.print("Contact number (10 digits): ");
            String contact = sc.nextLine();
            if (contact.length() != 10 || !contact.matches("\\d+")) throw new DataException("Invalid contact");

            System.out.println("=== Borrow ===");
            System.out.print("Borrow date: ");
            String borrowDate = sc.nextLine();
            if (borrowDate.trim().isEmpty()) throw new DataException("Borrow date required");

            System.out.print("Return date: ");
            String returnDate = sc.nextLine();
            if (returnDate.trim().isEmpty()) throw new DataException("Return date required");

            System.out.println("=== Fine ===");
            System.out.print("Fine amount (≥0): ");
            double fineAmount = Double.parseDouble(sc.nextLine());
            if (fineAmount < 0) throw new DataException("Invalid fine amount");

            System.out.print("Days late (≥0): ");
            int daysLate = Integer.parseInt(sc.nextLine());
            if (daysLate < 0) throw new DataException("Invalid days late");

            System.out.println("=== Payment ===");
            System.out.print("Payment date: ");
            String paymentDate = sc.nextLine();
            if (paymentDate.trim().isEmpty()) throw new DataException("Payment date required");

            System.out.print("Payment mode: ");
            String paymentMode = sc.nextLine();
            if (paymentMode.trim().isEmpty()) throw new DataException("Payment mode required");

            double totalFineProvided = fineAmount * daysLate;
            if (totalFineProvided <= 0) {
                System.out.println("Total fine computed is 0 — provide non-zero fine or daysLate. " + STUDENT_ID);
                sc.close();
                return;
            }

            LibraryRecord lr = new LibraryRecord(
                    1, "2025-01-01", "2025-01-02",
                    libName, location, phone,
                    sectionName, sectionCode,
                    title, author, isbn,
                    memberName, memberId, contact,
                    borrowDate, returnDate,
                    fineAmount, daysLate,
                    paymentDate, paymentMode,
                    totalFineProvided
            );

            double calc = lr.calculateFine();

            System.out.println("\n--- Library Fine Summary ---");
            System.out.println("Member: " + lr.getMemberName());
            System.out.println("Book: " + lr.getTitle() + " (ISBN: " + lr.getISBN() + ")");
            System.out.println(String.format("Calculated Fine: %.2f %s", calc, STUDENT_ID));

        } catch (DataException de) {
            System.out.println("Validation error: " + de.getMessage() + " " + STUDENT_ID);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid numeric input. " + STUDENT_ID);
        } finally {
            sc.close();
        }
    }
}
