// import Scanner class
import java.util.Scanner;
public class SimpleAddTwoInt
{
    // main method 
    public static void main(String[] args)
    {
        // Scanner object
        Scanner input = new Scanner(System.in);

        // variables
        int firstNum;
        int secondNum;
        

        // prompt
        System.out.print("Enter first number: ");
        firstNum = input.nextInt(); // take input form user


        // prompt
        System.out.print("Enter second number: ");
        secondNum = input.nextInt(); // take input form user

        // display result
        System.out.printf("Sum :  %d", (firstNum + secondNum));

    }
}