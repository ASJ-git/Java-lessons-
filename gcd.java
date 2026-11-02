import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("First number: ");
        int x = input.nextInt();
        System.out.println("Second number: ");
        int y = input.nextInt();

        int result = gcdFinder(x, y);

        System.out.println("The gcd is: " + result);
        input.close();
    }

    public static int gcdFinder(int x, int y) {
        return y == 0 ? x : gcdFinder(y, x % y);
    }
}
