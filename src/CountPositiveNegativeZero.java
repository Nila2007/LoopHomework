import java.util.Scanner;
// count positive , negative and zero
public class CountPositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number,
                positiveNumber =0, // input any positive
                negativeNumber = 0,
                countZero = 0;
        char choice;
        do
            {
            System.out.println("Enter the number:");
            number = scanner.nextInt();
            if (number > 0)
            {
                positiveNumber++;
            }
            else if (number < 0)
            {
                negativeNumber++;
           }
            else
                {
                countZero++;
            }
            System.out.print("Do you want to continue y/n? ");
            choice = scanner.next().charAt(0);
        }
        while (choice =='y' || choice=='Y');
       System.out.println("Positive number :"+ positiveNumber);
        System.out.println("Negative numbers:" + negativeNumber);
        System.out.println("Zero numbers:" + countZero);
        }
    }

