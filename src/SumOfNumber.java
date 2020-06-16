import java.util.Scanner;
/* To find out sum of the five digits */
public class SumOfNumber {
    public static void main(String[]args){  // main method
        int x,y ,sum = 0;
        Scanner sc = new Scanner(System.in); // call scanner to input numbers
        System.out.println("Please Enter a Five  numbers to calculate sum :");
        x = sc.nextInt();
        // use the wilie method
        while(x > 0) {
            y = x % 10;
            sum = sum + y;
            x = x / 10;
        }

        System.out.println("Sum of Digits:"+sum);

    }
}
