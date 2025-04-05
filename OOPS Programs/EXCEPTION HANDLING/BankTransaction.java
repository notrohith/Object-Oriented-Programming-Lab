import java.util.Scanner;
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}


public class BankTransaction {
    private double balance;

    public BankTransaction(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance! Available: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankTransaction account = new BankTransaction(5000);

        try {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            account.withdraw(amount);

        } catch (InsufficientFundsException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using our banking service.");
        }

        scanner.close();
    }
}
