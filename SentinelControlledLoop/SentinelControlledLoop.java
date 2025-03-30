import javax.swing.JOptionPane;

public class SentinelControlledLoop {
    public static void main(String[] args) {

        int number;
        int oddCount = 0;
        int evenCount = 0;
        String input;
        
        do {
            input = JOptionPane.showInputDialog("Enter an integer (0 to quit): ");
            number = Integer.parseInt(input);
            
            if (number != 0) {
                if (number % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        } while (number != 0);
        
        JOptionPane.showMessageDialog(null, "Odd: " + oddCount + "\nEven: " + evenCount);
    }
}