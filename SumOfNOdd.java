import javax.swing.JOptionPane;

public class SumOfNOdd {
    public static void main(String[] args) {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Value of N: "));
        int sum = 0;
        for (int i = 1; i <= 2 * n; i += 2) {
            sum += i;
        }
        JOptionPane.showMessageDialog(null, "The sum of the first " + n + " odd numbers is " + sum);
    }
}