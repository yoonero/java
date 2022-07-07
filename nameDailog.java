import javax.swing.JOptionPane;

public class nameDailog {
    // main method 
    public static void main(String[] args)
    {
        // prompt user to enter name 
        String userInput = JOptionPane.showInputDialog("what is your name");

        // create the message
        String messageIs = String.format("welcome %s, to java programming", userInput);

        // print the message created to user
        JOptionPane.showMessageDialog(null, messageIs);
    }  // end main method 
}
