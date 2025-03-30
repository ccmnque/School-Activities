import javax.swing.JOptionPane;
class NestedIf {
    
    public static void main(String[] args) {
        String day = JOptionPane.showInputDialog(null, "What day is it today?");
        String weather = JOptionPane.showInputDialog(null, "What is the weather like today?");

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Thursday")) {
            JOptionPane.showMessageDialog(null, "You have school today.");
        } else if (day.equals("Wednesday")) {
            JOptionPane.showMessageDialog(null, "You have school and a date today.");
        } else if (day.equals("Friday")) {
            JOptionPane.showMessageDialog(null, "You have school and a party today.");
        } else if (day.equals("Saturday")) {
            JOptionPane.showMessageDialog(null, "You should go bonding with friends today.");
        } else if (day.equals("Sunday")) {
            JOptionPane.showMessageDialog(null, "You should go to church and have family bonding today.");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid input for day of the week.");
        }

        if (weather.equals("Sunny")) {
            JOptionPane.showMessageDialog(null, "Bring a hat or umbrella.");
        } else if (weather.equals("Rainy")) {
            JOptionPane.showMessageDialog(null, "Bring an umbrella or raincoat.");
        } else if (weather.equals("Gloomy")) {
            JOptionPane.showMessageDialog(null, "Ride a taxi.");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid input for weather.");
        }
    }
}