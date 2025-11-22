package Orl27281.q1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            String pname;
            while (true) {
                System.out.println("Enter Patient name:");
                pname = sc.nextLine();
                if (pname.matches("[A-Za-z ]+")) break;
                System.out.println("Invalid name. Only letters allowed.");
            }

            String hname;
            while (true) {
                System.out.println("Enter Hospital Name:");
                hname = sc.nextLine();
                if (hname.matches("[A-Za-z0-9 ]+")) break;
                System.out.println("Invalid hospital name.");
            }

            String nname;
            while (true) {
                System.out.println("Enter Nurse Name:");
                nname = sc.nextLine();
                if (nname.matches("[A-Za-z ]+")) break;
                System.out.println("Invalid name. Only letters allowed.");
            }

            double room;
            while (true) {
                try {
                    System.out.print("Enter Room Charges: ");
                    room = Double.parseDouble(sc.nextLine());
                    if (room >= 0) break;
                    System.out.println("Room charges must be >= 0.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number.");
                }
            }

            double treat;
            while (true) {
                try {
                    System.out.print("Enter Treatment Cost: ");
                    treat = Double.parseDouble(sc.nextLine());
                    if (treat >= 0) break;
                    System.out.println("Cost must be >= 0.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number.");
                }
            }

            double doc;
            while (true) {
                try {
                    System.out.print("Enter Doctor Fee: ");
                    doc = Double.parseDouble(sc.nextLine());
                    if (doc >= 0) break;
                    System.out.println("Fee must be >= 0.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number.");
                }
            }

            double med;
            while (true) {
                try {
                    System.out.print("Enter Medicine Cost: ");
                    med = Double.parseDouble(sc.nextLine());
                    if (med >= 0) break;
                    System.out.println("Cost must be >= 0.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number.");
                }
            }


            HospitalRecord hr = new HospitalRecord(
                    1, "2025-01-01", "2025-01-02",
                    hname, "Kigali", "0780000000", "hospital@gmail.com",
                    "General", "GEN123",
                    "Dr John", "Surgeon", "doc@mail.com", "0781111111",
                    nname, "Day", 5,
                    pname, 30, "Male", "0782222222",
                    "2025-01-05", "A12", room,
                    "Flu", "Medication", treat,
                    doc, med
            );

            System.out.println("Patient Name: " + hr.getPatientName());
            System.out.println("Hospital Name: " + hr.getHospitalName());
            System.out.println("Nurse Name: " + hr.getNurseName());

            double total = hr.generateBill();
            System.out.println("Total Bill = " + total + " — ID: 27281");

        } catch (DataException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
