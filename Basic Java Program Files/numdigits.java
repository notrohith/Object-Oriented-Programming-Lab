import java.util.*;
public class numdigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number =sc.nextInt();
String numberString = String.valueOf(number); 
int numberOfDigits = numberString.length();
System.out.println("Number of digits is: "+numberOfDigits); 
    }
}