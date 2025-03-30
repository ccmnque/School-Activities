import javax.swing.JOptionPane;

public class TableOfSquares {
    public static void main(String[] args) {
        
        // for loop
        String output1 = "Squared values from 1 to 20 using for loop:\n";
        for (int i = 1; i <= 20; i++) {
            output1 += i + "^2 = " + (i * i) + "\n";
        }
        JOptionPane.showMessageDialog(null, output1);
        
        // while loop
        String output2 = "Squared values from 1 to 20 using while loop:\n";
        int j = 1;
        while (j <= 20) {
            output2 += j + "^2 = " + (j * j) + "\n";
            j++;
        }
        JOptionPane.showMessageDialog(null, output2);
        
        // do-while loop
        String output3 = "Squared values from 1 to 20 using do-while loop:\n";
        int k = 1;
        do {
            output3 += k + "^2 = " + (k * k) + "\n";
            k++;
        } while (k <= 20);
        JOptionPane.showMessageDialog(null, output3);
    }
}