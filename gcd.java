import java.util.Scanner;

void main(String[] args) {
    Scanner input = new Scanner(System.in);

    IO.println("First number: ");
    int x = input.nextInt();
    IO.println("Second number: ");
    int y = input.nextInt();

    int gcdResult = gcdFinder(x, y);
    int lcmResult = lcmFinder(x, y);

    IO.println("The gcd is: " + gcdResult);
    IO.println("The lcm is: " + lcmResult);
    input.close();
}

public static int gcdFinder(int x, int y) {
    return y == 0 ? x : gcdFinder(y, x % y);
}

public static int lcmFinder(int x, int y) {
    return (x * y) / gcdFinder(x, y);
}
