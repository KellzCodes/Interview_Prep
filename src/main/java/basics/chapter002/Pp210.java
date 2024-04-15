package basics.chapter002;

// PP 2.10 Write a program that determines the value of the coins in a jar and
// prints the total in dollars and cents. Read integer values that represent the
// number of quarters, dimes, nickels, and pennies.

import java.util.Scanner;

public class Pp210 {
    public static void main(String[] args){
        int quarters, dimes, nickels, pennies;
        int dollars;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of quarters: ");
        quarters = scan.nextInt();
        System.out.print("Enter number of dimes: ");
        dimes = scan.nextInt();
        System.out.print("Enter number of nickels: ");
        nickels = scan.nextInt();
        System.out.print("Enter number of pennies: ");
        pennies = scan.nextInt();

        int quarterToCents = quarters * 25;
        int dimesToCents = dimes * 10;
        int nickelsToCents = nickels * 5;

        int totalCents = quarterToCents + dimesToCents + nickelsToCents + pennies;

        dollars = totalCents / 100;
        int remainingCents = totalCents % 100;

        System.out.println("The total value of the coins is " + dollars + " dollars and " +
                remainingCents + " cents.");

        scan.close();
    }
}
