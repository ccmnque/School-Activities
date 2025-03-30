import javax.swing.JOptionPane;
class StringValues {

    public static void main(String[] args) {
        // Declare strings
        String str1 = "God is real";
        String str2 = " UNLESs";

        // 1. Determine the 8th character of str1
        char eighthChar = str1.charAt(7);
        JOptionPane.showMessageDialog(null, "The 8th character of str1 is: " + eighthChar);

        // 2. Determine the index of 's' in str2
        int sIndex = str2.indexOf('s');
        JOptionPane.showMessageDialog(null, "The index of 's' in str2 is: " + sIndex);

        // 3. Convert str1 to uppercase
        String str1Upper = str1.toUpperCase();
        JOptionPane.showMessageDialog(null, "str1 in uppercase is: " + str1Upper);

        // 4. Convert str2 to lowercase
        String str2Lower = str2.toLowerCase();
        JOptionPane.showMessageDialog(null, "str2 in lowercase is: " + str2Lower);

        // 5. Replace all vowels with 'x' in str1
        String replace = str1.replaceAll("[aeiouAEIOU]", "x");
        JOptionPane.showMessageDialog(null, "str1 with vowels replaced by 'x' is: " + replace);

        // 6. Display the length of the String in str1 and str2
        JOptionPane.showMessageDialog(null, "Length of str1 is: " + str1.length());
        JOptionPane.showMessageDialog(null, "Length of str2 is: " + str2.length());

        // Input a string from user using JOptionPane
        String statement = JOptionPane.showInputDialog(null, "Enter a string:");

        // 1. Concatenate all the quotes and display as a sentence
        String sentence = "\"" + str1 + "\", \"" + str2 + "\", \"" + statement + "\"";
        JOptionPane.showMessageDialog(null, "The sentence is: " + sentence);

        // 2. Display the length of the sentence
        JOptionPane.showMessageDialog(null, "Length of the sentence is: " + sentence.length());

        // 3. Display the word "an integer" from the sentence
        int startIndex = sentence.indexOf("an integer");
        String integerWord = sentence.substring(startIndex, startIndex + 10);
        JOptionPane.showMessageDialog(null, "The word 'an integer' is: " + integerWord);

        // 4. Compare the word "as" from the sentence to "is" from str1
        boolean compare = sentence.substring(18, 20).equals(str1.substring(4, 6));
        JOptionPane.showMessageDialog(null, "'as' from the sentence is equal to 'is' from str1: " + compare);

        // 5. Reverse the string in str2
        String reverse = new StringBuilder(str2).reverse().toString();
        JOptionPane.showMessageDialog(null, "str2 in reverse is: " + reverse);
    }
}