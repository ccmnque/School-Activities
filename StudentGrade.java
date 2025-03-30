import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

class StudentGrade {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter student's name:");
        String course = JOptionPane.showInputDialog("Enter student's course:");
        String subject = JOptionPane.showInputDialog("Enter subject:");

        double firstGrade = Double.parseDouble(JOptionPane.showInputDialog("Enter grade for the first exam:"));
        double secondGrade = Double.parseDouble(JOptionPane.showInputDialog("Enter grade for the second exam:"));
        double thirdGrade = Double.parseDouble(JOptionPane.showInputDialog("Enter grade for the third exam:"));
        double fourthGrade = Double.parseDouble(JOptionPane.showInputDialog("Enter grade for the fourth exam:"));

        double average = (firstGrade + secondGrade + thirdGrade + fourthGrade) / 4;

        String evaluation = (average >= 75) ? "PASSED" : "FAILED";

        JOptionPane.showMessageDialog(null, "Average grade: " + average + "\nEvaluation: " + evaluation);

        String studentInfo = "Name: " + name + "\nCourse: " + course + "\nSubject: " + subject + "\nAverage Grade: " + average + "\nEvaluation: " + evaluation;

        try {
            FileWriter fileWriter = new FileWriter("Student.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(studentInfo);
            printWriter.close();
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}