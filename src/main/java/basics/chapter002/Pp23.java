package basics.chapter002;

import java.util.Scanner;

// PP 2.3 Write a program that reads three floating point numbers and
// prints the cube of their average.
public class Pp23 {
    public static void main (String[] args){
        float a, b, c, average, cube;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number: ");
        a = scan.nextFloat();
        System.out.println("enter second number: ");
        b = scan.nextFloat();
        System.out.println("enter third number: ");
        c = scan.nextFloat();
        average = (a + b + c) / 3;
        System.out.println(average * average * average);
    }
}
