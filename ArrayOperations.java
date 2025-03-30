import javax.swing.JOptionPane;

public class ArrayOperations {

    public static void main(String[] args) {

        int num[] = new int[10];
        int first = 0, last = 0, atIndex = 0;
        String all = "";

        // Loop to store 10 numbers to array
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number:"));
        }

        // Loop to display values from Array - use 'all.'
        for (int i = 0; i < num.length; i++) {
            all += num[i] + " ";
        }
        JOptionPane.showMessageDialog(null, "Array Elements are\t: " + all);

        // Determine the first value
        first = num[0];
        JOptionPane.showMessageDialog(null, "The first value is \t: " + first);

        // Determine the last value
        last = num[num.length - 1];
        JOptionPane.showMessageDialog(null, "The last value is\t: " + last);

        // Determine the search value through the index
        atIndex = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an index:"));
        JOptionPane.showMessageDialog(null, "The value at index " + atIndex + " is\t: " + num[atIndex]);

        // Change a value of array elements through the index
        int changeIndex = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the index to change:"));
        int newValue = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the new value:"));
        num[changeIndex] = newValue;
        JOptionPane.showMessageDialog(null, "The new value at index " + changeIndex + " is\t: " + num[changeIndex]);

    }

}