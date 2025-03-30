import javax.swing.JOptionPane;

class DevelopmentalTask {

    public static void main(String[] args) {
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age: "));
        String stage = "";
        if (age >= 0 && age <= 5) {
            stage = "Infancy and Early Childhood";
        } else if (age >= 6 && age <= 12) {
            stage = "Middle Childhood";
        } else if (age >= 13 && age <= 17) {
            stage = "Adolescence";
        } else if (age >= 18 && age <= 35) {
            stage = "Early Adulthood";
        } else if (age >= 36 && age <= 60) {
            stage = "Middle Age";
        } else if (age > 60) {
            stage = "Later Maturity";
        } else {
            JOptionPane.showMessageDialog(null, "Invalid age!");
            System.exit(0);
        }
        JOptionPane.showMessageDialog(null, "The developmental task for age " + age + " is: " + stage);
    }
}