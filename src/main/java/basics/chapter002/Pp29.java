package basics.chapter002;

import java.util.Scanner;

// PP 2.9 Create a version of the previous project that reverses the computation. That is, read a value representing the weight in milligrams, then print the equivalent weight as a combination of
// kilograms, grams, and milligrams. (For example, 90,70,056
// milligrams is equivalent to 9 kilograms, 70 grams, and
// 56 milligrams.)
public class Pp29 {
    public static void main(String[] args){
        int totalMilligrams, kilograms, remainingMilligrams, grams, milligrams;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the weight in milligrams:");
        totalMilligrams = scan.nextInt();

        // calculate kilograms
        kilograms = totalMilligrams / 1000000;
        remainingMilligrams = totalMilligrams % 1000000;

        // calculate grams
        grams = remainingMilligrams / 1000;
        remainingMilligrams = remainingMilligrams % 1000;

        // remaining milligrams are already appropriate unit
        milligrams = remainingMilligrams;

        System.out.println(totalMilligrams + " is equivalent to " + kilograms +
                " kilograms " + grams + " grams and " + milligrams + " milligrams.");
    }
}
