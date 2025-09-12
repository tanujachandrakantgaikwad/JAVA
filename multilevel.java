// Example of Multilevel Inheritance: Banking System

// Base class (Grandparent)
class Bank {
    void bankDetails() {
        System.out.println("Welcome to ABC Bank.");
    }
}

// Derived class (Parent)
class Account extends Bank {
    void accountType() {
        System.out.println("This is a Savings Account.");
    }
}

// Derived class (Child of Account)
class SavingsAccount extends Account {
    void interestRate() {
        System.out.println("Interest rate for Savings Account is 6% per year.");
    }
}

// Main class
public class MultilevelInheritanceBank {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();

        // Calling methods from all levels
        sa.bankDetails();   // From Bank
        sa.accountType();   // From Account
        sa.interestRate();  // From SavingsAccount
    }
}
