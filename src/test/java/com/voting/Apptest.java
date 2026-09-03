package com.voting;
 
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testEligibleVoter() {
        Voter voter = new Voter(
            "Annie", 20, "Indian", "IND12345", true
        );

        assertEquals("Eligible to Vote",
                     voter.checkEligibility());
    }

    @Test
    void testUnderageVoter() {
        Voter voter = new Voter(
            "John", 16, "Indian", "IND12346", true
        );

        assertEquals("Not Eligible - Underage",
                     voter.checkEligibility());
    }

    @Test
    void testNonCitizen() {
        Voter voter = new Voter(
            "David", 25, "American", "IND12347", true
        );

        assertEquals("Not Eligible - Not an Indian citizen",
                     voter.checkEligibility());
    }

    @Test
    void testInvalidVoterId() {
        Voter voter = new Voter(
            "Sarah", 22, "Indian", "IND12348", false
        );

        assertEquals("Not Eligible - Invalid Voter ID",
                     voter.checkEligibility());
    }
}
