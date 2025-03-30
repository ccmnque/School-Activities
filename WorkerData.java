import javax.swing.JOptionPane;
class WorkerData {
   public static void main(String[] args){
    String ratePerHour = JOptionPane.showInputDialog(null, "Enter Rate Per Hour: ");
    String hours_worked = JOptionPane.showInputDialog(null, "Enter Hours Worked: ");
    String numAbsences = JOptionPane.showInputDialog(null, "Enter Number of Absences: ");
    String numLate = JOptionPane.showInputDialog(null, "Enter Number of Lateness: ");

    double rate, hours, absences, late;

    rate = Double.parseDouble(ratePerHour);
    hours = Double.parseDouble(hours_worked);
    absences = Double.parseDouble(numAbsences);
    late = Double.parseDouble(numLate);

    double SSS = 175.89; 
    double PhilHealth = 300;
    double totalAbsences = absences * 5.75;
    double totalLate = late * 3.25;

    double gross = (rate * hours);
    double totalDeduction = (totalAbsences + totalLate + SSS + PhilHealth);
    double net = (rate * hours) - totalDeduction; 

    JOptionPane.showMessageDialog(null, "Your gross pay is Php" + gross + 
    "\nYour net pay is Php" + net);

   } 
}
