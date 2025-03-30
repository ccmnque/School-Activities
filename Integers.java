import javax.swing.JOptionPane;

public class Integers {
    public static void main(String[] args) {

        int[] numbers = new int[10];

        // Loop to store 10 numbers to array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number:"));
        }

        // Grouping of numbers
        String oddNumbers = "";
        String evenNumbers = "";
        String negativeNumbers = "";
        String positiveNumbers = "";

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num % 2 != 0) {
                oddNumbers += num + " ";
            } else {
                evenNumbers += num + " ";
            }
            if (num < 0) {
                negativeNumbers += num + " ";
            } else if (num > 0) {
                positiveNumbers += num + " ";
            }
        }

        // Displaying the results
        JOptionPane.showMessageDialog(null, "Odd Numbers: " + oddNumbers);
        JOptionPane.showMessageDialog(null, "Even Numbers: " + evenNumbers);
        JOptionPane.showMessageDialog(null, "Negative Numbers: " + negativeNumbers);
        JOptionPane.showMessageDialog(null, "Positive Numbers: " + positiveNumbers);

    }

}