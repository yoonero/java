// import java string builder method
import java.util.concurrent.LinkedBlockingQueue;
// import java.util.Scanner 
import java.util.Scanner;


public class reverseString
{
    // main method
    public static void main(String[] args)
    {
        // string variable
        String oneOfLine;

        // string builder method
        StringBuilder takeInput = new StringBuilder();

        // scanner method
        Scanner inputFromUser = new Scanner(System.in);

        // prompt
        System.out.print("Enter a text of line :");
        oneOfLine = inputFromUser.nextLine(); // take input from user and store it in a variable
        
        // display user input original 
        System.out.printf("Line you typed: %s%n ", oneOfLine);
        // append 
        takeInput.append(oneOfLine);

        // reverse
        takeInput.reverse();
        // prompt 
        System.out.printf("Your reversed line: %s%n", takeInput);
    }
}