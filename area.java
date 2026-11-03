import java.util.Scanner;

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle in meters: ");

        int r = input.nextInt();

        double areaOfCircle = Math.PI * r * r;

        System.out.println("The area of the circle is: " + Math.round(areaOfCircle) + " m²");

        input.close();
    }

