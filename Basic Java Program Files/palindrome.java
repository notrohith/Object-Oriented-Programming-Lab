import java.util.*;
public class palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        sc.close();
        int rev = 0;
        int r =0;
        int num2=num;
        while(num>0){
            r = num % 10;
            rev = rev*10+r;
            num=num/10;
        }
        if(rev==num2){
            System.out.println("It is a palindrome! ");
            
        }
        else{
            System.out.println("It is not a palindrome! ");
        }
    }
}