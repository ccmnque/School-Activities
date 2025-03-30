import javax.swing.JOptionPane;

public class IntValues {
    public static void main(String[] args) {

        String input1 = JOptionPane.showInputDialog(null, "Enter the first number:");
        int num1 = Integer.parseInt(input1);
        
        String input2 = JOptionPane.showInputDialog(null, "Enter the second number:");
        int num2 = Integer.parseInt(input2);
        
        int sum = num1 + num2;
        if (num1 == num2) {
            sum *= 2;
        }
    
        JOptionPane.showMessageDialog(null, "The sum is " + sum);
    }
}
