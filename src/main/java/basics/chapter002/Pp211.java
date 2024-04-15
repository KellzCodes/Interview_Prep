package basics.chapter002;

// PP 2.11 Write a program that prompts for and reads a double value representing a monetary amount.
// Then determine the fewest number
// of each bill and coin needed to represent that amount, starting
// with the highest (assume that a ten-dollar bill is the maximum
// size needed). For example, if the value entered is 47.63 (fortyseven dollars and sixty-three cents),
// then the program should
// print the equivalent amount as:
// 4 ten dollar bills
// 1 five dollar bills
// 2 one dollar bills
// 2 quarters
// 1 dimes
// 0 nickles
// 3 pennies

import java.util.Scanner;

public class Pp211 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a monetary amount: ");
        double amount = scan.nextDouble();

        int totalCents = (int) Math.round(amount * 100);

        int tenDollarBills = totalCents / 1000;
        totalCents %= 1000;

        int fiveDollarBills = totalCents / 500;
        totalCents %= 500;

        int oneDollarBills = totalCents / 100;
        totalCents %= 100;

        int quarters = totalCents / 25;
        totalCents %= 25;

        int dimes = totalCents / 10;
        totalCents %= 10;

        int nickels = totalCents / 5;
        totalCents %= 5;

        int pennies = totalCents;

        System.out.println("Your amount consists of:\n" +
                tenDollarBills + " ten dollar bills\n" +
                fiveDollarBills + " five dollar bills\n" +
                oneDollarBills + " one dollar bills\n" +
                quarters + " quarters\n" +
                dimes + " dimes\n" +
                nickels + " nickels\n" +
                pennies + " pennies\n");

        scan.close();
    }
}
