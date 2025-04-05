import java.util.*;
public class primenumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        boolean isPrime = num>1;
        for (int i=2;i*i<=num;i++){

        if (num%i==0){
            isPrime=false;
            break;
        }
    }
        if(isPrime){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
}
}
