import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeAccessSystemTest {

    @Test
    void normalTest() {
        Employee e =
            new Employee("E1", "Anu", 25, "IT", "Active", 3, true);

        assertEquals("Eligible",
            EmployeeAccessSystem.check(e, 2));
    }

    @Test
    void boundaryTest() {
        Employee e =
            new Employee("E2", "Ravi", 21, "HR", "Active", 2, true);

        assertEquals("Eligible",
            EmployeeAccessSystem.check(e, 2));
    }

    @Test
    void invalidInputTest() {
        Employee e =
            new Employee("E3", "John", 20, "Sales", "Inactive", 1, false);

        String result = EmployeeAccessSystem.check(e, 3);

        assertTrue(result.contains("Age below 21"));
        assertTrue(result.contains("Unauthorized department"));
        assertTrue(result.contains("Inactive employment"));
        assertTrue(result.contains("Invalid employee ID"));
        assertTrue(result.contains("Insufficient security clearance"));
    }
}
