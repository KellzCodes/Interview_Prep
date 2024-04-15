package basics.chapter002;

import java.util.Scanner;

// PP 2.8 Write a program that reads values representing the weight in
// kilograms, grams, and milligrams and then prints the equivalent
// weight in milligrams. (For example, 1 kilogram, 50 grams, and
// 42 milligrams is equivalent to 10,50,042 milligrams.)
public class Pp28 {
    public static void main (String[] args){
        int kilograms, grams, milligrams;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of kilograms: ");
        kilograms = scan.nextInt();
        System.out.print("Enter number of grams: ");
        grams = scan.nextInt();
        System.out.print("Enter number of milligrams: ");
        milligrams = scan.nextInt();
        int kgToMg = kilograms * 1000000;
        int gToMg = grams * 1000;
        int totalMilligrams = kgToMg + gToMg + milligrams;
        System.out.println("The total weight in milligrams is: " + totalMilligrams);
    }
}
