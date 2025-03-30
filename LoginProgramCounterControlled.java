import javax.swing.JOptionPane;

public class CounterControlled {
    public static void main(String[] args) {
        int attempts = 0;
        final int MAX_ATTEMPTS = 3;
        boolean success = false;
        while (attempts < MAX_ATTEMPTS) {
            String username = JOptionPane.showInputDialog("Enter username:");
            String password = JOptionPane.showInputDialog("Enter password:");
            if (username.equals("admin") && password.equals("pwd123")) {
                success = true;
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Log-in failed. Please try again.");
                attempts++;
            }
        }
        if (success) {
            JOptionPane.showMessageDialog(null, "Log-in successful.");
        } else {
            JOptionPane.showMessageDialog(null, "You ran out of attempts. Program is now terminating...");
        }
    }
}