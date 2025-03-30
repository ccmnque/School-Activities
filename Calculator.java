import javax.swing.JOptionPane;
public class Calculator {

   public static void main(String[] args) {
      String num1String = JOptionPane.showInputDialog(null, "Enter first number:");
      double num1 = Double.parseDouble(num1String);
      String num2String = JOptionPane.showInputDialog(null, "Enter second number:");
      double num2 = Double.parseDouble(num2String);

      double sum = num1 + num2;
      double diff = num1 - num2;
      double prod = num1 * num2;
      double quot = num1 / num2;

      String result = "Sum = " + sum + "\nDifference = " + diff + "\nProduct = " + prod + "\nQuotient = " + quot;
      JOptionPane.showMessageDialog(null, result);
      
   }
}