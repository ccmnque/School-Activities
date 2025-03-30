import javax.swing.JOptionPane;

public class UpsideDown {
    
    public static void main(String[] args) {
        // Cecilia Aljune E. Munasque
        System.out.println("Cecilia Aljune E. Munasque");

        int[] arr = new int[10];
        String input;
        String output = "Array values before reversing: ";

        // Accepting array values
        for (int i = 0; i < arr.length; i++) {
            input = JOptionPane.showInputDialog("Enter integer " + (i + 1) + ":");
            arr[i] = Integer.parseInt(input);
            output += arr[i] + " ";
        }

        // Reversing the array
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        output += "\nArray values after reversing: ";
        for (int i = 0; i < arr.length; i++) {
            output += arr[i] + " ";
        }
        
        JOptionPane.showMessageDialog(null, output);
    }

}