import javax.swing.JOptionPane;

public class CounterControlledLoop {
    public static void main(String[] args) {

        int startingValue = Integer.parseInt(JOptionPane.showInputDialog("Type first integer:"));
        int endingValue = Integer.parseInt(JOptionPane.showInputDialog("Type second integer:"));
        while (endingValue <= startingValue) {
            endingValue = Integer.parseInt(JOptionPane.showInputDialog("Sorry! second integer must be greater than " 
            + startingValue + ".\nType second integer again:"));
        }
        int sum = 0;
        int count = 0;
        for (int i = startingValue; i <= endingValue; i++) {
            int input = Integer.parseInt(JOptionPane.showInputDialog("Input integer:"));
            sum += input;
            count++;
        }
        double average = (double) sum / count;
        JOptionPane.showMessageDialog(null, "Total Sum: " + sum + "\nAverage: " + average);
    }
}