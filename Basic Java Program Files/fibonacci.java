import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt(), a = 0, b = 1;
        System.out.print("Fibonacci Series For first "+n+" Numbers " + a + " " + b);
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b; b = next;
        }
        sc.close();
    }
}

