package basics.chapter003;

import java.util.Scanner;

/**
 * Write a program that reads the lengths of the sides of a triangle from the user.
 * Compute the area of the triangle using Heron’s formula, in which s represents
 * half of the perimeter of the triangle and a, b, and c represent the lengths of the
 * three sides. Print the area to three decimal places.
 */
public class Pp37 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length of the first side of the triangle: ");
        double a = scan.nextDouble();

        System.out.print("Enter the length of the second side of the triangle: ");
        double b = scan.nextDouble();

        System.out.print("Enter the length of the third side of the triangle: ");
        double c = scan.nextDouble();

        double perimeter = a + b + c;
        double s = perimeter / 2;

        double firstNum = s - a;
        double secondNum = s - b;
        double thirdNum = s - c;

        double area = Math.sqrt(s * firstNum * secondNum * thirdNum);

        System.out.printf("The Area of the triangle is %.3f", area);
    }
}
