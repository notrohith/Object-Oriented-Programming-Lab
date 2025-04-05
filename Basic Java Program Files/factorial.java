import java.util.*;
public class factorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int a = sc.nextInt();
        sc.close();
        int fact=1;
        if(a>0){
            for(int i =1;i<=a;i++){
            fact = fact*i;
            }
            System.out.println("The factorial is "+fact);
        }
        else if(a==0){
            System.out.println("The factorial is 1");
        }
        else{
            System.out.println("Invalid input");
        }

        }
    }
