package basics.chapter003;

import java.util.Scanner;

/**
 * Write a program that prints the sum of cubes. Prompt for and read two integer values
 * and print the sum of each value raised to the third power.
 */

public class pp32 {
    public static void main(String[] args){
        int first, second;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        first = scan.nextInt();

        System.out.print("Enter the second integer: ");
        second = scan.nextInt();

        int firstCube = (int) Math.pow(first, 3);
        int secondCube = (int) Math.pow(second, 3);

        int sumOfCubes = firstCube + secondCube;
        System.out.println(sumOfCubes);
    }
}
