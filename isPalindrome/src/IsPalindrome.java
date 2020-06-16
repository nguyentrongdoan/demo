import java.util.Scanner;

public class IsPalindrome {
    public static void isPalindrome(String text) {
        double a = text.length();
        String start = text.substring(0, (int) Math.floor(a / 2)).toLowerCase();
        String end = text.substring((int) (a - Math.floor(a / 2))).toLowerCase();
        System.out.println(start);
        System.out.println(end);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter string: ");
        String N = input.nextLine();
        isPalindrome(N);
    }
}
