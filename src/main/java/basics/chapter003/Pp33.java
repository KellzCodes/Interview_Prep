package basics.chapter003;

import java.util.Random;

/**
 * Write a program that creates and prints a random phone number of the form XXX–XXX–XXXX.
 * Include the dashes in the output. Do not let the first three digits contain an 8 or 9
 * (but don’t be more restrictive than that), and make sure that the second set of three
 * digits is not greater than 655. Hint: Think through the easiest way to construct the
 * phone number. Each digit does not have to be determined separately.
 */
public class Pp33 {
    public static void main(String[] args){
        Random random = new Random();

        // Generate the first part of the phone number (Area code) without 8 or 9
        int firstDigit = random.nextInt(7) + 1;  // 1 to 7 (Cannot be 0 as the first digit)
        int secondDigit = random.nextInt(8); // 0 to 7
        int thirdDigit = random.nextInt(8); // 0 to 7

        // Format the area code
        int areaCode = 100 * firstDigit + 10 * secondDigit + thirdDigit;

        // Generate the second part of the phone number
        int middleThree = random.nextInt(556) + 100;  // 100 to 655

        // Generate the third part of the phone number (Line number)
        int lineNumber = random.nextInt(9000) + 1000; // 1000 to 9999

        // Format and print the phone number
        System.out.println(areaCode + "-" + middleThree + "-" + lineNumber);
    }
}
