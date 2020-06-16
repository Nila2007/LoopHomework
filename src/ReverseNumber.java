import java.util.Scanner;
/*  to reverse integer */

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //use scanner
        int num = 10 , reversed =0; // declare variable
        System.out.println("Enter five number:");
        num=scanner.nextInt();
        while (num !=0)
        {
            int digit = num % 10;
            reversed = reversed *10 +digit;
            num /=10;
        }
        System.out.println("Reversed Number :" + reversed);
    }
}
