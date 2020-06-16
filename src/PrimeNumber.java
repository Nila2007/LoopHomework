import java.util.Scanner;

public class PrimeNumber {
    // find out Armstrong number
    public static void main(String[] args) {
        int n=0;
       int prime =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        n= sc.nextInt();

        if (n%2 ==0&&n>=2) {
            prime=0;
        }
        else {
            prime=1;
        }
        if (prime==0){
        System.out.println ( n + "is a prime number:");
    }
        else
            {
                System.out.println("This number is not prime number");
            }
}}