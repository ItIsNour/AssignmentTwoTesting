import java.util.Scanner;

/* Nour Hany Abdallah 19p4089 */

public class checkEvenOdd {

    public static String checkEvenOddNum(int number){
        if ( number % 2 == 0 )
            return("The number is even");
        else
            return("The number is odd");

    }

    public static void main(String args[])
    {
        int num;
        System.out.println("Enter a number:");

        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        System.out.println(checkEvenOddNum(num));
    }


}
