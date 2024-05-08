package basics.chapter003;

import java.util.Scanner;
public class Pp36 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final double PI = Math.PI;

        System.out.print("Enter the radius: ");
        double radius = scan.nextDouble();

        double volume = (4 /3) * PI * Math.pow(radius, 3);
        double surfaceArea = 4 * PI * Math.pow(radius, 2);

        System.out.printf("The Volume is %.4f\n", volume);
        System.out.printf("The Surface Area is %.4f", surfaceArea);
    }
}
