package basics.chapter003;

import java.util.Random;

/**
 * Write a program that generates a random integer radius (r) and height (h)
 * for a cylinder in the range 1 to 20, inclusive, and then computes the
 * volume and surface area of the cylinder.
 */
public class Pp39 {
    public static void main(String[] args){
        Random random = new Random();

        int radius = random.nextInt(1, 21);
        int height = random.nextInt(1, 21);

        double pi = Math.PI;

        double volume = pi * Math.pow(radius, 2) * height;
        double surfaceArea = 2 * pi * radius * height;

        System.out.println("The radius of the cylinder is " + radius);
        System.out.println("The height of the cylinder is " + height);
        System.out.println("The volume of the cylinder is " + volume);
        System.out.println("The surface area of the cylinder is " + surfaceArea);
    }
}
