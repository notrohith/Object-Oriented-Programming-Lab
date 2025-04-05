import banking.BankAccount;

public class Bank {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Rohith S", 1000);
        
        acc.deposit(500);
        acc.withdraw(300);
        acc.displayBalance();
    }
}
