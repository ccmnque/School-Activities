import javax.swing.JOptionPane;

public class CharacterCount {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter a string:");
        
        if (input == null || input.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a non-empty string.");
            System.exit(0);
        }
        
        int specialCount = 0;
        int consonantCount = 0;
        int vowelCount = 0;
        int spaceCount = 0;
        int zeroCount = 0;
        int oddCount = 0;
        int evenCount = 0;
        
        input = input.toLowerCase();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            } else if (c >= '0' && c <= '9') {
                int digit = Character.getNumericValue(c);
                if (digit == 0) {
                    zeroCount++;
                } else if (digit % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            } else if (c == ' ') {
                spaceCount++;
            } else {
                specialCount++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Special characters: " + specialCount +
                                            "\nConsonants: " + consonantCount +
                                            "\nVowels: " + vowelCount +
                                            "\nSpaces: " + spaceCount +
                                            "\nZeros: " + zeroCount +
                                            "\nOdd digits: " + oddCount +
                                            "\nEven digits: " + evenCount);
    }
}