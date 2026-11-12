import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else if (num == 2) {
            isPrime = true;
        } else if (num % 2 == 0) {
            isPrime = false;
        } else {
            int squareRoot = (int) Math.sqrt(num);
            for (int i = 3; i <= squareRoot; i += 2) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("The number is a prime number");
        } else {
            System.out.println("The number is not a prime number");
        }

        input.close();
    }
}

// Test Cases
// Input	   Expected
// -5,0,1      Not prime 
// 2           Prime 
// 4,100       Not prime 
// 9,25,49     Not prime
// 7,13,97     Prime