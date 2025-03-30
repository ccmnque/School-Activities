import javax.swing.JOptionPane;

public class EvenNums {
   public static void main(String[] args) {
       
       // Using for loop
       String output1 = "Even numbers from 1 to 50 using for loop:\n";
       for (int i = 2; i <= 50; i += 2) {
           output1 += i + " ";
       }
       JOptionPane.showMessageDialog(null, output1);
       
       // Using while loop
       String output2 = "Even numbers from 1 to 50 using while loop:\n";
       int j = 2;
       while (j <= 50) {
           output2 += j + " ";
           j += 2;
       }
       JOptionPane.showMessageDialog(null, output2);
       
       // Using do-while loop
       String output3 = "Even numbers from 1 to 50 using do-while loop:\n";
       int k = 2;
       do {
           output3 += k + " ";
           k += 2;
       } while (k <= 50);
       JOptionPane.showMessageDialog(null, output3);
   }
}