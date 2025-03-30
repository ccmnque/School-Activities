import javax.swing.JOptionPane;

public class SearchAValue {
    public static void main(String[] args) {
        int[] numArray = new int[10];
        
        // Input values
        for(int i=0; i<numArray.length; i++) {
            String input = JOptionPane.showInputDialog(null, "Enter an integer for index " + i);
            numArray[i] = Integer.parseInt(input);
        }
        
        // Search for value
        String searchInput = JOptionPane.showInputDialog(null, "Enter a value to search for");
        int searchValue = Integer.parseInt(searchInput);
        boolean found = false;
        int index = -1;
        
        for(int i=0; i<numArray.length; i++) {
            if(numArray[i] == searchValue) {
                found = true;
                index = i;
                break;
            }
        }
        
        if(found) {
            JOptionPane.showMessageDialog(null, searchValue + " is found at index " + index);
        } else {
            JOptionPane.showMessageDialog(null, searchValue + " is NOT found");
        }
    }
}
