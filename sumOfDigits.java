import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = sumOfDigits(num);
        System.out.println("Result: " + result);
    }

    public static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        }

        return n % 10 + sumOfDigits(n / 10);
    }
}