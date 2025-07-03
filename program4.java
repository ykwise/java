//Finding number of digits for a given number
import java.util.*;
public class program4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int count=0;
        while (num>0){
            int rem=num%10;
            count++;
            num/=10;
            System.out.println(num);


        }
        System.out.println("The no.of digits:"+count);
    }
    
}
