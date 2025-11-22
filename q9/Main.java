package Orl27281.q9;

import java.util.Scanner;

public class Main {
    private static final String STUDENT_ID = "27281";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("=== Airline ===");
            System.out.print("Airline name: ");
            String airlineName = sc.nextLine();
            if (airlineName.trim().isEmpty()) throw new DataException("Airline name required");

            System.out.print("Address: ");
            String address = sc.nextLine();
            if (address.trim().isEmpty()) throw new DataException("Address required");

            System.out.print("Contact email: ");
            String contactEmail = sc.nextLine();
            if (!contactEmail.matches("^[\\w-.]+@[\\w-]+\\.[a-zA-Z]{2,}$")) throw new DataException("Invalid email");

            System.out.println("=== Flight ===");
            System.out.print("Flight number: ");
            String flightNumber = sc.nextLine();
            if (flightNumber.trim().isEmpty()) throw new DataException("Flight number required");

            System.out.print("Destination: ");
            String destination = sc.nextLine();
            if (destination.trim().isEmpty()) throw new DataException("Destination required");

            System.out.print("Departure time: ");
            String departureTime = sc.nextLine();
            if (departureTime.trim().isEmpty()) throw new DataException("Departure time required");

            System.out.println("=== Passenger ===");
            System.out.print("Passenger name: ");
            String passengerName = sc.nextLine();
            if (passengerName.trim().isEmpty()) throw new DataException("Passenger name required");

            System.out.print("Passport number: ");
            String passportNumber = sc.nextLine();
            if (passportNumber.trim().isEmpty()) throw new DataException("Passport number required");

            System.out.print("Nationality: ");
            String nationality = sc.nextLine();
            if (nationality.trim().isEmpty()) throw new DataException("Nationality required");

            System.out.println("=== Seat ===");
            System.out.print("Seat number: ");
            String seatNumber = sc.nextLine();
            if (seatNumber.trim().isEmpty()) throw new DataException("Seat number required");

            System.out.print("Seat type (Economy/Business): ");
            String seatType = sc.nextLine();
            if (!(seatType.equalsIgnoreCase("Economy") || seatType.equalsIgnoreCase("Business"))) throw new DataException("Invalid seat type");

            System.out.println("=== Ticket ===");
            System.out.print("Ticket number: ");
            String ticketNumber = sc.nextLine();
            if (ticketNumber.trim().isEmpty()) throw new DataException("Ticket number required");

            System.out.print("Price (>0): ");
            double price = Double.parseDouble(sc.nextLine());
            if (price <= 0) throw new DataException("Invalid price");

            System.out.println("=== Baggage ===");
            System.out.print("Baggage weight (kg, ≥0): ");
            double baggageWeight = Double.parseDouble(sc.nextLine());
            if (baggageWeight < 0) throw new DataException("Invalid baggage weight");

            System.out.print("Baggage fee (≥0): ");
            double baggageFee = Double.parseDouble(sc.nextLine());
            if (baggageFee < 0) throw new DataException("Invalid baggage fee");

            System.out.println("=== Payment ===");
            System.out.print("Payment date: ");
            String paymentDate = sc.nextLine();
            if (paymentDate.trim().isEmpty()) throw new DataException("Payment date required");

            System.out.print("Payment mode: ");
            String paymentMode = sc.nextLine();
            if (paymentMode.trim().isEmpty()) throw new DataException("Payment mode required");

            TicketRecord tr = new TicketRecord(
                    1, "2025-01-01", "2025-01-02",
                    airlineName, address, contactEmail,
                    flightNumber, destination, departureTime,
                    passengerName, passportNumber, nationality,
                    seatNumber, seatType,
                    ticketNumber, price,
                    baggageWeight, baggageFee,
                    paymentDate, paymentMode
            );

            double invoice = tr.generateInvoice();

            System.out.println("\n--- Ticket Invoice ---");
            System.out.println("Passenger: " + tr.getPassengerName());
            System.out.println("Flight: " + tr.getFlightNumber() + " → " + tr.getDestination());
            System.out.println(String.format("Total Invoice: %.2f %s", invoice, STUDENT_ID));

        } catch (DataException de) {
            System.out.println("Validation error: " + de.getMessage() + " " + STUDENT_ID);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid numeric input. " + STUDENT_ID);
        } finally {
            sc.close();
        }
    }
}
