import javax.swing.JOptionPane;

class PositiveNegative {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a number:");
        int number = Integer.parseInt(input);
        
        if(number > 0){
            JOptionPane.showMessageDialog(null, number + " is a positive number.");
        } else if(number < 0){
            JOptionPane.showMessageDialog(null, number + " is a negative number.");
        } else {
            JOptionPane.showMessageDialog(null, "0 is neither positive nor negative.");
        }
    }
}
