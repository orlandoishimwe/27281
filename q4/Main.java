package Orl27281.q4;

import java.util.Scanner;

public class Main {
    private static final String STUDENT_ID = "27281";

    private static void validate(boolean ok, String msg) throws DataException {
        if (!ok) throw new DataException(msg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("=== Hotel Details ===");
            System.out.print("Hotel name: "); 
            String hotelName = sc.nextLine();
            validate(!hotelName.isEmpty(), "Hotel name required");

            System.out.print("Address: "); 
            String address = sc.nextLine();
            validate(!address.isEmpty(), "Address required");

            System.out.print("Phone (10 digits): "); 
            String phone = sc.nextLine();
            validate(phone.matches("\\d{10}"), "Invalid phone");

            System.out.print("Email: "); 
            String email = sc.nextLine();
            validate(email.contains("@"), "Invalid email");

            System.out.println("=== Room ===");
            System.out.print("Room number: "); 
            String roomNumber = sc.nextLine();
            validate(!roomNumber.isEmpty(), "Room number required");

            System.out.print("Room type: "); 
            String roomType = sc.nextLine();
            validate(!roomType.isEmpty(), "Room type required");

            System.out.print("Price per night (>0): "); 
            double pricePerNight = Double.parseDouble(sc.nextLine());
            validate(pricePerNight > 0, "Invalid price per night");

            System.out.println("=== Customer ===");
            System.out.print("Customer name: "); 
            String customerName = sc.nextLine();
            validate(!customerName.isEmpty(), "Customer name required");

            System.out.print("Customer email: "); 
            String customerEmail = sc.nextLine();
            validate(customerEmail.contains("@"), "Invalid customer email");

            System.out.print("Contact number (10 digits): "); 
            String contact = sc.nextLine();
            validate(contact.matches("\\d{10}"), "Invalid contact number");

            System.out.println("=== Booking ===");
            System.out.print("Booking date: "); 
            String bookingDate = sc.nextLine();
            validate(!bookingDate.isEmpty(), "Booking date required");

            System.out.print("Check-in date: "); 
            String checkIn = sc.nextLine();
            validate(!checkIn.isEmpty(), "Check-in date required");

            System.out.print("Check-out date: "); 
            String checkOut = sc.nextLine();
            validate(!checkOut.isEmpty(), "Check-out date required");

            System.out.println("=== Service ===");
            System.out.print("Service name: "); 
            String serviceName = sc.nextLine();
            validate(!serviceName.isEmpty(), "Service name required");

            System.out.print("Service cost (>0): "); 
            double serviceCost = Double.parseDouble(sc.nextLine());
            validate(serviceCost > 0, "Invalid service cost");

            System.out.println("=== Payment ===");
            System.out.print("Payment method: "); 
            String paymentMethod = sc.nextLine();
            validate(!paymentMethod.isEmpty(), "Payment method required");

            System.out.print("Payment date: "); 
            String paymentDate = sc.nextLine();
            validate(!paymentDate.isEmpty(), "Payment date required");

            System.out.println("=== Billing ===");
            System.out.print("Room charge (>0): "); 
            double roomCharge = Double.parseDouble(sc.nextLine());
            validate(roomCharge > 0, "Invalid room charge");

            System.out.print("Service charge (≥0): "); 
            double serviceCharge = Double.parseDouble(sc.nextLine());
            validate(serviceCharge >= 0, "Invalid service charge");

            System.out.println("=== Feedback ===");
            System.out.print("Rating (1-5): "); 
            int rating = Integer.parseInt(sc.nextLine());
            validate(rating >= 1 && rating <= 5, "Invalid rating");

            System.out.print("Comments: "); 
            String comments = sc.nextLine();
            validate(!comments.isEmpty(), "Comments required");

            ReservationRecord rr = new ReservationRecord(
                1, "2025-01-01", "2025-01-02",
                hotelName, address, phone, email,
                roomNumber, roomType, pricePerNight,
                customerName, customerEmail, contact,
                bookingDate, checkIn, checkOut,
                serviceName, serviceCost,
                paymentMethod, paymentDate,
                roomCharge, serviceCharge,
                rating, comments
            );

            double total = rr.generateBill();

            System.out.println("\n--- Reservation Summary ---");
            System.out.println("Customer: " + rr.getCustomerName());
            System.out.println("Room: " + rr.getRoomNumber() + " (" + roomType + ")");
            System.out.println(String.format("Total Bill: %.2f %s", total, STUDENT_ID));

        } catch (DataException de) {
            System.out.println("Validation error: " + de.getMessage() + " " + STUDENT_ID);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid numeric input. " + STUDENT_ID);
        } finally {
            sc.close();
        }
    }
}