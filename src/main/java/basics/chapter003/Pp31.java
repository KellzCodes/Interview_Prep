package basics.chapter003;

import java.util.Random;
import java.util.Scanner;

/**
 * Write a program that prompts for and reads the user’s first and last name (separately).
 * Then print a string composed of the first letter of the user’s first name, followed
 * by the first five characters of the user’s last name, followed by a random number
 * in the range 10 to 99. Assume that the last name is at least five letters long.
 * Similar algorithms are sometimes used to generate usernames for new computer
 * accounts.*/

public class Pp31 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        // Prompt for and read the user's first name
        System.out.print("Please enter your first name: ");
        String firstName = scan.nextLine();

        // Prompt for and read the user's last name
        System.out.print("Please enter your last name: ");
        String lastName = scan.nextLine();

        // Ensure the last name is at least five characters long
        while (lastName.length() < 5) {
            System.out.println("Last name must be at least 5 characters long.");
            System.out.print("Please re-enter your last name: ");
            lastName = scan.nextLine();
        }

        // Get the first letter of the first name
        char firstInitial = firstName.charAt(0);

        // Get the first five characters of the last name
        String firstFiveLastName = lastName.substring(0, 5);

        // Generate a random number between 10 and 99
        int randomNumber = random.nextInt(90) + 10;

        // Construct the username
        String username = firstInitial + firstFiveLastName + randomNumber;

        // Output the generated username
        System.out.println("Generated username: " + username);
    }
}
