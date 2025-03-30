import java.util.Scanner;

public class SumOfNOdd2 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Value of N: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        System.out.println("The sum of the first " + n + " squares is " + sum);
    }
}
