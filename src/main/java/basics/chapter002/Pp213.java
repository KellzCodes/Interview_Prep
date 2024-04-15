package basics.chapter002;

// PP 2.13 Write a program that prompts for and reads the circumference of
// a circle as a floating point value (double), then prints the radius
// of the circle.

import java.util.Scanner;

public class Pp213 {
    public static void main(String[] args){
        double circumference, radius;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter circumference of circle: ");
        circumference = scan.nextDouble();

        radius = circumference / (2 * Math.PI);

        System.out.println("The radius of the circle is " + radius);
    }
}
