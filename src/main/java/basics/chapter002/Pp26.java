package basics.chapter002;

import java.util.Scanner;

// PP 2.6 Write a program that converts grams to pounds. (One pound
// equals 453.592 grams.) Read the grams value from the user as a
// floating point value.
public class Pp26 {
    public static void main(String[] args){
        float grams;
        double pounds;
        final double CONVERSION = 453.592;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of grams: ");
        grams = scan.nextInt();
        pounds = grams / CONVERSION;
        System.out.println("Number of grams: " + grams);
        System.out.println("Equivalent in pounds: " + pounds);
        scan.close();
    }
}
