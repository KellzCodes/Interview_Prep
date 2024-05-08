package basics.chapter003;

import java.util.Scanner;

/**
 * Write a program that reads a floating point value (double) and prints the closest whole numbers
 * less than and greater than that value. For example, if the number is 28.466, the program
 * would print 28 and 29.
 */
public class Pp34 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // Prompt the user for a floating-point number
        System.out.print("Enter a floating point value: ");
        double num = scan.nextDouble();

        // Calculate the floor and ceiling values
        double greater = Math.ceil(num);
        double less = Math.floor(num);

        // Output the closest whole numbers
        System.out.println(greater);
        System.out.println(less);
    }
}
