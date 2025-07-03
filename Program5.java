//check whether number is palindrome or not
import java.util.*;
public class Program5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int org_Num=sc.nextInt();//12345
        int temp=org_Num;
        int reverse_num = 0;
        while(org_Num>0){
            int rem=org_Num%10;
            reverse_num = reverse_num*10+ rem;
            org_Num/=10;
            System.out.println(reverse_num);
        }
        if(temp==reverse_num){
            System.out.println(temp + "is a palindrome number");
        }
        sc.close();

    }
    
}
