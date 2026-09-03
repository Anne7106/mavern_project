package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testTotalCredits() {

        int[] credits = {4, 4, 3, 4};

        int totalCredits = 0;

        for (int credit : credits) {
            totalCredits += credit;
        }

        assertEquals(15, totalCredits);
    }

    @Test
    public void testEligibility() {

        int totalCredits = 15;

        assertTrue(totalCredits >= 15);
    }

    @Test
    public void testSubjectCredits() {

        String[] subjects = {
            "Java Programming",
            "Database Management",
            "Computer Networks",
            "Software Engineering"
        };

        int[] credits = {4, 4, 3, 4};

        assertEquals("Java Programming", subjects[0]);
        assertEquals(4, credits[0]);
        assertEquals(4, credits[1]);
        assertEquals(3, credits[2]);
        assertEquals(4, credits[3]);
    }

    @Test
    public void testStudentDetails() {

        String studentName = "Anne Catherine";
        String studentId = "STU101";

        assertEquals("Anne Catherine", studentName);
        assertEquals("STU101", studentId);
    }
}
