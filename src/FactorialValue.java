import java.util.Scanner;
//  find out factorial value
public class FactorialValue {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num;
        int fact =1;
        System.out.println("Enter any integer:"); // enter any integer
        num = scanner.nextInt();
        for (int i=1; i<=num; i++)
        {
            fact *=i;
        }
        System.out.println("Factorial :" + fact);
    }
}
