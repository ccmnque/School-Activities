import javax.swing.JOptionPane;

class PointGradeValidation {

    public static void main(String[] args) {
        String id = JOptionPane.showInputDialog("Enter your student ID:");
        String name = JOptionPane.showInputDialog("Enter your name:");
        String course = JOptionPane.showInputDialog("Enter your course:");
        String subject = JOptionPane.showInputDialog("Enter your subject:");
        String firstGradeStr = JOptionPane.showInputDialog("Enter your first grade:");
        double firstGrade = Double.parseDouble(firstGradeStr);
        String secondGradeStr = JOptionPane.showInputDialog("Enter your second grade:");
        double secondGrade = Double.parseDouble(secondGradeStr);
        String thirdGradeStr = JOptionPane.showInputDialog("Enter your third grade:");
        double thirdGrade = Double.parseDouble(thirdGradeStr);
        String fourthGradeStr = JOptionPane.showInputDialog("Enter your fourth grade:");
        double fourthGrade = Double.parseDouble(fourthGradeStr);
        double average = (firstGrade + secondGrade + thirdGrade + fourthGrade) / 4;
        double pointGrade = (100 - average + 10) / 10;
        String remarks = pointGrade >= 3.0 ? "Failed" : "Passed-" + (average >= 75? "Average" : "Below Average");

        // output
        String output = "Name: " + name + "\n"
                   + "Student ID: " + id + "\n"
                   + "Course: " + course + "\n"
                   + "Subject: " + subject + "\n"
                   + "Point - Grade: " + pointGrade;
        
        JOptionPane.showMessageDialog(null, output);
    }
}