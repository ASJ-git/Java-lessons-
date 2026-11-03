import java.util.Scanner;

void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the radius of the circle in meters: ");

    int r = input.nextInt();

    double a = areaOfCircle(r);

    System.out.println("The area of the circle is: " + Math.round(a) + " m²");

    input.close();
}

public static double areaOfCircle(double radius) {
    double areaValue = Math.PI * radius * radius;

    return areaValue;

}