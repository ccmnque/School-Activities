import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class StudentGradeIS {
    static String columns[] = {
        "Subjet", "Schedule", "Units", "Time", "1st", "2nd",
        "3rd", "4th", "Average", "Point Grade", "Letter Grade", "Remarks"
    };
    static int totalSubjects = 0;
    static float totalUnits = 0;
    static int subjectsPassed = 0;
    static int subjectsFailed = 0;
    static int totalDropped = 0;
    static int totalLetter[] = new int[6];
    static JTextArea textArea = new JTextArea();

    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(new FileReader("StudentGrade.txt"));
        String hold = "", all="";
        while(read.hasNext()) {
            hold +=read.nextLine()+"\n;"
        } // end of while loop

        TextAreaInit();
        FileInit();
        StatsGenerator();
        JOptionPane.showMessageDialog(textArea, textArea, "Results", 1);
    }

    static void TextAreaInit() {
        for (int i = 0; i < columns.length; i++) {
            if (i == columns.length - 1) {
                textArea.append(columns[i] + "\n");
            } else {
                textArea.append(columns[i] + "\t");
            }
        }
    }
                
                for (int i = 0; i < grades.length; i++) {
                    grades[i] = scn.nextFloat();
                }
                for (int i = 0; i < grades.length; i++) {
                    textArea.append(grades[i] + "\t");
                }

                totalSubjects++;
                totalUnits += units;
                average = AverageCalculator(grades);

                textArea.append(String.format("%.2f\t", average));
                textArea.append(String.format("%.1f\t", PointGradeCalculator(average)));
                textArea.append(LetterGradeCalculator(average) + "\t");
                textArea.append(RemarksGenerator(average) + "\n");
            }
            scn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void StatsGenerator() {
        textArea.append(
            String.format(
                """
                
                # Of Subjects\t: %d
                Units Earned\t: %.1f

                Passed\t: %d
                Failed\t: %d
                Dropped\t: %d

                A\t: %d
                B\t: %d
                C\t: %d
                D\t: %d
                E\t: %d
                F\t: %d
                
                """

                totalUnits,
                subjectsPassed,
                subjectsFailed,
                totalDropped,
                totalLetter[0],
                totalLetter[1],
                totalLetter[2],
                totalLetter[3],
                totalLetter[4],
                totalLetter[5]
            )
        );
    }

    static float AverageCalculator(float grades[]) {
        float sum = 0f;
        int length = grades.length;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum / length;
    }

    static float PointGradeCalculator(float average) {
        float result = 0;
        if (average >= 21 && average <= 74) {
            result = 5f;
        } else if (average >= 0 && average <= 20) {
            result = 9f;
        } else {
            result = ((100 - average) + 10) / 10;
        }
        return result;
    }

    static String LetterGradeCalculator(float grade) {
        String result = "";
        if (grade >= 0 && grade <= 20) {
            result = "F";
            totalLetter[5]++;
        } else if (grade >= 21 && grade <= 59) {
            result = "E";
            totalLetter[4]++;
        } else if (grade >= 60 && grade <= 74) {
            result = "D";
            totalLetter[3]++;
        } else if (grade >= 75 && grade <= 79) {
            result = "C";
            totalLetter[2]++;
        } else if (grade >= 80 && grade <= 89) {
            result = "B";
            totalLetter[1]++;
        } else if (grade >= 90 && grade <= 100) {
            result = "A";
            totalLetter[0]++;
        } else {
            result = "Out of bounds.";
        }
        return result;
    }

    static String RemarksGenerator(float grade) {
        String result = "";
        if (grade >= 0 && grade <= 20) {
            result = "Dropped";
            totalDropped++;
        } else if (grade >= 21 && grade <= 74) {
            result = "Failed";
            subjectsFailed++;
        } else if (grade >= 75 && grade <= 100) {
            result = "Passed";
            subjectsPassed++;
        } else {
            result = "Out of bounds.";
        }
        return result;
    }
}