import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Value of N: ");
        int N = input.nextInt();

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i * i;
        }

        System.out.println("The sum of the squares of the integers from 1 to " + N + " is: " + sum);
    }
}
