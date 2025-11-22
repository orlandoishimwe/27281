package Orl27281.q10;

import java.util.Scanner;

public class Main {
    private static final String STUDENT_ID = "27281";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=== Store ===");
            System.out.print("Store name: ");
            String storeName = sc.nextLine();
            if (storeName.trim().isEmpty()) throw new DataException("Store name required");

            System.out.print("Location: ");
            String location = sc.nextLine();
            if (location.trim().isEmpty()) throw new DataException("Location required");

            System.out.println("=== Category ===");
            System.out.print("Category name: ");
            String catName = sc.nextLine();
            if (catName.trim().isEmpty()) throw new DataException("Category name required");

            System.out.print("Category code (≥3 chars): ");
            String catCode = sc.nextLine();
            if (catCode.length() < 3) throw new DataException("Category code too short");

            System.out.println("=== Product ===");
            System.out.print("Product name: ");
            String pname = sc.nextLine();
            if (pname.trim().isEmpty()) throw new DataException("Product name required");

            System.out.print("Price (>0): ");
            double price = Double.parseDouble(sc.nextLine());
            if (price <= 0) throw new DataException("Invalid price");

            System.out.print("SKU: ");
            String sku = sc.nextLine();
            if (sku.trim().isEmpty()) throw new DataException("SKU required");

            System.out.println("=== Customer ===");
            System.out.print("Customer name: ");
            String cname = sc.nextLine();
            if (cname.trim().isEmpty()) throw new DataException("Customer name required");

            System.out.print("Email: ");
            String email = sc.nextLine();
            if (!email.matches("^[\\w-.]+@[\\w-]+\\.[a-zA-Z]{2,}$")) throw new DataException("Invalid email");

            System.out.print("Phone (10 digits): ");
            String phone = sc.nextLine();
            if (!phone.matches("\\d{10}")) throw new DataException("Phone must be 10 digits");

            System.out.println("=== Cart ===");
            System.out.print("Quantity (>0): ");
            int qty = Integer.parseInt(sc.nextLine());
            if (qty <= 0) throw new DataException("Quantity must be > 0");

            System.out.println("=== Order ===");
            System.out.print("Order number: ");
            String orderNum = sc.nextLine();
            if (orderNum.trim().isEmpty()) throw new DataException("Order number required");

            System.out.print("Order date: ");
            String orderDate = sc.nextLine();
            if (orderDate.trim().isEmpty()) throw new DataException("Order date required");

            System.out.println("=== Shipping ===");
            System.out.print("Shipping address: ");
            String shipAddr = sc.nextLine();
            if (shipAddr.trim().isEmpty()) throw new DataException("Shipping address required");

            System.out.print("Shipping fee (≥0): ");
            double shipFee = Double.parseDouble(sc.nextLine());
            if (shipFee < 0) throw new DataException("Invalid shipping fee");

            System.out.println("=== Payment ===");
            System.out.print("Payment mode: ");
            String payMode = sc.nextLine();
            if (payMode.trim().isEmpty()) throw new DataException("Payment mode required");

            System.out.print("Transaction ID: ");
            String tid = sc.nextLine();
            if (tid.trim().isEmpty()) throw new DataException("Transaction ID required");

            double tempTotal = (price * qty) + shipFee;

            OrderRecord or = new OrderRecord(
                    1, "2025-01-01", "2025-01-02",
                    storeName, location,
                    catName, catCode,
                    pname, price, sku,
                    cname, email, phone,
                    qty, orderNum, orderDate,
                    shipAddr, shipFee,
                    payMode, tid,
                    tempTotal
            );

            double finalTotal = or.calculateTotal();

            System.out.println("\n--- ORDER SUMMARY ---");
            System.out.println("Customer: " + or.getCustomerName());
            System.out.println("Product: " + or.getProductName());
            System.out.println(String.format("Total Amount: %.2f %s", finalTotal, STUDENT_ID));

        } catch (DataException de) {
            System.out.println("Validation error: " + de.getMessage() + " " + STUDENT_ID);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid numeric input. " + STUDENT_ID);
        } finally {
            sc.close();
        }
    }
}
