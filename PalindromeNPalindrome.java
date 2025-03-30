import javax.swing.JOptionPane;

public class PalindromeNPalindrome {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(null, "Enter a string:");
        String output;
        
        if (isPalindrome(input)) {
            output = input + " is a palindrome.";
        } else {
            output = input + " is not a palindrome.";
        }
        
        JOptionPane.showMessageDialog(null, output);
    }
    
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
