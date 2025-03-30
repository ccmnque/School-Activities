import javax.swing.JOptionPane;

public class SumOfNOdd {
    public static void main(String[] args) {
       
        String input = JOptionPane.showInputDialog("Enter a positive integer n:");
        int n = Integer.parseInt(input);
        
        int sum = 0;
        int num = 1;

        for (int i = 1; i <= n; i++) {
            sum += num;
            num += 2;
        }

        JOptionPane.showMessageDialog(null, "The sum of the first " + n + " odd numbers is: " + sum);
    }
}