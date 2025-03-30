import javax.swing.JOptionPane;
class FlashDriveCalculator {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter the number of flash drives:");

        // Input to integer
        int numFlashDrives = Integer.parseInt(input);

        // Calculate number of gross, dozen, and extra flash drives
        int numGross = numFlashDrives / 144;
        int numDozen = (numFlashDrives % 144) / 12;
        int numExtra = numFlashDrives % 12;

        // Display output to user
        JOptionPane.showMessageDialog(null, "You have:\n" +
                numGross + " gross of flash drives\n" +
                numDozen + " dozen of flash drives\n" +
                numExtra + " extra flash drives");

    }
}