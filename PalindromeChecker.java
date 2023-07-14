import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        if(isPalindrome(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
    public static boolean isPalindrome(String s) {
        if(s == null || s.length() == 0){
            return false;
        }
        if(s.length() == 1) {
            return true;
        }
        return isPalindromeHelper(s, 0, s.length()-1);

    }
    public static boolean isPalindromeHelper(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return isPalindromeHelper(s, start + 1, end - 1);
    }
}