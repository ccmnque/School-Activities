import javax.swing.JOptionPane;

public class SetOperations {

    public static void main(String[] args) {
        int A[] = {1, 2, 3};
        int B[] = {2, 3, 4};

        SetOperations set = new  SetOperations();
        set.union(A, B);
        
        // Get input from the user
        String inputA = JOptionPane.showInputDialog("Enter the elements of set A separated by commas:");
        String inputB = JOptionPane.showInputDialog("Enter the elements of set B separated by commas:");
        
        // Convert input to arrays of integers
        int[] setA = parseInput(inputA);
        int[] setB = parseInput(inputB);
        
        // Perform set operations
        int[] union = setUnion(setA, setB);
        int[] unionAll = setUnionAll(setA, setB);
        int[] intersection = setIntersection(setA, setB);
        int[] difference = setDifference(setA, setB);
        int[] complementA = setComplement(setA);
        int[] complementB = setComplement(setB);
        int[] symmetricDiff = setSymmetricDifference(setA, setB);
        
        // Display the output
        String output = "Set A: " + arrayToString(setA) + "\n" +
                        "Set B: " + arrayToString(setB) + "\n\n" +
                        "Union: " + arrayToString(union) + "\n" +
                        "Union All: " + arrayToString(unionAll) + "\n" +
                        "Intersection: " + arrayToString(intersection) + "\n" +
                        "Difference (A \\ B): " + arrayToString(difference) + "\n" +
                        "Complement of A: " + arrayToString(complementA) + "\n" +
                        "Complement of B: " + arrayToString(complementB) + "\n" +
                        "Symmetric Difference: " + arrayToString(symmetricDiff);
        JOptionPane.showMessageDialog(null, output);
    }
    
    // Helper method to parse input string to array of integers
    private static int[] parseInput(String input) {
        String[] elements = input.split(",");
        int[] result = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            result[i] = Integer.parseInt(elements[i].trim());
        }
        return result;
    }
    
    // Helper method to convert array of integers to string
    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
    
    // Method to compute union of two sets
    private static int[] setUnion(int[] setA, int[] setB) {
        int[] result = new int[setA.length + setB.length];
        int i = 0;
        for (int elem : setA) {
            result[i++] = elem;
        }
        for (int elem : setB) {
            if (!contains(setA, elem)) {
                result[i++] = elem;
            }
        }
        return trim(result, i);
    }
    
    // Method to compute union all of two sets
    private static int[] setUnionAll(int[] setA, int[] setB) {
        int[] result = new int[setA.length + setB.length];
        int i = 0;
        for (int elem : setA) {
            result[i++] = elem;
        }
    }
}