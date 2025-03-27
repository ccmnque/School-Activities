import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Customer {
    static int MAX = 10, index = 0;
    static int[] customer_id = new int[MAX];
    static String[] customer_name = new String[MAX];
    static String[] customer_gender = new String[MAX];
    static int[] customer_age = new int[MAX];

    public static void main(String[] args) throws Exception {
        String[] menu = { "[A]dd Customer", "[V]iew Customer", "[S]earch Customer", "[E]dit Customer",
                "[D]elete Customer", "[E]nd" };
        String choice = "";

        while (!choice.equals("[E]nd"))

        {
            choice = JOptionPane.showInputDialog(null, "Please Select", choice, 1, null, menu, menu[0]).toString();
            switch (choice) {
                case "[A]dd Customer":
                    addCustomer();
                    break;
                case "[V]iew Customer":
                    viewCustomer();
                    break;
                case "[S]earch Customer":
                    int indexRef = searchCustomer();
                    if (indexRef != -1) {
                        JTextArea textArea = new JTextArea();
                        textArea.setText(String.format(
                                """
                                        Customer's Info
                                        ID\tName\tAge\tGender
                                        %d\t%s\t%s\t%d
                                        """,
                                customer_id[indexRef],
                                customer_name[indexRef],
                                customer_gender[indexRef],
                                customer_age[indexRef]));
                        JOptionPane.showMessageDialog(null, textArea, "Results", 1);
                    } else {
                        JOptionPane.showMessageDialog(null, "Customer NOT found!", "Not found!", 0);
                    }
                    break;
                case "[E]dit Customer":
                    editCustomer();
                    break;
                case "[D]elete Customer":
                    deleteCustomer();
                    break;
            }
        }
    }

    public static void addCustomer() {
        customer_id[index] = Integer.parseInt(JOptionPane.showInputDialog("Customer Id: "));
        customer_name[index] = JOptionPane.showInputDialog("Customer Name: ");
        customer_age[index] = Integer.parseInt(JOptionPane.showInputDialog("Customer Age: "));
        customer_gender[index] = JOptionPane.showInputDialog("Customer Gender: ");
        JOptionPane.showMessageDialog(null, "Added new customer successfully");
        index++;
    }

    public static void viewCustomer() {
        String all = "Customer's Info\nID\tName\tAge\tGender\n";
        for (int x = 0; x < index; x++) {
            if (customer_id[x] != -1)
                all = all + customer_id[x] + "\t" + customer_name[x] + "\t" + customer_age[x] + "\t"
                        + customer_gender[x] + "\n";
        }
        JOptionPane.showMessageDialog(null, new JTextArea(all));
    }

    public static int searchCustomer() {
        String name = JOptionPane.showInputDialog("Enter Customer Name to search: ").toLowerCase();
        for (int i = 0; i < customer_name.length; i++) {
            if (name.equals(customer_name[i].toLowerCase())) {
                return i;
            }
        }
        return -1;
    }

    public static void editCustomer() {
        int indexRef = searchCustomer();
        if (indexRef != -1) {
            customer_name[indexRef] = JOptionPane.showInputDialog("New Customer Name: ");
            customer_age[indexRef] = Integer.parseInt(JOptionPane.showInputDialog("New Customer Age: "));
            customer_gender[indexRef] = JOptionPane.showInputDialog("New Customer Gender: ");
            JOptionPane.showMessageDialog(null, "Customer Edited");
        } else {
            JOptionPane.showMessageDialog(null, "Customer NOT found", "Not found", 0);
        }
    }

    public static void deleteCustomer() {
        int indexRef = searchCustomer();
        if (indexRef != -1) {
            customer_id[indexRef] = -1;
            customer_name[indexRef] = "";
            customer_age[indexRef] = -1;
            customer_gender[indexRef] = "";
            JOptionPane.showMessageDialog(null, "Deleted customer successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Customer NOT found", "Not found", 0);
        }
    }
}