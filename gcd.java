import java.util.Scanner;

     void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("First number: ");
        int x = input.nextInt();
        System.out.println("Second number: ");
        int y = input.nextInt();

        int gcdResult = gcdFinder(x, y);
        int lcmResult = lcmFinder(x, y);

        System.out.println("The gcd is: " + gcdResult);
        System.out.println("The lcm is: " + lcmResult);
        input.close();
    }

    public static int gcdFinder(int x, int y) {
        return y == 0 ? x : gcdFinder(y, x % y);
    }

    public static int lcmFinder(int x, int y) {
        return (x * y) / gcdFinder(x, y);
    }


