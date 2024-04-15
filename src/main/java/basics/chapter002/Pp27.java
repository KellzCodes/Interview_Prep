package basics.chapter002;

import java.util.Scanner;

// PP 2.7 Write a program that prompts for and reads integer values for
// typing speed and number of characters in the document, then
// prints the time required to type them as a floating point result.
public class Pp27 {
    public static void main (String[] args){
        int speed, num;
        float time;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your typing speed: ");
        speed = scan.nextInt();
        System.out.println("Enter number of characters in document: ");
        num = scan.nextInt();
        time = (float) num / speed;
        System.out.println("The time required to type the document is " + time + " minutes.");
        scan.close();
    }
}
