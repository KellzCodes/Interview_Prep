package basics.chapter003;

import java.util.Random;

/**
 * Write a program that generates a random integer in the range 20 to 40,
 * inclusive, and displays the sine, cosine, and tangent of that number.
 */
public class Pp38 {
    public static void main(String[] args){
        Random random = new Random();

        int num = random.nextInt(20, 41);

        System.out.println("The sine of " + num + " is " + Math.sin(num));
        System.out.println("The cosine of " + num + " is " + Math.cos(num));
        System.out.println("THe tangent of " + num + " is " + Math.tan(num));
    }
}
