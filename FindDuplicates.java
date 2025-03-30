import javax.swing.JOptionPane;

public class FindDuplicates {

    public static void main(String[] args) {

        int[] arr = new int[20];
        String input;
        String output = "The array values are: ";
        String duplicates = "The duplicated integers are: ";
        int count;

        for (int i = 0; i < arr.length; i++) {
            input = JOptionPane.showInputDialog("Enter integer " + (i + 1) + ":");
            arr[i] = Integer.parseInt(input);
            output += arr[i] + " ";
        }

        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > 0) {
                duplicates += arr[i] + "(" + (count + 1) + " times) ";
            }
        }

        JOptionPane.showMessageDialog(null, output);
        JOptionPane.showMessageDialog(null, duplicates);
    }

}