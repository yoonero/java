// import java.util.Scanner
import java.util.Scanner;

public class simpleCmdCalculator
{
    // main method
    public static void main(String[] args)
    {
        // variables 
        char operator;
        double numberOne, numberTwo;

        // scanner object 
        Scanner input = new Scanner(System.in);

        //prompt first integer
        System.out.print("Enter first Number:");
        numberOne = input.nextInt();
        
        // prompt for  operator
        System.out.println("select an operator + - * / ");
        operator = input.next().charAt(0);

        //prompt second integer
        System.out.print("Enter second Number:");
        numberTwo = input.nextInt();
        
        if(operator == '+')
        {
            System.out.print(numberOne + numberTwo);
        }
        else if(operator == '-')
        {
            System.out.print(numberOne - numberTwo);
        }
        else if(operator == '*')
        {
            System.out.print(numberOne * numberTwo);
        }
        else if(operator == '/')
        {
            System.out.print(numberOne / numberTwo);
        }
        else 
        {
            System.out.print("no vaid input ");
        }
        
    }    
}
