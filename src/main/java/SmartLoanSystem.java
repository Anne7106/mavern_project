import java.util.*;

class Customer {
    String name, id;
    int age, score;
    double income, loans;

    Customer(String name, String id, int age, double income,
             int score, double loans) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.income = income;
        this.loans = loans;
        this.score = score;
    }
}

public class SmartLoanSystem {

    static String assess(Customer c, double amount) {
        double maxLoan = c.income * 10;
        double dti = (c.loans / c.income) * 100;

        if (c.age < 21 || c.id.isEmpty() || c.income < 25000 ||
            amount > maxLoan || c.score < 650 || dti > 40)
            return "Rejected - High Risk";

        if (c.score >= 750 && dti <= 30)
            return "Approved - Low Risk";

        return "Approved - Medium Risk";
    }

    public static void main(String[] args) {
        Customer c1 =
            new Customer("Anu", "ID101", 25, 50000, 780, 10000);

        Customer c2 =
            new Customer("Ravi", "ID102", 21, 30000, 680, 9000);

        Customer c3 =
            new Customer("John", "", 19, 20000, 600, 15000);

        System.out.println(c1.name + ": " + assess(c1, 300000));
        System.out.println(c2.name + ": " + assess(c2, 200000));
        System.out.println(c3.name + ": " + assess(c3, 300000));
    }
}
