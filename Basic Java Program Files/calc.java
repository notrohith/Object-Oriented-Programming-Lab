import java.util.*;
public class calc {
    int add(int num1, int num2) {
        return num1 + num2;
    }

    int sub(int num1, int num2) {
        return num1 - num2;
    }

    int multiply(int num1, int num2) {
        return num1 * num2;
    }

    double divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Error! Can't divide by zero!");
            return 0;
        }
        return (double) num1 / num2;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        calc obj = new calc();

        System.out.print("Enter your first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter your second number: ");
        int num2 = sc.nextInt();

        sc.nextLine();

        System.out.print("Choose your operator (+ - * /): ");
        String oper = sc.nextLine();

        if (oper.equals("+")) {
            System.out.println("Addition: " + obj.add(num1, num2));
        } else if (oper.equals("-")) {
            System.out.println("Subtraction: " + obj.sub(num1, num2));
        } else if (oper.equals("*")) {
            System.out.println("Multiplication: " + obj.multiply(num1, num2));
        } else if (oper.equals("/")) {
            System.out.println("Division: " + obj.divide(num1, num2));
        } else {
            System.out.println("Invalid operator!");
        }
    }
}
