import javax.swing.JOptionPane;

public class SentinelControlled {
    public static void main(String[] args) {
        final String SENTINEL = "quit";
        int attempts = 0;
        final int MAX_ATTEMPTS = 3;
        boolean success = false;
        String username = "";
        while (!username.equals(SENTINEL) && attempts < MAX_ATTEMPTS) {
            username = JOptionPane.showInputDialog("Enter username:");
            if (username.equals("admin")) {
                String password = JOptionPane.showInputDialog("Enter password:");
                if (password.equals("pwd123")) {
                    success = true;
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Log-in failed. Please try again.");
                    attempts++;
                }
            } else if (!username.equals(SENTINEL)) {
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
