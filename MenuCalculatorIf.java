import javax.swing.JOptionPane;

class MenuCalculatorIf {

    public static void main(String[] args) {
        while (true) {
            // Ask the user for the input numbers
            String input1 = JOptionPane.showInputDialog("Enter the first number:");
            String input2 = JOptionPane.showInputDialog("Enter the second number:");

            // Ask the user for the operation to perform
            String operationChoice = JOptionPane.showInputDialog("Choose an operation:\n" +
                                                                   " [A]dd\n" +
                                                                   " [S]ubtract\n" +
                                                                   " [M]ultiply\n" +
                                                                   " [D]ivide\n" +
                                                                   " [Q]uit");

            // Exit the program if the user chooses 'q' or 'Q'
            if (operationChoice.equalsIgnoreCase("q")) {
                JOptionPane.showMessageDialog(null, "Program terminating...");
                break;
            }

            // Convert the input strings to numbers
            double num1 = Double.parseDouble(input1);
            double num2 = Double.parseDouble(input2);

            // Perform the chosen operation
            double result = 0;
            char operation = operationChoice.charAt(0);
            if (operation == 'a' || operation == 'A') {
                result = num1 + num2;
            } else if (operation == 's' || operation == 'S') {
                result = num1 - num2;
            } else if (operation == 'm' || operation == 'M') {
                result = num1 * num2;
            } else if (operation == 'd' || operation == 'D') {
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(null, "Cannot divide by zero");
                    continue; // Continue with the loop if division by zero occurs
                }
                result = num1 / num2;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid operation");
                continue; // Continue with the loop if an invalid operation is chosen
            }

            // Display the result
            JOptionPane.showMessageDialog(null, "The result is: " + result);
        }
    }
}