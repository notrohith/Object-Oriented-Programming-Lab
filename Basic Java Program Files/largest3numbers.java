import java.util.*;
public class largest3numbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a = sc.nextInt();
        System.out.println("Enter your second number: ");
        int b = sc.nextInt();
        System.out.println("Enter your third number: ");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is the largest number ");
        }
        else if(b>a && b>c){
            System.out.println(b+" is the largest number ");

        }
        else if(c>a && c>b){
         System.out.println(c+" is the largest number ");
        }

    }
}