package Orl27281.q7;

import java.util.Scanner;

public class Main {
    private static final String STUDENT_ID = "27281";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=== School Details ===");
            System.out.print("School name: "); 
            String school = sc.nextLine();
            if (school.trim().isEmpty()) throw new DataException("School name required");

            System.out.print("Address: "); 
            String address = sc.nextLine();
            if (address.trim().isEmpty()) throw new DataException("Address required");

            System.out.println("=== Department ===");
            System.out.print("Department name: "); 
            String dept = sc.nextLine();
            if (dept.trim().isEmpty()) throw new DataException("Department name required");

            System.out.print("Department code (≥2 chars): "); 
            String deptCode = sc.nextLine();
            if (deptCode.length() < 2) throw new DataException("Invalid department code");

            System.out.println("=== Teacher ===");
            System.out.print("Teacher name: "); 
            String tname = sc.nextLine();
            if (tname.trim().isEmpty()) throw new DataException("Teacher name required");

            System.out.print("Qualification: "); 
            String qual = sc.nextLine();
            if (qual.trim().isEmpty()) throw new DataException("Qualification required");

            System.out.println("=== Student ===");
            System.out.print("Student name: "); 
            String sname = sc.nextLine();
            if (sname.trim().isEmpty()) throw new DataException("Student name required");

            System.out.print("Registration number: "); 
            String regNo = sc.nextLine();
            if (regNo.trim().isEmpty()) throw new DataException("Registration number required");

            System.out.println("=== Course ===");
            System.out.print("Course name: "); 
            String cname = sc.nextLine();
            if (cname.trim().isEmpty()) throw new DataException("Course name required");

            System.out.print("Credit hours (>0): "); 
            int credits = Integer.parseInt(sc.nextLine());
            if (credits <= 0) throw new DataException("Invalid credit hours");

            System.out.println("=== Enrollment ===");
            System.out.print("Semester: "); 
            String sem = sc.nextLine();
            if (sem.trim().isEmpty()) throw new DataException("Semester required");

            System.out.print("Enrollment date: "); 
            String edate = sc.nextLine();
            if (edate.trim().isEmpty()) throw new DataException("Enrollment date required");

            System.out.println("=== Assessment ===");
            System.out.print("Test score (0–40): "); 
            double test = Double.parseDouble(sc.nextLine());
            if (test < 0 || test > 40) throw new DataException("Invalid test score");

            System.out.print("Exam score (0–60): "); 
            double exam = Double.parseDouble(sc.nextLine());
            if (exam < 0 || exam > 60) throw new DataException("Invalid exam score");

            Transcript tr = new Transcript(
                1, "2025-01-01", "2025-01-02",
                school, address,
                dept, deptCode,
                tname, qual,
                sname, regNo,
                cname, credits,
                sem, edate,
                test, exam
            );

            System.out.println("\n--- TRANSCRIPT ---");
            System.out.println("Student: " + tr.getStudentName());
            System.out.println("Course: " + cname);
            System.out.println("Total Score: " + tr.getTotalScore());
            System.out.println("Final Grade: " + tr.calculateGrade() + " " + STUDENT_ID);

        } catch (DataException de) {
            System.out.println("Validation error: " + de.getMessage() + " " + STUDENT_ID);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid numeric input. " + STUDENT_ID);
        } finally {
            sc.close();
        }
    }
}
