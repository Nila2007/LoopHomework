import java.util.Scanner;
// to find out first and last number and sum of that number
public class FirstAndLastNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five digit :");
        int num = scanner.nextInt();
       int ldig = num % 10;
        int fdig = num;
        while (fdig >=10) {  // use while
            fdig = fdig / 10;
        }
            System.out.println("First Digit ="+fdig);
            System.out.println("Sum ="+fdig+ldig);
        }
    }



