import javax.swing.JOptionPane;

public class FlagControlledLoop {

    public static void main(String[] args) {
        
        String input;
        boolean found = false;

        while(!found) {
            input = JOptionPane.showInputDialog("Type a character:");
            if(input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u")) {
                found = true;
                JOptionPane.showMessageDialog(null, "Found a vowel. Program terminating...");
            } else {
                JOptionPane.showMessageDialog(null, "Not that as I am expecting. Try again.");
            }
        }
    }
}
