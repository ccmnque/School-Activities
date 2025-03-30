import javax.swing.JOptionPane;

public class HappyMealOrderingSystem {
    public static void main(String[] args) {

        // menu items
        double[] prices = { 75.00, 90.00, 60.00, 50.00, 15.00, 30.00 };
        String[] items = { "One Piece Fried Chicken", "Two Piece Fried Chicken", "Fried Chicken With Spaghetti", "Spaghetti", "Extra Rice", "Beverage" };

        // order details
        int[] orderQty = new int[9];
        double orderTotal = 0.0;

        // loop
        while (true) {
            // Display menu and ask for order
            String menu = "";
            for (int i = 0; i < items.length; i++) {
                menu += "[" + (i + 1) + "] " + items[i] + " - " + prices[i] + " PHP\n";
            }
            menu += "[0] Exit";
            int choice = Integer.parseInt(JOptionPane.showInputDialog(menu));

            // Exit program if choice is 0
            if (choice == 0) {
                break;
            }

            // Ask for quantity of order
            int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity of " + items[choice - 1]));

            // Add order to order details
            orderQty[choice - 1] += qty;
            orderTotal += (prices[choice - 1] * qty);
        }

        // Ask for cash rendered and calculate change or balance
        double cashRendered = Double.parseDouble(JOptionPane.showInputDialog("Enter cash rendered"));
        double change = cashRendered - orderTotal;

        // Check if cash rendered is sufficient
        if (change < 0) {
            JOptionPane.showMessageDialog(null, "Insufficient cash rendered. Please try again.");
            return;
        }

        // Create official receipt
        String receipt = "OFFICIAL RECEIPT\n";
        receipt += "-----------------------------\n";
        for (int i = 0; i < items.length; i++) {
            if (orderQty[i] > 0) {
                receipt += items[i] + "\t" + orderQty[i] + "\t" + (prices[i] * orderQty[i]) + " PHP\n";
            }
        }
        receipt += "-----------------------------\n";
        receipt += "Total\t\t" + orderTotal + " PHP\n";
        receipt += "Cash Rendered\t\t" + cashRendered + " PHP\n";
        receipt += "Change\t\t\t" + change + " PHP\n";
        receipt += "-----------------------------\n";
        receipt += "Thank you for your order!";

        // Display official receipt
        JOptionPane.showMessageDialog(null, receipt);
    }
}