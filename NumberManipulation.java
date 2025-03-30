public class NumberManipulation {
    
    public boolean isNegative(int num) {
        return num < 0;
    }
    
    public boolean isPositive(int num) {
        return num > 0;
    }
    
    public String Odd(int num) {
        if (num % 2 == 1) {
            return "Yes";
        } else {
            return "No";
        }
    }
    
    public String Even(int num) {
        if (num % 2 == 0) {
            return "Yes";
        } else {
            return "No";
        }
    }
    
    public static void main(String[] args) {
        
        NumberManipulation manipulator = new NumberManipulation();
        
        int num = 4;
        System.out.println("isNegative : " + manipulator.isNegative(num));
        System.out.println("isPositive : " + manipulator.isPositive(num));
        System.out.println("Odd : " + manipulator.Odd(num));
        System.out.println("Even : " + manipulator.Even(num));
    }
}