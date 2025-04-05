import java.util.Scanner;
class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}
public class PasswordValidation {
    public static void validatePassword(String password) throws WeakPasswordException {
        if (password.length() < 8 || !password.matches(".*\\d.*")) {
            throw new WeakPasswordException("Password must be at least 8 characters long and contain a number!");
        }
        System.out.println("Password is strong!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a password: ");
            String password = scanner.next();
            validatePassword(password);
        } catch (WeakPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Password validation completed.");
            scanner.close();
        }
    }
}
