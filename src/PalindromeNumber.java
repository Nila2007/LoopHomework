import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;
// palindrome number
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        int num = new Scanner(System.in).nextInt();
        int number = num;
        int rev = 0;
        while (number !=0)
        {
            int rem = number%10;
            rev = rev *10 + rem;
            number = number /10;
        }
        if (num==rev)
        {
            System.out.println("It is a Palindrome number");
        }
        else
            System.out.println("It is not a Palindrome number");
    }


}
