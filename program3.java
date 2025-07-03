//sum of digits of a given number
import java.util.*;
public class program3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num= sc.nextInt();
        int temp = num;
        int sum=0;
        while(num>0){
            int rem=num%10;
            num /=10;
            sum+=rem;
            System.out.println(num);

        }
        System.out.println("Sum of the digits of "+temp+": "+sum);

    }
}
