package com.voting;

class Voter {
    String name;
    int age;
    String citizenship;
    String voterId;
    boolean idValid;

    Voter(String name, int age, String citizenship,
          String voterId, boolean idValid) {
        this.name = name;
        this.age = age;
        this.citizenship = citizenship;
        this.voterId = voterId;
        this.idValid = idValid;
    }

    String checkEligibility() {
        if (age < 18)
            return "Not Eligible - Underage";

        if (!citizenship.equalsIgnoreCase("Indian"))
            return "Not Eligible - Not an Indian citizen";

        if (!idValid)
            return "Not Eligible - Invalid Voter ID";

        return "Eligible to Vote";
    }
}

public class App {
    public static void main(String[] args) {

        Voter voter1 = new Voter(
            "Annie", 20, "Indian", "IND12345", true
        );

        Voter voter2 = new Voter(
            "John", 16, "Indian", "IND12346", true
        );

        Voter voter3 = new Voter(
            "David", 25, "American", "IND12347", true
        );

        Voter voter4 = new Voter(
            "Sarah", 22, "Indian", "IND12348", false
        );

        Voter[] voters = {voter1, voter2, voter3, voter4};

        for (Voter voter : voters) {
            System.out.println("Name: " + voter.name);
            System.out.println("Age: " + voter.age);
            System.out.println("Citizenship: " + voter.citizenship);
            System.out.println("Voter ID: " + voter.voterId);
            System.out.println("Result: " + voter.checkEligibility());
            System.out.println("----------------------------");
        }
    }
}
