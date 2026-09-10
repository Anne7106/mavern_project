import java.util.*;

class Employee {
    String id, name, department, employment;
    int age, clearance;
    boolean validId;

    Employee(String id, String name, int age, String department,
             String employment, int clearance, boolean validId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.employment = employment;
        this.clearance = clearance;
        this.validId = validId;
    }
}

public class EmployeeAccessSystem {

    static String check(Employee e, int access) {
        List<String> reasons = new ArrayList<>();

        if (e.age < 21)
            reasons.add("Age below 21");

        if (!(e.department.equals("IT") ||
              e.department.equals("HR") ||
              e.department.equals("Finance") ||
              e.department.equals("Administration")))
            reasons.add("Unauthorized department");

        if (!e.employment.equalsIgnoreCase("Active"))
            reasons.add("Inactive employment");

        if (!e.validId)
            reasons.add("Invalid employee ID");

        if (e.clearance < access)
            reasons.add("Insufficient security clearance");

        if (reasons.isEmpty())
            return "Eligible";

        if (reasons.size() == 1)
            return "Conditionally Eligible: " + reasons;

        return "Not Eligible: " + reasons;
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(
            "E101", "Anu", 25, "IT", "Active", 3, true);

        Employee e2 = new Employee(
            "E102", "Ravi", 21, "HR", "Active", 2, true);

        Employee e3 = new Employee(
            "E103", "John", 19, "Sales", "Inactive", 1, false);

        System.out.println(e1.name + ": " + check(e1, 2));
        System.out.println(e2.name + ": " + check(e2, 2));
        System.out.println(e3.name + ": " + check(e3, 3));
    }
}
