import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;

class SalesTracker {
    public static void main(String[] args) {
        double[] sales = new double[12];

        for (int i = 0; i < 12; i++) {
            String input = JOptionPane.showInputDialog(null, "Enter sales for " + getMonthName(i) + ":");
            double amount = Double.parseDouble(input);
            sales[i] = amount;
        }

        // Write the sales data to a text file
        try {
            FileWriter writer = new FileWriter("Sales.txt");
            for (int i = 0; i < 12; i++) {
                writer.write(getMonthName(i) + ": " + sales[i] + "\n");
            }
            writer.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error writing to file.");
        }

        JOptionPane.showMessageDialog(null, "Sales data saved to Sales.txt.");
    }

    public static String getMonthName(int index) {
        switch (index) {
            case 0:
                return "January";
            case 1:
                return "February";
            case 2:
                return "March";
            case 3:
                return "April";
            case 4:
                return "May";
            case 5:
                return "June";
            case 6:
                return "July";
            case 7:
                return "August";
            case 8:
                return "September";
            case 9:
                return "October";
            case 10:
                return "November";
            case 11:
                return "December";
            default:
                return "";
        }
    }
}