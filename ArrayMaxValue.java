import javax.swing.JOptionPane;

public class ArrayMaxValue {
    public static void main(String[] args) {
        // Cecilia Aljune E. Munasque
        System.out.println("Cecilia Aljune E. Munasque");
        
        int maxCapacity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter max capacity:"));
        int[] numbers = new int[maxCapacity];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input integer:"));
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // results
        JOptionPane.showMessageDialog(null, "The lowest is " + min);
        JOptionPane.showMessageDialog(null, "The highest is " + max);

    }

}
