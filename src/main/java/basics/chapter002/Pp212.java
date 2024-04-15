package basics.chapter002;

import java.util.Scanner;

// PP 2.12 Write a program that prompts for and reads two integers representing
// the length and breadth of a rectangle, then prints its
// perimeter and area.
public class Pp212 {
    public static void main (String[] args){
        int length, breadth, perimeter, area;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        length = scan.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        breadth = scan.nextInt();

        perimeter = 2 * (length + breadth);
        area = length * breadth;

        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The area of the rectangle is: " + area);
    }
}
