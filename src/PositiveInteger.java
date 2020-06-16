import java.util.Scanner;
// enter any positive number and multiplication
public class PositiveInteger {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num;
        System.out.print("Enter any positive integer:"); //enter any positive number
        num=scanner.nextInt();
        System.out.println("Multiplication Table of " + num);
        for (int i=1; i<=10; i++) // using for and if
        {
            if (num >=0)
            {
                System.out.println(num + "x" +i+ "=" +(num*i));
            }
            else
                {
                    System.out.println("invalid data");
                }
       // System.out.println(num + "x" +i+ "=" +(num*1));
    }}
}
