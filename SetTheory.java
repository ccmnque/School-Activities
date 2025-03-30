import javax.swing.JOptionPane;
import java.util.*;

public class SetTheory {
    // Method to perform Union operation on two sets
    public static Set<String> union(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }
    
    // Method to perform Union All operation on two sets
    public static String unionAll(Set<String> set1, Set<String> set2) {
        StringBuilder sb = new StringBuilder();
        for (String s : set1) {
            sb.append(s).append(" ");
        }
        for (String s : set2) {
            sb.append(s).append(" ");
        }
        return sb.toString();
    }
    
    // Method to perform Intersection operation on two sets
    public static Set<String> intersection(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }
    
    // Method to perform Difference operation on two sets
    public static Set<String> difference(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }
    
    // Method to perform Complement operation on two sets
    public static Set<String> complement(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }
    
    // Method to perform Symmetric Difference operation on two sets
    public static Set<String> symmetricDifference(Set<String> set1, Set<String> set2) {
        Set<String> union = union(set1, set2);
        Set<String> intersection = intersection(set1, set2);
        return difference(union, intersection);
    }

    public static void main(String[] args) {
        // Create two sets of strings
        Set<String> set1 = new HashSet<>(Arrays.asList("chocolate", "rocky road", "ube", "double dutch", "vanilla"));
        Set<String> set2 = new HashSet<>(Arrays.asList("vanilla", "pistachio", "chocolate", "strawberry", "ube"));
        
        // Call the set theory methods and display the results using JOptionPane
        String message = "Set 1: " + set1 + "\nSet 2: " + set2;
        JOptionPane.showMessageDialog(null, message);
        
        Set<String> unionResult = union(set1, set2);
        message = "Union: " + unionResult;
        JOptionPane.showMessageDialog(null, message);
        
        String unionAllString = unionAll(set1, set2);
        message = "Union All: " + unionAllString;
        JOptionPane.showMessageDialog(null, message);
        
        Set<String> intersectionResult = intersection(set1, set2);
        message = "Intersection: " + intersectionResult;
        JOptionPane.showMessageDialog(null, message);
        
        Set<String> differenceResult = difference(set1, set2);
        message = "Difference (Set 1 - Set 2): " + differenceResult;
        JOptionPane.showMessageDialog(null, message);
        
        Set<String> complementResult = complement(set1, set2);
        message = "Complement (Set 1 \\ Set 2): " + complementResult;
        JOptionPane.showMessageDialog(null, message);
        
        Set<String> symmetricDifferenceResult = symmetricDifference(set1, set2);
        message = "Symmetric Difference: " + symmetricDifferenceResult;
        JOptionPane.showMessageDialog(null, message);
    }
}