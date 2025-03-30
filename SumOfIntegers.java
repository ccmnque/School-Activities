import javax.swing.JOptionPane;

public class SumOfIntegers {
    public static void main(String[] args) {
        
        // Prompt the user for an integer input
        String inputStr = JOptionPane.showInputDialog(null, "Please enter an integer:");
        
        // Parse the input string to an integer
        int n = Integer.parseInt(inputStr);
        
        // Calculate the sum of integers from 1 to n using a for loop
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        // Display the sum using a message dialog box
        JOptionPane.showMessageDialog(null, "The sum of integers from 1 to " + n + " is " + sum + ".");
    }
}