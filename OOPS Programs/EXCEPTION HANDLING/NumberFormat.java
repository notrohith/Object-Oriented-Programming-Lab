import java.util.Scanner;

public class NumberFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();
            int num = Integer.parseInt(input);
            System.out.println("You entered: " + num);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
        }

        scanner.close();
    }
}
