package com.example;

public class App {

    public static void main(String[] args) {

        String studentName = "Anne Catherine";
        String studentId = "STU101";

        String[] subjects = {
            "Java Programming",
            "Database Management",
            "Computer Networks",
            "Software Engineering"
        };

        int[] credits = {4, 4, 3, 4};

        int totalCredits = 0;

        for (int credit : credits) {
            totalCredits += credit;
        }

        System.out.println("===== COURSE REGISTRATION DETAILS =====");
        System.out.println("Student Name : " + studentName);
        System.out.println("Student ID   : " + studentId);

        System.out.println("\nRegistered Subjects:");

        for (int i = 0; i < subjects.length; i++) {
            System.out.println(
                (i + 1) + ". " + subjects[i] +
                " - " + credits[i] + " credits"
            );
        }

        System.out.println("\nTotal Credits: " + totalCredits);

        if (totalCredits >= 15) {
            System.out.println("Eligibility Status: Eligible");
        } else {
            System.out.println("Eligibility Status: Not Eligible");
        }
    }
}
