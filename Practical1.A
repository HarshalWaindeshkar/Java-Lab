import java.util.*;

public class Practical1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int lottery = 10 + random.nextInt(90);
        System.out.print("Enter your two-digit number: ");
        int guess = sc.nextInt();

        int l1 = lottery / 10;
        int l2 = lottery % 10;
        int g1 = guess / 10;
        int g2 = guess % 10;

        System.out.println("Lottery number: " + lottery);

        if (guess == lottery) {
            System.out.println("Exact match! Win 10,000");
        } else if (g1 == l2 && g2 == l1) {
            System.out.println("Digits match! Win 3,000");
        } else if (g1 == l1 || g1 == l2 || g2 == l1 || g2 == l2) {
            System.out.println("One digit match! Win 1,000");
        } else {
            System.out.println("No match.");
        }
        sc.close();
    }
}
