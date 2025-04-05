interface Banking {
    void deposit(double amount);
    void withdraw(double amount);
}

class SavingsAccount implements Banking {
    private double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount + " | New Balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + " | Remaining Balance: $" + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

class CurrentAccount implements Banking {
    private double balance;

    public CurrentAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount + " | New Balance: $" + balance);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: $" + amount + " | Remaining Balance: $" + balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        Banking savings = new SavingsAccount(1000);
        Banking current = new CurrentAccount(2000);

        savings.deposit(500);
        savings.withdraw(2000);

        current.deposit(1000);
        current.withdraw(2500);
    }
}
