package Orl27281.q2;

import java.util.Scanner;

public class Main {

    private static final String STUDENT_ID = "27281";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            String schoolName;
            System.out.println("=== Enter School Details ===");
            while (true) {
                System.out.print("School name: ");
                schoolName = sc.nextLine();
                if (schoolName.matches("[A-Za-z0-9 .]+")) break;
                System.out.println("Invalid school name.");
            }

            System.out.print("Address: ");
            String address = sc.nextLine();

            String phone;
            while (true) {
                System.out.print("Phone (10 digits): ");
                phone = sc.nextLine();
                if (phone.matches("\\d{10}")) break;
                System.out.println("Invalid phone.");
            }

            String email;
            while (true) {
                System.out.print("Email: ");
                email = sc.nextLine();
                if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) break;
                System.out.println("Invalid email.");
            }

            System.out.println("=== Department ===");

            String deptName;
            while (true) {
                System.out.print("Department name: ");
                deptName = sc.nextLine();
                if (deptName.matches("[A-Za-z0-9 ]+")) break;
                System.out.println("Invalid department name.");
            }

            String deptCode;
            while (true) {
                System.out.print("Department code (≥3 chars): ");
                deptCode = sc.nextLine();
                if (deptCode.length() >= 3) break;
                System.out.println("Invalid code.");
            }

            System.out.println("=== Teacher ===");

            String teacherName;
            while (true) {
                System.out.print("Teacher name: ");
                teacherName = sc.nextLine();
                if (teacherName.matches("[A-Za-z ]+")) break;
                System.out.println("Invalid name.");
            }

            System.out.print("Subject: ");
            String subject = sc.nextLine();

            String teacherEmail;
            while (true) {
                System.out.print("Teacher email: ");
                teacherEmail = sc.nextLine();
                if (teacherEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) break;
                System.out.println("Invalid email.");
            }

            String teacherPhone;
            while (true) {
                System.out.print("Teacher phone (10 digits): ");
                teacherPhone = sc.nextLine();
                if (teacherPhone.matches("\\d{10}")) break;
                System.out.println("Invalid phone.");
            }

            System.out.println("=== Student ===");

            String studentName;
            while (true) {
                System.out.print("Student name: ");
                studentName = sc.nextLine();
                if (studentName.matches("[A-Za-z ]+")) break;
                System.out.println("Invalid name.");
            }

            int roll;
            while (true) {
                try {
                    System.out.print("Roll number (>0): ");
                    roll = Integer.parseInt(sc.nextLine());
                    if (roll > 0) break;
                    System.out.println("Invalid roll.");
                } catch (Exception e) {
                    System.out.println("Invalid roll.");
                }
            }

            System.out.print("Grade: ");
            String grade = sc.nextLine();

            String contact;
            while (true) {
                System.out.print("Contact number: ");
                contact = sc.nextLine();
                if (contact.matches("\\d{10}")) break;
                System.out.println("Invalid contact.");
            }

            System.out.println("=== Course ===");

            System.out.print("Course name: ");
            String courseName = sc.nextLine();

            System.out.print("Course code: ");
            String courseCode = sc.nextLine();

            int creditHours;
            while (true) {
                try {
                    System.out.print("Credit hours (>0): ");
                    creditHours = Integer.parseInt(sc.nextLine());
                    if (creditHours > 0) break;
                    System.out.println("Invalid credit hours.");
                } catch (Exception e) {
                    System.out.println("Invalid credit hours.");
                }
            }

            System.out.println("=== Exam & Result ===");

            System.out.print("Exam name: ");
            String examName = sc.nextLine();

            int maxMarks;
            while (true) {
                try {
                    System.out.print("Max marks (>0): ");
                    maxMarks = Integer.parseInt(sc.nextLine());
                    if (maxMarks > 0) break;
                    System.out.println("Invalid marks.");
                } catch (Exception e) {
                    System.out.println("Invalid marks.");
                }
            }

            System.out.print("Exam date: ");
            String examDate = sc.nextLine();

            double obtained;
            while (true) {
                try {
                    System.out.print("Obtained marks (>=0): ");
                    obtained = Double.parseDouble(sc.nextLine());
                    if (obtained >= 0) break;
                    System.out.println("Invalid marks.");
                } catch (Exception e) {
                    System.out.println("Invalid marks.");
                }
            }

            System.out.print("Remarks: ");
            String remarks = sc.nextLine();

            System.out.println("=== Fees ===");

            double tuition;
            while (true) {
                try {
                    System.out.print("Tuition fee (>0): ");
                    tuition = Double.parseDouble(sc.nextLine());
                    if (tuition > 0) break;
                    System.out.println("Invalid fee.");
                } catch (Exception e) {
                    System.out.println("Invalid fee.");
                }
            }

            double examFee;
            while (true) {
                try {
                    System.out.print("Exam fee (>0): ");
                    examFee = Double.parseDouble(sc.nextLine());
                    if (examFee > 0) break;
                    System.out.println("Invalid fee.");
                } catch (Exception e) {
                    System.out.println("Invalid fee.");
                }
            }

            StudentRecord record = new StudentRecord(
                    1, "2025-01-01", "2025-01-02",
                    schoolName, address, phone, email,
                    deptName, deptCode,
                    teacherName, subject, teacherEmail, teacherPhone,
                    studentName, roll, grade, contact,
                    courseName, courseCode, creditHours,
                    examName, maxMarks, examDate,
                    obtained, remarks,
                    tuition, examFee
            );

            double average = record.calculateAverageMarks();
            double totalFee = record.getTotalFee();

            System.out.println("\n--- Student Record Summary ---");
            System.out.println("Student: " + record.getStudentName());
            System.out.println("Roll: " + record.getRollNumber());
            System.out.println("Grade: " + record.getGrade());
            System.out.println(String.format("Average Marks: %.2f%%", average));
            System.out.println(String.format("Total Fee: %.2f", totalFee) + " " + STUDENT_ID);

        } catch (DataException de) {
            System.out.println("Validation error: " + de.getMessage() + " stu123456");
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid number input. stu123456");
        } finally {
            sc.close();
        }
    }
}
