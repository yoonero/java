// import java string builder method
import java.util.concurrent.LinkedBlockingQueue;

public class reverseString
{
    // main method
    public static void main(String[] args)
    {
        // string variable
        String oneOfLine = "hi how are you";
        // string builder method
        StringBuilder takeInput = new StringBuilder();
        
        // append 
        takeInput.append(oneOfLine);

        // reverse
        takeInput.reverse();
        System.out.println(takeInput);
    }
}