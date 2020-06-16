import java.util.Scanner;
// find out even,odd number and sum of even,odd
public class SumOfEvenOddNumber {
    public static void main(String[] args) {
        int evenNumber = 0;
        int oddNumber = 0;

        int evenSum = 0;
        int oddSum = 0;
        Scanner scanner = new Scanner(System.in); // use scanner to input the number
        System.out.println("Enter five Digit number");
        int num = scanner.nextInt();
        while (num>0) {
            int rem=num%10;
            if (rem %2==0) {
                evenSum +=rem;
                //evenNumber++;
                num=num/10;
            } else {
                oddSum+=rem;
               // oddNumber++;
               num=num/10;
            }

           // System.out.println("Number of Even digits:" + evenNumber);
            System.out.println("Total of Even digits:" + evenSum);

           // System.out.println("Number of odd digits :" + oddNumber);
            System.out.println("Total of odd digits :" + oddSum);


        }
    }
}





