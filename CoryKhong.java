import javax.swing.JOptionPane;
class CoryKhong {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter the number of hair strands:");
        int numStrands = Integer.parseInt(input);

        double totalLengthCm = 0;
        for (int i = 1; i <= numStrands; i++) {
            input = JOptionPane.showInputDialog(null, "Enter the length of hair strand " + i + " in cm:");
            double strandLengthCm = Double.parseDouble(input);
            totalLengthCm += strandLengthCm;
        }

        String output = "\nCory Khong's hair strands and their lengths:\n";
        for (int i = 1; i <= numStrands; i++) {
            input = JOptionPane.showInputDialog(null, "Enter the length of hair strand " + i + " in cm:");
            output += "Hair strand " + i + ": " + input + " cm\n";
        }

        double totalLengthKm = totalLengthCm / 100000;
        double totalLengthMiles = totalLengthCm * 0.0000062137;

        output += "\nTotal hair length:\n";
        output += "In km: " + totalLengthKm + " km\n";
        output += "In miles: " + totalLengthMiles + " miles";

        JOptionPane.showMessageDialog(null, output);
        
    }
}