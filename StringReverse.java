public class StringReverse {
    
    public String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    
    public boolean isPalindrome(String str) {
        String reversed = reverse(str);
        return str.equals(reversed);
    }
    
    public static void main(String[] args) {
        StringReverse manipulator = new StringReverse();
        String str = "racecar";
        System.out.println("reverse : " + manipulator.reverse(str));
        System.out.println("isPalindrome : " + manipulator.isPalindrome(str));
    }
}
