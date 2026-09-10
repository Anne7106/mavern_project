import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SmartLoanSystemTest {

    @Test
    void lowRiskTest() {
        Customer c =
            new Customer("Anu", "ID1", 25, 50000, 780, 10000);

        assertEquals("Approved - Low Risk",
                SmartLoanSystem.assess(c, 300000));
    }

    @Test
    void boundaryTest() {
        Customer c =
            new Customer("Ravi", "ID2", 21, 30000, 650, 6000);

        assertEquals("Approved - Medium Risk",
                SmartLoanSystem.assess(c, 200000));
    }

    @Test
    void highRiskTest() {
        Customer c =
            new Customer("John", "", 19, 20000, 600, 15000);

        assertEquals("Rejected - High Risk",
                SmartLoanSystem.assess(c, 300000));
    }
}
