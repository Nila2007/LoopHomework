import java.util.Scanner;
// multiplication number
public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int num;
        System.out.println("Enter number"); // input any number
         num =scanner.nextInt();
        int i = 1;
        do {                        // use do method
            System.out.println(num+"X"+i+"="+num*i);
            i++;
        } while (i<11);    // it will print multiplication of the input number
        i++;

        {

           }
    }
}
