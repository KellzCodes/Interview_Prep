package basics.chapter002;

import java.util.Scanner;

// PP 2.5 Create a version of the UnitConverter application to convert
// from inches to foot. Read the inches value from the user.
public class Pp25 {
    public static void main (String[] args){
        int inches;
        double feet;
        final double CONVERSION = 0.0833;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of inches: ");
        inches = scan.nextInt();
        feet = inches * CONVERSION;
        System.out.println("number of inches: " + inches);
        System.out.println("feet equivalent: " + feet);
    }
}
